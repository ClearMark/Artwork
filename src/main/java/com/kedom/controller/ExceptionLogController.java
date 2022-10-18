package com.kedom.controller;

import com.kedom.entity.ExceptionLog;
import com.kedom.service.ExceptionLogService;
import org.springframework.data.domain.Page;
import com.kedom.entity.R;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ExceptionLog)表控制层
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
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
    public R queryByPage(ExceptionLog exceptionLog, PageRequest pageRequest) {
                ResponseEntity.ok(this.exceptionLogService.queryByPage(exceptionLog, pageRequest));
        return null; 
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R queryById(@PathVariable("id") Integer id) {
         ResponseEntity.ok(this.exceptionLogService.queryById(id));
    return null;
    }

    /**
     * 新增数据
     *
     * @param exceptionLog 实体
     * @return 新增结果
     */
    @PostMapping
    public R add(ExceptionLog exceptionLog) {
         ResponseEntity.ok(this.exceptionLogService.insert(exceptionLog));
     return null;
    }

    /**
     * 编辑数据
     *
     * @param exceptionLog 实体
     * @return 编辑结果
     */
    @PutMapping
    public R edit(ExceptionLog exceptionLog) {
         ResponseEntity.ok(this.exceptionLogService.update(exceptionLog));
     return null;
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public R deleteById(Integer id) {
         ResponseEntity.ok(this.exceptionLogService.deleteById(id));
     return null;
    }

}

