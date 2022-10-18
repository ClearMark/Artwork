package com.kedom.service;

import com.kedom.entity.ArtworkList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 艺术品目录(ArtworkList)表服务接口
 *
 * @author makejava
 * @since 2022-10-18 17:46:00
 */
public interface ArtworkListService {

    /**
     * 通过ID查询单条数据
     *
     * @param artworkId 主键
     * @return 实例对象
     */
    ArtworkList queryById(String artworkId);

    /**
     * 分页查询
     *
     * @param artworkList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ArtworkList> queryByPage(ArtworkList artworkList, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param artworkList 实例对象
     * @return 实例对象
     */
    ArtworkList insert(ArtworkList artworkList);

    /**
     * 修改数据
     *
     * @param artworkList 实例对象
     * @return 实例对象
     */
    ArtworkList update(ArtworkList artworkList);

    /**
     * 通过主键删除数据
     *
     * @param artworkId 主键
     * @return 是否成功
     */
    boolean deleteById(String artworkId);

}
