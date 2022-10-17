package com.kedom.controller;

import com.kedom.entity.ArtworkRelease;
import com.kedom.service.ArtworkReleaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品发布表(ArtworkRelease)表控制层
 *
 * @author makejava
 * @since 2022-10-17 19:02:09
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
    public ResponseEntity<Page<ArtworkRelease>> queryByPage(ArtworkRelease artworkRelease, PageRequest pageRequest) {
        return ResponseEntity.ok(this.artworkReleaseService.queryByPage(artworkRelease, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ArtworkRelease> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.artworkReleaseService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param artworkRelease 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ArtworkRelease> add(ArtworkRelease artworkRelease) {
        return ResponseEntity.ok(this.artworkReleaseService.insert(artworkRelease));
    }

    /**
     * 编辑数据
     *
     * @param artworkRelease 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ArtworkRelease> edit(ArtworkRelease artworkRelease) {
        return ResponseEntity.ok(this.artworkReleaseService.update(artworkRelease));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.artworkReleaseService.deleteById(id));
    }

}

