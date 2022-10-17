package com.kedom.service;

import com.kedom.entity.UserinfoOnly;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UserinfoOnly)表服务接口
 *
 * @author makejava
 * @since 2022-07-13 22:26:23
 */
public interface UserinfoOnlyService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    UserinfoOnly queryById(Integer uid);

    /**
     * 分页查询
     *
     * @param userinfoOnly 筛选条件
     * @param pageRequest  分页对象
     * @return 查询结果
     */
    Page<UserinfoOnly> queryByPage(UserinfoOnly userinfoOnly, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param userinfoOnly 实例对象
     * @return 实例对象
     */
    UserinfoOnly insert(UserinfoOnly userinfoOnly);

    /**
     * 修改数据
     *
     * @param userinfoOnly 实例对象
     * @return 实例对象
     */
    UserinfoOnly update(UserinfoOnly userinfoOnly);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uid);

}
