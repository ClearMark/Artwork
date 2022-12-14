package com.kedom.service;

import com.kedom.entity.ArtworkStopRelease;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;

/**
 * 停止发布时返回的艺术品表(ArtworkStopRelease)表服务接口
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public interface ArtworkStopReleaseService {

    /**
     * 通过ID查询单条数据
     *
     * @param artworkStopReleaseId 主键
     * @return 实例对象
     */
    ArtworkStopRelease queryById(String artworkStopReleaseId);

    /**
     * 分页查询
     *
     * @param artworkStopRelease 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    List<ArtworkStopRelease> queryByPage(ArtworkStopRelease artworkStopRelease, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param artworkStopRelease 实例对象
     * @return 实例对象
     */
    Integer insert(ArtworkStopRelease artworkStopRelease);

    /**
     * 修改数据
     *
     * @param artworkStopRelease 实例对象
     * @return 实例对象
     */
    Integer update(ArtworkStopRelease artworkStopRelease);

    /**
     * 通过主键删除数据
     *
     * @param artworkStopReleaseId 主键
     * @return 是否成功
     */
    Integer deleteById(String artworkStopReleaseId);

}
