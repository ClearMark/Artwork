package com.kedom.service.impl;

import com.kedom.entity.ArtworkChange;
import com.kedom.dao.ArtworkChangeDao;
import com.kedom.service.ArtworkChangeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 艺术品的获取去出售记录(ArtworkChange)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 17:45:54
 */
@Service("artworkChangeService")
public class ArtworkChangeServiceImpl implements ArtworkChangeService {
    @Resource
    private ArtworkChangeDao artworkChangeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param artworkChangeId 主键
     * @return 实例对象
     */
    @Override
    public ArtworkChange queryById(String artworkChangeId) {
        return this.artworkChangeDao.queryById(artworkChangeId);
    }

    /**
     * 分页查询
     *
     * @param artworkChange 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ArtworkChange> queryByPage(ArtworkChange artworkChange, PageRequest pageRequest) {
        long total = this.artworkChangeDao.count(artworkChange);
        return new PageImpl<>(this.artworkChangeDao.queryAllByLimit(artworkChange, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param artworkChange 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkChange insert(ArtworkChange artworkChange) {
        this.artworkChangeDao.insert(artworkChange);
        return artworkChange;
    }

    /**
     * 修改数据
     *
     * @param artworkChange 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkChange update(ArtworkChange artworkChange) {
        this.artworkChangeDao.update(artworkChange);
        return this.queryById(artworkChange.getArtworkChangeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param artworkChangeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String artworkChangeId) {
        return this.artworkChangeDao.deleteById(artworkChangeId) > 0;
    }
}
