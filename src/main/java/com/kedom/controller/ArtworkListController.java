package com.kedom.controller;

import com.kedom.entity.ArtworkList;
import com.kedom.service.ArtworkListService;
import org.springframework.data.domain.Page;
import com.kedom.entity.R;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品目录(ArtworkList)表控制层
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@RestController
@RequestMapping("artworkList")
public class ArtworkListController {
    /**
     * 服务对象
     */
    @Resource
    private ArtworkListService artworkListService;

    /**
     * 分页查询
     *
     * @param artworkList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public R queryByPage(ArtworkList artworkList, PageRequest pageRequest) {
                ResponseEntity.ok(this.artworkListService.queryByPage(artworkList, pageRequest));
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
         ResponseEntity.ok(this.artworkListService.queryById(id));
    return null;
    }

    /**
     * 新增数据
     *
     * @param artworkList 实体
     * @return 新增结果
     */
    @PostMapping
    public R add(ArtworkList artworkList) {
         ResponseEntity.ok(this.artworkListService.insert(artworkList));
     return null;
    }

    /**
     * 编辑数据
     *
     * @param artworkList 实体
     * @return 编辑结果
     */
    @PutMapping
    public R edit(ArtworkList artworkList) {
         ResponseEntity.ok(this.artworkListService.update(artworkList));
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
         ResponseEntity.ok(this.artworkListService.deleteById(id));
     return null;
    }

}

