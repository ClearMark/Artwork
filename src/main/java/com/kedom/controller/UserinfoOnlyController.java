package com.kedom.controller;

import com.kedom.entity.UserinfoOnly;
import com.kedom.service.UserinfoOnlyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserinfoOnly)表控制层
 *
 * @author makejava
 * @since 2022-10-17 19:55:58
 */
@RestController
@RequestMapping("userinfoOnly")
public class UserinfoOnlyController {
    /**
     * 服务对象
     */
    @Resource
    private UserinfoOnlyService userinfoOnlyService;

    /**
     * 分页查询
     *
     * @param userinfoOnly 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UserinfoOnly>> queryByPage(UserinfoOnly userinfoOnly, PageRequest pageRequest) {
        return ResponseEntity.ok(this.userinfoOnlyService.queryByPage(userinfoOnly, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UserinfoOnly> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.userinfoOnlyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param userinfoOnly 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UserinfoOnly> add(UserinfoOnly userinfoOnly) {
        return ResponseEntity.ok(this.userinfoOnlyService.insert(userinfoOnly));
    }

    /**
     * 编辑数据
     *
     * @param userinfoOnly 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UserinfoOnly> edit(UserinfoOnly userinfoOnly) {
        return ResponseEntity.ok(this.userinfoOnlyService.update(userinfoOnly));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.userinfoOnlyService.deleteById(id));
    }

}

