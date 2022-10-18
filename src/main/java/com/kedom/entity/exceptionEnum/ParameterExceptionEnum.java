package com.kedom.entity.exceptionEnum;

import lombok.Getter;

@Getter
public enum ParameterExceptionEnum {
    Parameter_Is_NULL("参数未初始化"),
    Parameter_Length_Long("参数过长"),
    Parameter_Length_Short("参数过短"),
    Parameter_Is_Empty("参数为空");




    ParameterExceptionEnum(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }


    private String exceptionMessage;
}
