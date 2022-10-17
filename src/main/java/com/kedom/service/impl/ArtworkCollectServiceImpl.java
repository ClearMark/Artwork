package com.kedom.service.impl;

import com.kedom.entity.ArtworkCollect;
import com.kedom.dao.ArtworkCollectDao;
import com.kedom.service.ArtworkCollectService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 艺术品收集表(ArtworkCollect)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 18:33:26
 */
@Service("artworkCollectService")
public class ArtworkCollectServiceImpl implements ArtworkCollectService {
    @Resource
    private ArtworkCollectDao artworkCollectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ArtworkCollect queryById(Integer id) {
        return this.artworkCollectDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param artworkCollect 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ArtworkCollect> queryByPage(ArtworkCollect artworkCollect, PageRequest pageRequest) {
        long total = this.artworkCollectDao.count(artworkCollect);
        return new PageImpl<>(this.artworkCollectDao.queryAllByLimit(artworkCollect, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param artworkCollect 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkCollect insert(ArtworkCollect artworkCollect) {
        this.artworkCollectDao.insert(artworkCollect);
        return artworkCollect;
    }

    /**
     * 修改数据
     *
     * @param artworkCollect 实例对象
     * @return 实例对象
     */
    @Override
    public ArtworkCollect update(ArtworkCollect artworkCollect) {
        this.artworkCollectDao.update(artworkCollect);
        return this.queryById(artworkCollect.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.artworkCollectDao.deleteById(id) > 0;
    }
}
