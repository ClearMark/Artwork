package com.kedom.controller;

import com.kedom.entity.ExceptionLog;
import com.kedom.service.ExceptionLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ExceptionLog)表控制层
 *
 * @author makejava
 * @since 2022-10-17 18:34:03
 */
@RestController
@RequestMapping("exceptionLog")
public class ExceptionLogController {
    /**
     * 服务对象
     */
    @Resource
    private ExceptionLogService exceptionLogService;

    /**
     * 分页查询
     *
     * @param exceptionLog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ExceptionLog>> queryByPage(ExceptionLog exceptionLog, PageRequest pageRequest) {
        return ResponseEntity.ok(this.exceptionLogService.queryByPage(exceptionLog, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ExceptionLog> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.exceptionLogService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param exceptionLog 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ExceptionLog> add(ExceptionLog exceptionLog) {
        return ResponseEntity.ok(this.exceptionLogService.insert(exceptionLog));
    }

    /**
     * 编辑数据
     *
     * @param exceptionLog 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ExceptionLog> edit(ExceptionLog exceptionLog) {
        return ResponseEntity.ok(this.exceptionLogService.update(exceptionLog));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.exceptionLogService.deleteById(id));
    }

}

