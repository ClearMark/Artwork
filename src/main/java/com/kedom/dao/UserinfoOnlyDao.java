package com.kedom.dao;

import com.kedom.entity.UserinfoOnly;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (UserinfoOnly)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-17 19:55:59
 */
@Mapper
public interface UserinfoOnlyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserinfoOnly queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userinfoOnly 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<UserinfoOnly> queryAllByLimit(UserinfoOnly userinfoOnly, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param userinfoOnly 查询条件
     * @return 总行数
     */
    long count(UserinfoOnly userinfoOnly);

    /**
     * 新增数据
     *
     * @param userinfoOnly 实例对象
     * @return 影响行数
     */
    int insert(UserinfoOnly userinfoOnly);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserinfoOnly> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserinfoOnly> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserinfoOnly> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserinfoOnly> entities);

    /**
     * 修改数据
     *
     * @param userinfoOnly 实例对象
     * @return 影响行数
     */
    int update(UserinfoOnly userinfoOnly);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

