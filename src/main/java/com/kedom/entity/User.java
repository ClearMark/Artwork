package com.kedom.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import lombok.Data;


@Data
/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public class User implements Serializable {
    private static final long serialVersionUID = 108488149957627274L;
    /**
     * 主键id 绑定其他用户编号
     */
    private String userId;
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
     * 账号状态 0 正常使用  1有时封禁  2永久封禁 3注销
     */
    private Integer userState;


    public static String createId()
    {
        StringBuilder stringBuilder=new StringBuilder("user");
        stringBuilder.append(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        return stringBuilder.toString();


    }


}

