package com.kedom.dao;

import com.kedom.entity.ArtworkStopRelease;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 停止发布时返回的艺术品表(ArtworkStopRelease)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-18 17:46:01
 */
public interface ArtworkStopReleaseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param artworkStopReleaseId 主键
     * @return 实例对象
     */
    ArtworkStopRelease queryById(String artworkStopReleaseId);

    /**
     * 查询指定行数据
     *
     * @param artworkStopRelease 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ArtworkStopRelease> queryAllByLimit(ArtworkStopRelease artworkStopRelease, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param artworkStopRelease 查询条件
     * @return 总行数
     */
    long count(ArtworkStopRelease artworkStopRelease);

    /**
     * 新增数据
     *
     * @param artworkStopRelease 实例对象
     * @return 影响行数
     */
    int insert(ArtworkStopRelease artworkStopRelease);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArtworkStopRelease> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ArtworkStopRelease> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArtworkStopRelease> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ArtworkStopRelease> entities);

    /**
     * 修改数据
     *
     * @param artworkStopRelease 实例对象
     * @return 影响行数
     */
    int update(ArtworkStopRelease artworkStopRelease);

    /**
     * 通过主键删除数据
     *
     * @param artworkStopReleaseId 主键
     * @return 影响行数
     */
    int deleteById(String artworkStopReleaseId);

}

