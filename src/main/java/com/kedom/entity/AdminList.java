package com.kedom.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 管理员表(AdminList)实体类
 *
 * @author makejava
 * @since 2022-10-18 17:45:50
 */
public class AdminList implements Serializable {
    private static final long serialVersionUID = 350886042296312486L;
    /**
     * 无业务作用 主键
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 管理员等级
     */
    private Integer adminLevel;
    /**
     * 使用人职工号
     */
    private Integer workerId;
    /**
     * 账号注册时间
     */
    private Date beginDate;
    /**
     * 账号停止使用时间
     */
    private Integer endDate;
    /**
     * 谁开启的账号
     */
    private Integer registerId;
    /**
     * 账号状态 0 使用中  1 停止使用
     */
    private Integer adminState;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(Integer adminLevel) {
        this.adminLevel = adminLevel;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public Integer getAdminState() {
        return adminState;
    }

    public void setAdminState(Integer adminState) {
        this.adminState = adminState;
    }

}

