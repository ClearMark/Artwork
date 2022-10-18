package com.kedom.dao;

import com.kedom.entity.ArtworkChange;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;


/**
 * 艺术品的获取去出售记录(ArtworkChange)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@Mapper
public interface ArtworkChangeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param artworkChangeId 主键
     * @return 实例对象
     */
    ArtworkChange queryById(String artworkChangeId);

    /**
     * 查询指定行数据
     *
     * @param artworkChange 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ArtworkChange> queryAllByLimit(ArtworkChange artworkChange, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param artworkChange 查询条件
     * @return 总行数
     */
    long count(ArtworkChange artworkChange);

    /**
     * 新增数据
     *
     * @param artworkChange 实例对象
     * @return 影响行数
     */
    Integer insert(ArtworkChange artworkChange);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArtworkChange> 实例对象列表
     * @return 影响行数
     */
    Integer insertBatch(@Param("entities") List<ArtworkChange> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArtworkChange> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    Integer insertOrUpdateBatch(@Param("entities") List<ArtworkChange> entities);

    /**
     * 修改数据
     *
     * @param artworkChange 实例对象
     * @return 影响行数
     */
    Integer update(ArtworkChange artworkChange);

    /**
     * 通过主键删除数据
     *
     * @param artworkChangeId 主键
     * @return 影响行数
     */
    Integer deleteById(String artworkChangeId);

}

