package com.kedom.dao;

import com.kedom.entity.ArtworkExamine;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 艺术品审批表(ArtworkExamine)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-17 18:33:27
 */
public interface ArtworkExamineDao {

    /**
     * 通过ID查询单条数据
     *
     * @param artworkId 主键
     * @return 实例对象
     */
    ArtworkExamine queryById(String artworkId);

    /**
     * 查询指定行数据
     *
     * @param artworkExamine 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ArtworkExamine> queryAllByLimit(ArtworkExamine artworkExamine, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param artworkExamine 查询条件
     * @return 总行数
     */
    long count(ArtworkExamine artworkExamine);

    /**
     * 新增数据
     *
     * @param artworkExamine 实例对象
     * @return 影响行数
     */
    int insert(ArtworkExamine artworkExamine);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArtworkExamine> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ArtworkExamine> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArtworkExamine> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ArtworkExamine> entities);

    /**
     * 修改数据
     *
     * @param artworkExamine 实例对象
     * @return 影响行数
     */
    int update(ArtworkExamine artworkExamine);

    /**
     * 通过主键删除数据
     *
     * @param artworkId 主键
     * @return 影响行数
     */
    int deleteById(String artworkId);

}

