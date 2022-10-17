package com.kedom.controller;

import com.kedom.entity.ArtworkExamine;
import com.kedom.service.ArtworkExamineService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品审批表(ArtworkExamine)表控制层
 *
 * @author makejava
 * @since 2022-10-17 18:33:26
 */
@RestController
@RequestMapping("artworkExamine")
public class ArtworkExamineController {
    /**
     * 服务对象
     */
    @Resource
    private ArtworkExamineService artworkExamineService;

    /**
     * 分页查询
     *
     * @param artworkExamine 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ArtworkExamine>> queryByPage(ArtworkExamine artworkExamine, PageRequest pageRequest) {
        return ResponseEntity.ok(this.artworkExamineService.queryByPage(artworkExamine, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ArtworkExamine> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.artworkExamineService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param artworkExamine 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ArtworkExamine> add(ArtworkExamine artworkExamine) {
        return ResponseEntity.ok(this.artworkExamineService.insert(artworkExamine));
    }

    /**
     * 编辑数据
     *
     * @param artworkExamine 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ArtworkExamine> edit(ArtworkExamine artworkExamine) {
        return ResponseEntity.ok(this.artworkExamineService.update(artworkExamine));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.artworkExamineService.deleteById(id));
    }

}

