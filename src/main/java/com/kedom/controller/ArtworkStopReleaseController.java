package com.kedom.controller;

import com.kedom.entity.ArtworkStopRelease;
import com.kedom.service.ArtworkStopReleaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 停止发布时返回的艺术品表(ArtworkStopRelease)表控制层
 *
 * @author makejava
 * @since 2022-10-18 17:46:01
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
    public ResponseEntity<Page<ArtworkStopRelease>> queryByPage(ArtworkStopRelease artworkStopRelease, PageRequest pageRequest) {
        return ResponseEntity.ok(this.artworkStopReleaseService.queryByPage(artworkStopRelease, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ArtworkStopRelease> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.artworkStopReleaseService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param artworkStopRelease 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ArtworkStopRelease> add(ArtworkStopRelease artworkStopRelease) {
        return ResponseEntity.ok(this.artworkStopReleaseService.insert(artworkStopRelease));
    }

    /**
     * 编辑数据
     *
     * @param artworkStopRelease 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ArtworkStopRelease> edit(ArtworkStopRelease artworkStopRelease) {
        return ResponseEntity.ok(this.artworkStopReleaseService.update(artworkStopRelease));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.artworkStopReleaseService.deleteById(id));
    }

}

