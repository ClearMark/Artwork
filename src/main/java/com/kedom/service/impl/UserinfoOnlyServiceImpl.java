package com.kedom.service.impl;

import com.kedom.entity.UserinfoOnly;
import com.kedom.dao.UserinfoOnlyDao;
import com.kedom.service.UserinfoOnlyService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UserinfoOnly)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 19:56:06
 */
@Service("userinfoOnlyService")
public class UserinfoOnlyServiceImpl implements UserinfoOnlyService {
    @Resource
    private UserinfoOnlyDao userinfoOnlyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserinfoOnly queryById(Integer id) {
        return this.userinfoOnlyDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userinfoOnly 筛选条件
     * @param pageRequest      分页对象
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
        return this.queryById(userinfoOnly.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userinfoOnlyDao.deleteById(id) > 0;
    }
}
