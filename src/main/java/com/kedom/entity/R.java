package com.kedom.entity;

import lombok.Data;

@Data
public class R {

    private int code;  //错误代码
    private String message;  //错误信息
    private Object data;
    private Integer total=null;

    public R(CodeEnum codeEnum) {
        this.setCode(codeEnum.getCode());
        this.setMessage(codeEnum.getMessage());
    }
    public R fillCode(CodeEnum codeEnum) {
        this.setCode(codeEnum.getCode());
        this.setMessage(codeEnum.getMessage());
        return this;
    }
    public R fillCode ( int code, String message){
            this.setCode(code);
            this.setMessage(message);
            return this;
        }

    public R fillCode (String message){
        this.setMessage(message);
        return this;
    }

    public R fillData (Object data){
            this.setCode(CodeEnum.SUCCESS.getCode());
            this.setMessage(CodeEnum.SUCCESS.getMessage());
            this.data = data;
            return this;
        }
        public static R OK()
        {
            return new R(CodeEnum.SUCCESS);
        }

     public static R Error()
    {
        return new R(CodeEnum.ERROR_SERVER);
    }

    public R(){}

    }



