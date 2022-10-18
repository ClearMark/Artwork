package com.kedom.dao;

import com.kedom.entity.AdminList;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 管理员表(AdminList)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-18 17:45:50
 */
public interface AdminListDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdminList queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param adminList 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<AdminList> queryAllByLimit(AdminList adminList, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param adminList 查询条件
     * @return 总行数
     */
    long count(AdminList adminList);

    /**
     * 新增数据
     *
     * @param adminList 实例对象
     * @return 影响行数
     */
    int insert(AdminList adminList);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AdminList> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AdminList> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AdminList> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<AdminList> entities);

    /**
     * 修改数据
     *
     * @param adminList 实例对象
     * @return 影响行数
     */
    int update(AdminList adminList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

