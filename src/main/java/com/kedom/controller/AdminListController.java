package com.kedom.controller;

import com.kedom.entity.AdminList;
import com.kedom.service.AdminListService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 管理员表(AdminList)表控制层
 *
 * @author makejava
 * @since 2022-10-17 18:33:14
 */
@RestController
@RequestMapping("adminList")
public class AdminListController {
    /**
     * 服务对象
     */
    @Resource
    private AdminListService adminListService;

    /**
     * 分页查询
     *
     * @param adminList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AdminList>> queryByPage(AdminList adminList, PageRequest pageRequest) {
        return ResponseEntity.ok(this.adminListService.queryByPage(adminList, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AdminList> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.adminListService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param adminList 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AdminList> add(AdminList adminList) {
        return ResponseEntity.ok(this.adminListService.insert(adminList));
    }

    /**
     * 编辑数据
     *
     * @param adminList 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AdminList> edit(AdminList adminList) {
        return ResponseEntity.ok(this.adminListService.update(adminList));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.adminListService.deleteById(id));
    }

}

