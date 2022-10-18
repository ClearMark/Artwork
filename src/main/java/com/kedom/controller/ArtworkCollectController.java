package com.kedom.controller;

import com.kedom.entity.ArtworkCollect;
import com.kedom.service.ArtworkCollectService;
import org.springframework.data.domain.Page;
import com.kedom.entity.R;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品收集表(ArtworkCollect)表控制层
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@RestController
@RequestMapping("artworkCollect")
public class ArtworkCollectController {
    /**
     * 服务对象
     */
    @Resource
    private ArtworkCollectService artworkCollectService;

    /**
     * 分页查询
     *
     * @param artworkCollect 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public R queryByPage(ArtworkCollect artworkCollect, PageRequest pageRequest) {
                ResponseEntity.ok(this.artworkCollectService.queryByPage(artworkCollect, pageRequest));
        return null; 
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R queryById(@PathVariable("id") String id) {
         ResponseEntity.ok(this.artworkCollectService.queryById(id));
    return null;
    }

    /**
     * 新增数据
     *
     * @param artworkCollect 实体
     * @return 新增结果
     */
    @PostMapping
    public R add(ArtworkCollect artworkCollect) {
         ResponseEntity.ok(this.artworkCollectService.insert(artworkCollect));
     return null;
    }

    /**
     * 编辑数据
     *
     * @param artworkCollect 实体
     * @return 编辑结果
     */
    @PutMapping
    public R edit(ArtworkCollect artworkCollect) {
         ResponseEntity.ok(this.artworkCollectService.update(artworkCollect));
     return null;
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public R deleteById(String id) {
         ResponseEntity.ok(this.artworkCollectService.deleteById(id));
     return null;
    }

}

