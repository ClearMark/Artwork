package com.kedom.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.io.Serializable;

/**
 * (ExceptionLog)实体类
 *
 * @author makejava
 * @since 2022-10-17 18:34:04
 */
public class ExceptionLog implements Serializable {
    private static final long serialVersionUID = 461330697970933666L;
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
    /**
     * 主键 无作用
     */
    private Integer id;

    public ExceptionLog(String exceptionUrl, String exceptionClassName, String exceptionMethodName, String exceptionMessage, LocalDateTime exceptionTime) {
        this.exceptionUrl = exceptionUrl;
        this.exceptionClassName = exceptionClassName;
        this.exceptionMethodName = exceptionMethodName;
        this.exceptionMessage = exceptionMessage;
        this.exceptionTime = exceptionTime;
    }


    public String getExceptionUrl() {
        return exceptionUrl;
    }

    public void setExceptionUrl(String exceptionUrl) {
        this.exceptionUrl = exceptionUrl;
    }

    public String getExceptionClassName() {
        return exceptionClassName;
    }

    public void setExceptionClassName(String exceptionClassName) {
        this.exceptionClassName = exceptionClassName;
    }

    public String getExceptionMethodName() {
        return exceptionMethodName;
    }

    public void setExceptionMethodName(String exceptionMethodName) {
        this.exceptionMethodName = exceptionMethodName;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public LocalDateTime getExceptionTime() {
        return exceptionTime;
    }

    public void setExceptionTime(LocalDateTime exceptionTime) {
        this.exceptionTime = exceptionTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

