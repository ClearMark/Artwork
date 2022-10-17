package com.kedom.service;

import com.kedom.entity.ArtworkRelease;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 艺术品发布表(ArtworkRelease)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 19:02:11
 */
public interface ArtworkReleaseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArtworkRelease queryById(Integer id);

    /**
     * 分页查询
     *
     * @param artworkRelease 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ArtworkRelease> queryByPage(ArtworkRelease artworkRelease, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param artworkRelease 实例对象
     * @return 实例对象
     */
    ArtworkRelease insert(ArtworkRelease artworkRelease);

    /**
     * 修改数据
     *
     * @param artworkRelease 实例对象
     * @return 实例对象
     */
    ArtworkRelease update(ArtworkRelease artworkRelease);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
