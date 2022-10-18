package com.kedom.service.impl;

import com.kedom.entity.User;
import com.kedom.dao.UserDao;
import com.kedom.myJavaUtils.NFTProUtils;
import com.kedom.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public User queryById(String userId) {
       this.userDao.queryById(userId);
     return null;
    }

    /**
     * 分页查询
     *
     * @param user 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public List<User> queryByPage(User user, PageRequest pageRequest) {
        long total = this.userDao.count(user);
     return null;
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(User user) {

        user.setUserId(User.createId());
        user.setPassword(NFTProUtils.getMd5(user.getPassword()));

        return this.userDao.insert(user);
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(User user) {
        this.userDao.update(user);
     return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public Integer deleteById(String userId) {
         this.userDao.deleteById(userId);
     return null;
    }
}
