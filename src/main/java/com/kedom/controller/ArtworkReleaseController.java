package com.kedom.controller;

import com.kedom.entity.ArtworkRelease;
import com.kedom.service.ArtworkReleaseService;
import org.springframework.data.domain.Page;
import com.kedom.entity.R;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品发布表(ArtworkRelease)表控制层
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@RestController
@RequestMapping("artworkRelease")
public class ArtworkReleaseController {
    /**
     * 服务对象
     */
    @Resource
    private ArtworkReleaseService artworkReleaseService;

    /**
     * 分页查询
     *
     * @param artworkRelease 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public R queryByPage(ArtworkRelease artworkRelease, PageRequest pageRequest) {
                ResponseEntity.ok(this.artworkReleaseService.queryByPage(artworkRelease, pageRequest));
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
         ResponseEntity.ok(this.artworkReleaseService.queryById(id));
    return null;
    }

    /**
     * 新增数据
     *
     * @param artworkRelease 实体
     * @return 新增结果
     */
    @PostMapping
    public R add(ArtworkRelease artworkRelease) {
         ResponseEntity.ok(this.artworkReleaseService.insert(artworkRelease));
     return null;
    }

    /**
     * 编辑数据
     *
     * @param artworkRelease 实体
     * @return 编辑结果
     */
    @PutMapping
    public R edit(ArtworkRelease artworkRelease) {
         ResponseEntity.ok(this.artworkReleaseService.update(artworkRelease));
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
         ResponseEntity.ok(this.artworkReleaseService.deleteById(id));
     return null;
    }

}

