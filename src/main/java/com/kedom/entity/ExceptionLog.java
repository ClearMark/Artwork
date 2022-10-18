package com.kedom.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;


@Data
/**
 * (ExceptionLog)实体类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public class ExceptionLog implements Serializable {
    private static final long serialVersionUID = 760849577403979396L;
    /**
     * 主键 无作用
     */
    private Integer id;
    /**
     * 异常接口
     */
    private String exceptionUrl;
    /**
     * 异常类
     */
    private String exceptionClassName;
    /**
     * 异常方法
     */
    private String exceptionMethodName;
    /**
     * 异常消息
     */
    private String exceptionMessage;
    /**
     * 异常时间
     */
    private LocalDateTime exceptionTime;


    public ExceptionLog(String exceptionUrl, String exceptionClassName, String exceptionMethodName, String exceptionMessage, LocalDateTime exceptionTime) {
        this.exceptionUrl = exceptionUrl;
        this.exceptionClassName = exceptionClassName;
        this.exceptionMethodName = exceptionMethodName;
        this.exceptionMessage = exceptionMessage;
        this.exceptionTime = exceptionTime;
    }
}

