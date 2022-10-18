package com.kedom.service;

import com.kedom.entity.ExceptionLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;

/**
 * (ExceptionLog)表服务接口
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
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
    List<ExceptionLog> queryByPage(ExceptionLog exceptionLog, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    Integer insert(ExceptionLog exceptionLog);

    /**
     * 修改数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    Integer update(ExceptionLog exceptionLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Integer deleteById(Integer id);

}
