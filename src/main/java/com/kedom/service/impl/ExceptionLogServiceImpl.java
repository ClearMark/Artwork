package com.kedom.service.impl;

import com.kedom.entity.ExceptionLog;
import com.kedom.dao.ExceptionLogDao;
import com.kedom.service.ExceptionLogService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * (ExceptionLog)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
@Service("exceptionLogService")
public class ExceptionLogServiceImpl implements ExceptionLogService {
    @Resource
    private ExceptionLogDao exceptionLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ExceptionLog queryById(Integer id) {
       this.exceptionLogDao.queryById(id);
     return null;
    }

    /**
     * 分页查询
     *
     * @param exceptionLog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public List<ExceptionLog> queryByPage(ExceptionLog exceptionLog, PageRequest pageRequest) {
        long total = this.exceptionLogDao.count(exceptionLog);
     return null;
    }

    /**
     * 新增数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(ExceptionLog exceptionLog) {
        this.exceptionLogDao.insert(exceptionLog);
     return null;
    }

    /**
     * 修改数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(ExceptionLog exceptionLog) {
        this.exceptionLogDao.update(exceptionLog);
     return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public Integer deleteById(Integer id) {
         this.exceptionLogDao.deleteById(id);
     return null;
    }
}
