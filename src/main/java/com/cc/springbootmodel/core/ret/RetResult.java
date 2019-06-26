package com.cc.springbootmodel.core.ret;

/**
 * 返回对象实体
 *
 * @author cc
 * @date 2019-05-27 15:29:29
 */

public class RetResult<T> {

    public int code;
    private String msg;
    private T data;

    public RetResult<T> setCode(RetCode retCode){
        this.code = retCode.code;
        return this;
    }

    public RetResult<T> setCode(int code){
        this.code = code;
        return this;
    }

    public RetResult<T> setMsg(String msg){
        this.msg = msg;
        return this;
    }

    public RetResult<T> setData(T data){
        this.data = data;
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
