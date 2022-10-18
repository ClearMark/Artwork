package com.kedom.myException;

import com.kedom.entity.OperationExceptionMark;
import com.kedom.entity.exceptionEnum.ParameterExceptionEnum;

public class ParameterException extends RuntimeException implements OperationExceptionMark {
    private ParameterExceptionEnum parameterExceptionEnumEnum;

    public ParameterException(ParameterExceptionEnum parameterExceptionEnumEnum) {
        super(parameterExceptionEnumEnum.getExceptionMessage());
        this.parameterExceptionEnumEnum = parameterExceptionEnumEnum;
    }
}
