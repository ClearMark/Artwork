package com.kedom.service.impl;

import com.kedom.entity.ExceptionLog;
import com.kedom.dao.ExceptionLogDao;
import com.kedom.service.ExceptionLogService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (ExceptionLog)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 17:46:02
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
        return this.exceptionLogDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param exceptionLog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ExceptionLog> queryByPage(ExceptionLog exceptionLog, PageRequest pageRequest) {
        long total = this.exceptionLogDao.count(exceptionLog);
        return new PageImpl<>(this.exceptionLogDao.queryAllByLimit(exceptionLog, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    @Override
    public ExceptionLog insert(ExceptionLog exceptionLog) {
        this.exceptionLogDao.insert(exceptionLog);
        return exceptionLog;
    }

    /**
     * 修改数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    @Override
    public ExceptionLog update(ExceptionLog exceptionLog) {
        this.exceptionLogDao.update(exceptionLog);
        return this.queryById(exceptionLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.exceptionLogDao.deleteById(id) > 0;
    }
}
