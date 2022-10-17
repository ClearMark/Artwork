package com.kedom.controller;

import com.kedom.entity.ArtworkCollect;
import com.kedom.service.ArtworkCollectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品收集表(ArtworkCollect)表控制层
 *
 * @author makejava
 * @since 2022-10-17 18:33:25
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
    public ResponseEntity<Page<ArtworkCollect>> queryByPage(ArtworkCollect artworkCollect, PageRequest pageRequest) {
        return ResponseEntity.ok(this.artworkCollectService.queryByPage(artworkCollect, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ArtworkCollect> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.artworkCollectService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param artworkCollect 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ArtworkCollect> add(ArtworkCollect artworkCollect) {
        return ResponseEntity.ok(this.artworkCollectService.insert(artworkCollect));
    }

    /**
     * 编辑数据
     *
     * @param artworkCollect 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ArtworkCollect> edit(ArtworkCollect artworkCollect) {
        return ResponseEntity.ok(this.artworkCollectService.update(artworkCollect));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.artworkCollectService.deleteById(id));
    }

}

