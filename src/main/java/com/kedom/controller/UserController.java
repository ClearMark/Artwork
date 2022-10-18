package com.kedom.controller;

import com.kedom.annotation.RequestID;
import com.kedom.entity.User;
import com.kedom.myJavaUtils.ParameterValidation;
import com.kedom.service.UserService;
import org.springframework.data.domain.Page;
import com.kedom.entity.R;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 分页查询
     *
     * @param user 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public R queryByPage(User user, PageRequest pageRequest) {
                ResponseEntity.ok(this.userService.queryByPage(user, pageRequest));
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
         ResponseEntity.ok(this.userService.queryById(id));
    return null;
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping
    public R add(User user) {
        ParameterValidation.checkNotNull(user);
        ParameterValidation.checkNotEmpty(user.getUsername());
        ParameterValidation.checkNotEmpty(user.getPassword());
        Integer insert = this.userService.insert(user);
        if (insert>0)
        {
            return R.OK();
        }
        else
        {
            return R.Error();
        }
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping
    public R edit(User user) {
         ResponseEntity.ok(this.userService.update(user));
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
         ResponseEntity.ok(this.userService.deleteById(id));
     return null;
    }

}

