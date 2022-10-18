package com.kedom.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;


@Data
/**
 * 管理员表(AdminList)实体类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public class AdminList implements Serializable {
    private static final long serialVersionUID = 739850096094140038L;
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
    private LocalDateTime beginDate;
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


}

