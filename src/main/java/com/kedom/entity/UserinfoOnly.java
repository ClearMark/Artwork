package com.kedom.entity;

import java.io.Serializable;

/**
 * (UserinfoOnly)实体类
 *
 * @author makejava
 * @since 2022-10-17 19:56:00
 */
public class UserinfoOnly implements Serializable {
    private static final long serialVersionUID = 879794180700974487L;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 主键id 无业务作用
     */
    private Integer id;
    /**
     * 账号状态 0 正常使用  1有时封禁  2永久封禁 3注销
     */
    private Integer userState;


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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

}

