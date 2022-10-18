package com.kedom.dao;

import com.kedom.entity.ArtworkList;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 艺术品目录(ArtworkList)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-18 17:45:59
 */
public interface ArtworkListDao {

    /**
     * 通过ID查询单条数据
     *
     * @param artworkId 主键
     * @return 实例对象
     */
    ArtworkList queryById(String artworkId);

    /**
     * 查询指定行数据
     *
     * @param artworkList 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ArtworkList> queryAllByLimit(ArtworkList artworkList, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param artworkList 查询条件
     * @return 总行数
     */
    long count(ArtworkList artworkList);

    /**
     * 新增数据
     *
     * @param artworkList 实例对象
     * @return 影响行数
     */
    int insert(ArtworkList artworkList);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArtworkList> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ArtworkList> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArtworkList> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ArtworkList> entities);

    /**
     * 修改数据
     *
     * @param artworkList 实例对象
     * @return 影响行数
     */
    int update(ArtworkList artworkList);

    /**
     * 通过主键删除数据
     *
     * @param artworkId 主键
     * @return 影响行数
     */
    int deleteById(String artworkId);

}

