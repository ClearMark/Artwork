package com.kedom.service;

import com.kedom.entity.ExceptionLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (ExceptionLog)表服务接口
 *
 * @author makejava
 * @since 2022-10-18 17:46:02
 */
public interface ExceptionLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ExceptionLog queryById(Integer id);

    /**
     * 分页查询
     *
     * @param exceptionLog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ExceptionLog> queryByPage(ExceptionLog exceptionLog, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    ExceptionLog insert(ExceptionLog exceptionLog);

    /**
     * 修改数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    ExceptionLog update(ExceptionLog exceptionLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
