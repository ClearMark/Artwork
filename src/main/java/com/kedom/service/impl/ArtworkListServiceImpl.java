package com.kedom.service.impl;

import com.kedom.entity.ArtworkList;
import com.kedom.dao.ArtworkListDao;
import com.kedom.service.ArtworkListService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 艺术品目录(ArtworkList)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 18:33:29
 */
@Service("artworkListService")
public class ArtworkListServiceImpl implements ArtworkListService {
    @Resource
    private ArtworkListDao artworkListDao;

    /**
     * 通过ID查询单条数据
     *
     * @param artworkId 主键
     * @return 实例对象
     */
    @Override
    public ArtworkList queryById(String artworkId) {
        return this.artworkListDao.queryById(artworkId);
    }

    /**
     * 分页查询
     *
     * @param artworkList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ArtworkList> queryByPage(ArtworkList artworkList, PageRequest pageRequest) {
        long total = this.artworkListDao.count(artworkList);
        return new PageImpl<>(this.artworkListDao.queryAllByLimit(artworkList, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param artworkList 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkList insert(ArtworkList artworkList) {
        this.artworkListDao.insert(artworkList);
        return artworkList;
    }

    /**
     * 修改数据
     *
     * @param artworkList 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkList update(ArtworkList artworkList) {
        this.artworkListDao.update(artworkList);
        return this.queryById(artworkList.getArtworkId());
    }

    /**
     * 通过主键删除数据
     *
     * @param artworkId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String artworkId) {
        return this.artworkListDao.deleteById(artworkId) > 0;
    }
}
