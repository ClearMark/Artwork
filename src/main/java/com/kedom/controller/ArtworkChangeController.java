package com.kedom.controller;

import com.kedom.entity.ArtworkChange;
import com.kedom.service.ArtworkChangeService;
import org.springframework.data.domain.Page;
import com.kedom.entity.R;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品的获取去出售记录(ArtworkChange)表控制层
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
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
    public R queryByPage(ArtworkChange artworkChange, PageRequest pageRequest) {
                ResponseEntity.ok(this.artworkChangeService.queryByPage(artworkChange, pageRequest));
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
         ResponseEntity.ok(this.artworkChangeService.queryById(id));
    return null;
    }

    /**
     * 新增数据
     *
     * @param artworkChange 实体
     * @return 新增结果
     */
    @PostMapping
    public R add(ArtworkChange artworkChange) {
         ResponseEntity.ok(this.artworkChangeService.insert(artworkChange));
     return null;
    }

    /**
     * 编辑数据
     *
     * @param artworkChange 实体
     * @return 编辑结果
     */
    @PutMapping
    public R edit(ArtworkChange artworkChange) {
         ResponseEntity.ok(this.artworkChangeService.update(artworkChange));
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
         ResponseEntity.ok(this.artworkChangeService.deleteById(id));
     return null;
    }

}

