package com.kedom.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (ExceptionLog)实体类
 *
 * @author makejava
 * @since 2022-10-18 17:46:02
 */
public class ExceptionLog implements Serializable {
    private static final long serialVersionUID = 881297375026920899L;
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
    private Date exceptionTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getExceptionTime() {
        return exceptionTime;
    }

    public void setExceptionTime(Date exceptionTime) {
        this.exceptionTime = exceptionTime;
    }

}

