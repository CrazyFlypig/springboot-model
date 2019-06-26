package com.cc.springbootmodel.core.ret;


import java.io.Serializable;

/**
 * 业务异常类
 *
 * @author cc
 * @date 2019-05-27 15:58:58
 */

public class ServiceException extends RuntimeException implements Serializable {

    private static final long servialVersionUID = 1213855733833039552L;

    public ServiceException(){
    }

    public ServiceException(String msg){
        super(msg);
    }

    public ServiceException(String msg,Throwable cause){
        super(msg,cause);
    }
}
