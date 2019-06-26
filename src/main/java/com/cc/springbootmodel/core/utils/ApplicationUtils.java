package com.cc.springbootmodel.core.utils;

import java.util.UUID;

/**
 * @author cc
 * @date 2019-05-27 23:10:10
 */

public class ApplicationUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
