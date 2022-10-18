package com.kedom.controller;

import com.kedom.entity.ArtworkList;
import com.kedom.service.ArtworkListService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品目录(ArtworkList)表控制层
 *
 * @author makejava
 * @since 2022-10-18 17:45:59
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
    public ResponseEntity<Page<ArtworkList>> queryByPage(ArtworkList artworkList, PageRequest pageRequest) {
        return ResponseEntity.ok(this.artworkListService.queryByPage(artworkList, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ArtworkList> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.artworkListService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param artworkList 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ArtworkList> add(ArtworkList artworkList) {
        return ResponseEntity.ok(this.artworkListService.insert(artworkList));
    }

    /**
     * 编辑数据
     *
     * @param artworkList 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ArtworkList> edit(ArtworkList artworkList) {
        return ResponseEntity.ok(this.artworkListService.update(artworkList));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.artworkListService.deleteById(id));
    }

}

