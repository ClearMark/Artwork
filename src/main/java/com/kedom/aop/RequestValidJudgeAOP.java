package com.kedom.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RequestValidJudgeAOP {
    @Pointcut("@annotation(com.kedom.annotation.RequestID)        ")
    private void pt1() {}

    @Around("pt1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aaa");

        return null;
    }
}
