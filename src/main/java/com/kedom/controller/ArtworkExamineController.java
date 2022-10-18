package com.kedom.controller;

import com.kedom.entity.ArtworkExamine;
import com.kedom.service.ArtworkExamineService;
import org.springframework.data.domain.Page;
import com.kedom.entity.R;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 艺术品审批表(ArtworkExamine)表控制层
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
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
    public R queryByPage(ArtworkExamine artworkExamine, PageRequest pageRequest) {
                ResponseEntity.ok(this.artworkExamineService.queryByPage(artworkExamine, pageRequest));
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
         ResponseEntity.ok(this.artworkExamineService.queryById(id));
    return null;
    }

    /**
     * 新增数据
     *
     * @param artworkExamine 实体
     * @return 新增结果
     */
    @PostMapping
    public R add(ArtworkExamine artworkExamine) {
         ResponseEntity.ok(this.artworkExamineService.insert(artworkExamine));
     return null;
    }

    /**
     * 编辑数据
     *
     * @param artworkExamine 实体
     * @return 编辑结果
     */
    @PutMapping
    public R edit(ArtworkExamine artworkExamine) {
         ResponseEntity.ok(this.artworkExamineService.update(artworkExamine));
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
         ResponseEntity.ok(this.artworkExamineService.deleteById(id));
     return null;
    }

}

