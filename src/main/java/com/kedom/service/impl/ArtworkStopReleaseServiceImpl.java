package com.kedom.service.impl;

import com.kedom.entity.ArtworkStopRelease;
import com.kedom.dao.ArtworkStopReleaseDao;
import com.kedom.service.ArtworkStopReleaseService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 停止发布时返回的艺术品表(ArtworkStopRelease)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 17:46:01
 */
@Service("artworkStopReleaseService")
public class ArtworkStopReleaseServiceImpl implements ArtworkStopReleaseService {
    @Resource
    private ArtworkStopReleaseDao artworkStopReleaseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param artworkStopReleaseId 主键
     * @return 实例对象
     */
    @Override
    public ArtworkStopRelease queryById(String artworkStopReleaseId) {
        return this.artworkStopReleaseDao.queryById(artworkStopReleaseId);
    }

    /**
     * 分页查询
     *
     * @param artworkStopRelease 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ArtworkStopRelease> queryByPage(ArtworkStopRelease artworkStopRelease, PageRequest pageRequest) {
        long total = this.artworkStopReleaseDao.count(artworkStopRelease);
        return new PageImpl<>(this.artworkStopReleaseDao.queryAllByLimit(artworkStopRelease, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param artworkStopRelease 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkStopRelease insert(ArtworkStopRelease artworkStopRelease) {
        this.artworkStopReleaseDao.insert(artworkStopRelease);
        return artworkStopRelease;
    }

    /**
     * 修改数据
     *
     * @param artworkStopRelease 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkStopRelease update(ArtworkStopRelease artworkStopRelease) {
        this.artworkStopReleaseDao.update(artworkStopRelease);
        return this.queryById(artworkStopRelease.getArtworkStopReleaseId());
    }

    /**
     * 通过主键删除数据
     *
     * @param artworkStopReleaseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String artworkStopReleaseId) {
        return this.artworkStopReleaseDao.deleteById(artworkStopReleaseId) > 0;
    }
}
