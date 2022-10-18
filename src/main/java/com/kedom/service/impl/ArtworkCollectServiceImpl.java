package com.kedom.service.impl;

import com.kedom.entity.ArtworkCollect;
import com.kedom.dao.ArtworkCollectDao;
import com.kedom.service.ArtworkCollectService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * 艺术品收集表(ArtworkCollect)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@Service("artworkCollectService")
public class ArtworkCollectServiceImpl implements ArtworkCollectService {
    @Resource
    private ArtworkCollectDao artworkCollectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param artworkCollectId 主键
     * @return 实例对象
     */
    @Override
    public ArtworkCollect queryById(String artworkCollectId) {
       this.artworkCollectDao.queryById(artworkCollectId);
     return null;
    }

    /**
     * 分页查询
     *
     * @param artworkCollect 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public List<ArtworkCollect> queryByPage(ArtworkCollect artworkCollect, PageRequest pageRequest) {
        long total = this.artworkCollectDao.count(artworkCollect);
     return null;
    }

    /**
     * 新增数据
     *
     * @param artworkCollect 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(ArtworkCollect artworkCollect) {
        this.artworkCollectDao.insert(artworkCollect);
     return null;
    }

    /**
     * 修改数据
     *
     * @param artworkCollect 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(ArtworkCollect artworkCollect) {
        this.artworkCollectDao.update(artworkCollect);
     return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param artworkCollectId 主键
     * @return 是否成功
     */
    @Override
    public Integer deleteById(String artworkCollectId) {
         this.artworkCollectDao.deleteById(artworkCollectId);
     return null;
    }
}
