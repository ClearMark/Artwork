package com.kedom.service;

import com.kedom.entity.ArtworkCollect;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;

/**
 * 艺术品收集表(ArtworkCollect)表服务接口
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public interface ArtworkCollectService {

    /**
     * 通过ID查询单条数据
     *
     * @param artworkCollectId 主键
     * @return 实例对象
     */
    ArtworkCollect queryById(String artworkCollectId);

    /**
     * 分页查询
     *
     * @param artworkCollect 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    List<ArtworkCollect> queryByPage(ArtworkCollect artworkCollect, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param artworkCollect 实例对象
     * @return 实例对象
     */
    Integer insert(ArtworkCollect artworkCollect);

    /**
     * 修改数据
     *
     * @param artworkCollect 实例对象
     * @return 实例对象
     */
    Integer update(ArtworkCollect artworkCollect);

    /**
     * 通过主键删除数据
     *
     * @param artworkCollectId 主键
     * @return 是否成功
     */
    Integer deleteById(String artworkCollectId);

}
