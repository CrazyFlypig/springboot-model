package com.cc.springbootmodel.core.utils;

import java.util.UUID;

/**
 * @author cc
 * @date 2019-06-26 11:01:01
 */

public class UUIDUtil {

    //获取32UUID，常用于数据库主键
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    //获取指定位数的UUID
    public static String getUUID(int length){
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        if (length > 32){
            length = 32;
        }
        return uuid.substring(0,length);
    }
}
