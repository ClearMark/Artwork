package com.kedom.service.impl;

import com.kedom.entity.AdminList;
import com.kedom.dao.AdminListDao;
import com.kedom.service.AdminListService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * 管理员表(AdminList)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@Service("adminListService")
public class AdminListServiceImpl implements AdminListService {
    @Resource
    private AdminListDao adminListDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdminList queryById(Integer id) {
       this.adminListDao.queryById(id);
     return null;
    }

    /**
     * 分页查询
     *
     * @param adminList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public List<AdminList> queryByPage(AdminList adminList, PageRequest pageRequest) {
        long total = this.adminListDao.count(adminList);
     return null;
    }

    /**
     * 新增数据
     *
     * @param adminList 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(AdminList adminList) {
        this.adminListDao.insert(adminList);
     return null;
    }

    /**
     * 修改数据
     *
     * @param adminList 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(AdminList adminList) {
        this.adminListDao.update(adminList);
     return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public Integer deleteById(Integer id) {
         this.adminListDao.deleteById(id);
     return null;
    }
}
