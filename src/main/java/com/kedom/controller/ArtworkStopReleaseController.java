package com.kedom.controller;

import com.kedom.entity.ArtworkStopRelease;
import com.kedom.service.ArtworkStopReleaseService;
import org.springframework.data.domain.Page;
import com.kedom.entity.R;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 停止发布时返回的艺术品表(ArtworkStopRelease)表控制层
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@RestController
@RequestMapping("artworkStopRelease")
public class ArtworkStopReleaseController {
    /**
     * 服务对象
     */
    @Resource
    private ArtworkStopReleaseService artworkStopReleaseService;

    /**
     * 分页查询
     *
     * @param artworkStopRelease 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public R queryByPage(ArtworkStopRelease artworkStopRelease, PageRequest pageRequest) {
                ResponseEntity.ok(this.artworkStopReleaseService.queryByPage(artworkStopRelease, pageRequest));
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
         ResponseEntity.ok(this.artworkStopReleaseService.queryById(id));
    return null;
    }

    /**
     * 新增数据
     *
     * @param artworkStopRelease 实体
     * @return 新增结果
     */
    @PostMapping
    public R add(ArtworkStopRelease artworkStopRelease) {
         ResponseEntity.ok(this.artworkStopReleaseService.insert(artworkStopRelease));
     return null;
    }

    /**
     * 编辑数据
     *
     * @param artworkStopRelease 实体
     * @return 编辑结果
     */
    @PutMapping
    public R edit(ArtworkStopRelease artworkStopRelease) {
         ResponseEntity.ok(this.artworkStopReleaseService.update(artworkStopRelease));
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
         ResponseEntity.ok(this.artworkStopReleaseService.deleteById(id));
     return null;
    }

}

