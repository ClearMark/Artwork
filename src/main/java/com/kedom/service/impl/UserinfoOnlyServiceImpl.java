package com.kedom.service.impl;

import com.kedom.annotation.RequestID;
import com.kedom.entity.UserinfoOnly;
import com.kedom.dao.UserinfoOnlyDao;
import com.kedom.service.UserinfoOnlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * (UserinfoOnly)表服务实现类
 *
 * @author makejava
 * @since 2022-07-13 22:26:24
 */
@Service("userinfoOnlyService")
public class UserinfoOnlyServiceImpl implements UserinfoOnlyService {
    @Resource
    private UserinfoOnlyDao userinfoOnlyDao;

    @Autowired
    private Jedis jedis;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    @RequestID
    public UserinfoOnly queryById(Integer uid) {
        return this.userinfoOnlyDao.queryById(uid);
    }

    /**
     * 分页查询
     *
     * @param userinfoOnly 筛选条件
     * @param pageRequest  分页对象
     * @return 查询结果
     */
    @Override
    public Page<UserinfoOnly> queryByPage(UserinfoOnly userinfoOnly, PageRequest pageRequest) {
        long total = this.userinfoOnlyDao.count(userinfoOnly);
        return new PageImpl<>(this.userinfoOnlyDao.queryAllByLimit(userinfoOnly, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param userinfoOnly 实例对象
     * @return 实例对象
     */
    @Override
    public UserinfoOnly insert(UserinfoOnly userinfoOnly) {
        this.userinfoOnlyDao.insert(userinfoOnly);
        return userinfoOnly;
    }

    /**
     * 修改数据
     *
     * @param userinfoOnly 实例对象
     * @return 实例对象
     */
    @Override
    public UserinfoOnly update(UserinfoOnly userinfoOnly) {
        this.userinfoOnlyDao.update(userinfoOnly);
        return this.queryById(userinfoOnly.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uid) {
        return this.userinfoOnlyDao.deleteById(uid) > 0;
    }

    public String  getLoginQRCode(String s) {
        jedis.setnx(s,"NotScanned");
        return "https://baidu.com/"+s;
    }

    public String  scannedLoginQRCode(String s) {
        String s1 = jedis.get(s);
        String reStr;
        if ("NotScanned".equals(s1)) {
            jedis.setnx(s, "ToBeConfirmed");
            reStr = "扫码成功";
        } else {
            reStr = "二维码已失效";
        }
        return reStr;
    }


}
