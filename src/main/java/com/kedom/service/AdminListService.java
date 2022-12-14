package com.kedom.service;

import com.kedom.entity.AdminList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;

/**
 * 管理员表(AdminList)表服务接口
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public interface AdminListService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdminList queryById(Integer id);

    /**
     * 分页查询
     *
     * @param adminList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    List<AdminList> queryByPage(AdminList adminList, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param adminList 实例对象
     * @return 实例对象
     */
    Integer insert(AdminList adminList);

    /**
     * 修改数据
     *
     * @param adminList 实例对象
     * @return 实例对象
     */
    Integer update(AdminList adminList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Integer deleteById(Integer id);

}
