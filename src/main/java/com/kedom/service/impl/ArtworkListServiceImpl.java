package com.kedom.service.impl;

import com.kedom.entity.ArtworkList;
import com.kedom.dao.ArtworkListDao;
import com.kedom.service.ArtworkListService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * 艺术品目录(ArtworkList)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
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
       this.artworkListDao.queryById(artworkId);
     return null;
    }

    /**
     * 分页查询
     *
     * @param artworkList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public List<ArtworkList> queryByPage(ArtworkList artworkList, PageRequest pageRequest) {
        long total = this.artworkListDao.count(artworkList);
     return null;
    }

    /**
     * 新增数据
     *
     * @param artworkList 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(ArtworkList artworkList) {
        this.artworkListDao.insert(artworkList);
     return null;
    }

    /**
     * 修改数据
     *
     * @param artworkList 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(ArtworkList artworkList) {
        this.artworkListDao.update(artworkList);
     return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param artworkId 主键
     * @return 是否成功
     */
    @Override
    public Integer deleteById(String artworkId) {
         this.artworkListDao.deleteById(artworkId);
     return null;
    }
}
