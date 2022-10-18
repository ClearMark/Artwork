package com.kedom.service.impl;

import com.kedom.entity.AdminList;
import com.kedom.dao.AdminListDao;
import com.kedom.service.AdminListService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 管理员表(AdminList)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 17:45:52
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
        return this.adminListDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param adminList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AdminList> queryByPage(AdminList adminList, PageRequest pageRequest) {
        long total = this.adminListDao.count(adminList);
        return new PageImpl<>(this.adminListDao.queryAllByLimit(adminList, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param adminList 实例对象
     * @return 实例对象
     */
    @Override
    public AdminList insert(AdminList adminList) {
        this.adminListDao.insert(adminList);
        return adminList;
    }

    /**
     * 修改数据
     *
     * @param adminList 实例对象
     * @return 实例对象
     */
    @Override
    public AdminList update(AdminList adminList) {
        this.adminListDao.update(adminList);
        return this.queryById(adminList.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.adminListDao.deleteById(id) > 0;
    }
}
