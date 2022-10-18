package com.kedom.service;

import com.kedom.entity.ArtworkExamine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;

/**
 * 艺术品审批表(ArtworkExamine)表服务接口
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public interface ArtworkExamineService {

    /**
     * 通过ID查询单条数据
     *
     * @param artworkId 主键
     * @return 实例对象
     */
    ArtworkExamine queryById(String artworkId);

    /**
     * 分页查询
     *
     * @param artworkExamine 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    List<ArtworkExamine> queryByPage(ArtworkExamine artworkExamine, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param artworkExamine 实例对象
     * @return 实例对象
     */
    Integer insert(ArtworkExamine artworkExamine);

    /**
     * 修改数据
     *
     * @param artworkExamine 实例对象
     * @return 实例对象
     */
    Integer update(ArtworkExamine artworkExamine);

    /**
     * 通过主键删除数据
     *
     * @param artworkId 主键
     * @return 是否成功
     */
    Integer deleteById(String artworkId);

}
