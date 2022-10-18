package com.kedom.service.impl;

import com.kedom.entity.ArtworkRelease;
import com.kedom.dao.ArtworkReleaseDao;
import com.kedom.service.ArtworkReleaseService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * 艺术品发布表(ArtworkRelease)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@Service("artworkReleaseService")
public class ArtworkReleaseServiceImpl implements ArtworkReleaseService {
    @Resource
    private ArtworkReleaseDao artworkReleaseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param artworkReleaseId 主键
     * @return 实例对象
     */
    @Override
    public ArtworkRelease queryById(String artworkReleaseId) {
       this.artworkReleaseDao.queryById(artworkReleaseId);
     return null;
    }

    /**
     * 分页查询
     *
     * @param artworkRelease 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public List<ArtworkRelease> queryByPage(ArtworkRelease artworkRelease, PageRequest pageRequest) {
        long total = this.artworkReleaseDao.count(artworkRelease);
     return null;
    }

    /**
     * 新增数据
     *
     * @param artworkRelease 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(ArtworkRelease artworkRelease) {
        this.artworkReleaseDao.insert(artworkRelease);
     return null;
    }

    /**
     * 修改数据
     *
     * @param artworkRelease 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(ArtworkRelease artworkRelease) {
        this.artworkReleaseDao.update(artworkRelease);
     return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param artworkReleaseId 主键
     * @return 是否成功
     */
    @Override
    public Integer deleteById(String artworkReleaseId) {
         this.artworkReleaseDao.deleteById(artworkReleaseId);
     return null;
    }
}
