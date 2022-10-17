package com.kedom.service.impl;

import com.kedom.entity.ArtworkRelease;
import com.kedom.dao.ArtworkReleaseDao;
import com.kedom.service.ArtworkReleaseService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 艺术品发布表(ArtworkRelease)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 19:02:11
 */
@Service("artworkReleaseService")
public class ArtworkReleaseServiceImpl implements ArtworkReleaseService {
    @Resource
    private ArtworkReleaseDao artworkReleaseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ArtworkRelease queryById(Integer id) {
        return this.artworkReleaseDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param artworkRelease 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ArtworkRelease> queryByPage(ArtworkRelease artworkRelease, PageRequest pageRequest) {
        long total = this.artworkReleaseDao.count(artworkRelease);
        return new PageImpl<>(this.artworkReleaseDao.queryAllByLimit(artworkRelease, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param artworkRelease 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkRelease insert(ArtworkRelease artworkRelease) {
        this.artworkReleaseDao.insert(artworkRelease);
        return artworkRelease;
    }

    /**
     * 修改数据
     *
     * @param artworkRelease 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkRelease update(ArtworkRelease artworkRelease) {
        this.artworkReleaseDao.update(artworkRelease);
        return this.queryById(artworkRelease.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.artworkReleaseDao.deleteById(id) > 0;
    }
}
