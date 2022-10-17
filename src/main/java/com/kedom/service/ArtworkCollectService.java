package com.kedom.service;

import com.kedom.entity.ArtworkCollect;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 艺术品收集表(ArtworkCollect)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 18:33:26
 */
public interface ArtworkCollectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArtworkCollect queryById(Integer id);

    /**
     * 分页查询
     *
     * @param artworkCollect 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ArtworkCollect> queryByPage(ArtworkCollect artworkCollect, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param artworkCollect 实例对象
     * @return 实例对象
     */
    ArtworkCollect insert(ArtworkCollect artworkCollect);

    /**
     * 修改数据
     *
     * @param artworkCollect 实例对象
     * @return 实例对象
     */
    ArtworkCollect update(ArtworkCollect artworkCollect);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
