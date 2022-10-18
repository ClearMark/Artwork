package com.kedom.service.impl;

import com.kedom.entity.ArtworkChange;
import com.kedom.dao.ArtworkChangeDao;
import com.kedom.service.ArtworkChangeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * 艺术品的获取去出售记录(ArtworkChange)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
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
       this.artworkChangeDao.queryById(artworkChangeId);
     return null;
    }

    /**
     * 分页查询
     *
     * @param artworkChange 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public List<ArtworkChange> queryByPage(ArtworkChange artworkChange, PageRequest pageRequest) {
        long total = this.artworkChangeDao.count(artworkChange);
     return null;
    }

    /**
     * 新增数据
     *
     * @param artworkChange 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(ArtworkChange artworkChange) {
        this.artworkChangeDao.insert(artworkChange);
     return null;
    }

    /**
     * 修改数据
     *
     * @param artworkChange 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(ArtworkChange artworkChange) {
        this.artworkChangeDao.update(artworkChange);
     return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param artworkChangeId 主键
     * @return 是否成功
     */
    @Override
    public Integer deleteById(String artworkChangeId) {
         this.artworkChangeDao.deleteById(artworkChangeId);
     return null;
    }
}
