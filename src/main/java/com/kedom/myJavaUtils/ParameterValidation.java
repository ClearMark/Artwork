package com.kedom.myJavaUtils;

import com.kedom.entity.exceptionEnum.ParameterExceptionEnum;
import com.kedom.myException.ParameterException;

public final class ParameterValidation {

    public static <T> void checkNotNull(T t) {
        if (t==null)
        {
            throw new ParameterException(ParameterExceptionEnum.Parameter_Is_NULL);
        }
    }

    public static <T> void checkNotEmpty(String s) {
        if (s==null)
        {
            throw new ParameterException(ParameterExceptionEnum.Parameter_Is_NULL);
        }
        if (s.isEmpty()){
            throw new ParameterException(ParameterExceptionEnum.Parameter_Is_Empty);
        }
    }

}
