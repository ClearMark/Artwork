package com.kedom.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * (ExceptionLog)实体类
 *
 * @author makejava
 * @since 2022-09-05 15:49:58
 */
public class ExceptionLog implements Serializable {
    private static final long serialVersionUID = 303137722615585331L;
    
    private Integer exceptionId;
    
    private String exceptionUrl;
    
    private String exceptionClassName;
    
    private String exceptionMethodName;
    
    private String exceptionMessage;
    
    private LocalDateTime exceptionTime;

    public ExceptionLog(String exceptionURL, String exceptionClassName, String exceptionMethodName, String exceptionMessage) {
        this.exceptionUrl=exceptionURL;
        this.exceptionClassName=exceptionClassName;
        this.exceptionMethodName=exceptionMethodName;
        this.exceptionMessage=exceptionMessage;
        this.exceptionTime=LocalDateTime.now();
    }


    public Integer getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(Integer exceptionId) {
        this.exceptionId = exceptionId;
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

}

