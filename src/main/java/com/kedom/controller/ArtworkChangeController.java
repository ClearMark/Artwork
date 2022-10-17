package com.kedom.controller;

import com.kedom.entity.ArtworkChange;
import com.kedom.service.ArtworkChangeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品的获取去出售记录(ArtworkChange)表控制层
 *
 * @author makejava
 * @since 2022-10-17 18:54:07
 */
@RestController
@RequestMapping("artworkChange")
public class ArtworkChangeController {
    /**
     * 服务对象
     */
    @Resource
    private ArtworkChangeService artworkChangeService;

    /**
     * 分页查询
     *
     * @param artworkChange 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ArtworkChange>> queryByPage(ArtworkChange artworkChange, PageRequest pageRequest) {
        return ResponseEntity.ok(this.artworkChangeService.queryByPage(artworkChange, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ArtworkChange> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.artworkChangeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param artworkChange 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ArtworkChange> add(ArtworkChange artworkChange) {
        return ResponseEntity.ok(this.artworkChangeService.insert(artworkChange));
    }

    /**
     * 编辑数据
     *
     * @param artworkChange 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ArtworkChange> edit(ArtworkChange artworkChange) {
        return ResponseEntity.ok(this.artworkChangeService.update(artworkChange));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.artworkChangeService.deleteById(id));
    }

}

