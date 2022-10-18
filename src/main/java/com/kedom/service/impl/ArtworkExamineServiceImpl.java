package com.kedom.service.impl;

import com.kedom.entity.ArtworkExamine;
import com.kedom.dao.ArtworkExamineDao;
import com.kedom.service.ArtworkExamineService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * 艺术品审批表(ArtworkExamine)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@Service("artworkExamineService")
public class ArtworkExamineServiceImpl implements ArtworkExamineService {
    @Resource
    private ArtworkExamineDao artworkExamineDao;

    /**
     * 通过ID查询单条数据
     *
     * @param artworkId 主键
     * @return 实例对象
     */
    @Override
    public ArtworkExamine queryById(String artworkId) {
       this.artworkExamineDao.queryById(artworkId);
     return null;
    }

    /**
     * 分页查询
     *
     * @param artworkExamine 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public List<ArtworkExamine> queryByPage(ArtworkExamine artworkExamine, PageRequest pageRequest) {
        long total = this.artworkExamineDao.count(artworkExamine);
     return null;
    }

    /**
     * 新增数据
     *
     * @param artworkExamine 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(ArtworkExamine artworkExamine) {
        this.artworkExamineDao.insert(artworkExamine);
     return null;
    }

    /**
     * 修改数据
     *
     * @param artworkExamine 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(ArtworkExamine artworkExamine) {
        this.artworkExamineDao.update(artworkExamine);
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
         this.artworkExamineDao.deleteById(artworkId);
     return null;
    }
}
