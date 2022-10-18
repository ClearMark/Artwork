package com.kedom.entity;


public class RequestIDState {

    final public static RequestIDState NOT_SUBMIT=new RequestIDState("服务未提交");
    final public static RequestIDState SERVICING=new RequestIDState("服务中");
    final public static RequestIDState SUCCESS=new RequestIDState("服务已完成");

   public static ThreadLocal<String> threadLocal=new InheritableThreadLocal<>();

    private String state;
    RequestIDState(String state)
    {
        this.state=state;
    }

    @Override
    public String toString() {
        return state;
    }
}
