package com.kedom.service;

import com.kedom.entity.ArtworkChange;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;

/**
 * 艺术品的获取去出售记录(ArtworkChange)表服务接口
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public interface ArtworkChangeService {

    /**
     * 通过ID查询单条数据
     *
     * @param artworkChangeId 主键
     * @return 实例对象
     */
    ArtworkChange queryById(String artworkChangeId);

    /**
     * 分页查询
     *
     * @param artworkChange 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    List<ArtworkChange> queryByPage(ArtworkChange artworkChange, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param artworkChange 实例对象
     * @return 实例对象
     */
    Integer insert(ArtworkChange artworkChange);

    /**
     * 修改数据
     *
     * @param artworkChange 实例对象
     * @return 实例对象
     */
    Integer update(ArtworkChange artworkChange);

    /**
     * 通过主键删除数据
     *
     * @param artworkChangeId 主键
     * @return 是否成功
     */
    Integer deleteById(String artworkChangeId);

}
