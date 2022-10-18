package com.kedom.aop;

import com.kedom.entity.RequestIDState;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class RequestIDAOP {

//    @Pointcut("@annotation(com.kedom.annotation.RequestID)        ")
//    private void pt1() {}
//
//    @Around("pt1()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        Object[] args = pjp.getArgs();
//
//        return null;
//    }

}
