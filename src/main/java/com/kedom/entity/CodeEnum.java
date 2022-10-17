package com.kedom.entity;

import lombok.Getter;

@Getter
public enum CodeEnum {
    SUCCESS(2000,"处理成功"),
    ERROR_PASSWORD(1001,"密码错误"),
    ERROR_CAPTCHA(1002,"验证码错误"),
    ERROR_USERNAME_REPEAT(1003,"用户名重复"),

    ERROR_PATH(4004,"请求地址错误"),
    ERROR_PARAMETER(4005,"请求服务参数错误"),
    ERROR_SERVER(5005,"服务器内部发生错误");


    private int code;
    private String message;



    CodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
