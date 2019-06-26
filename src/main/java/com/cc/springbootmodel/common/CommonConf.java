package com.cc.springbootmodel.common;

import java.util.Properties;

/**
 * @author cc
 * @date 2019-06-25 17:50:50
 */

public class CommonConf {

    public static String uploadFilePath;
    public static Long uploadFileMaxSize;
    public static String pathSeparator;

    static {
        try {
            //加载配置文件
            Properties properties = new Properties();
            properties.load(CommonConf.class.getResourceAsStream("/conf.properties"));

            uploadFilePath = properties.getProperty("uploadFilePath").trim();
            uploadFileMaxSize = Long.parseLong(properties.getProperty("uploadFileMaxSize").trim());
            pathSeparator = properties.getProperty("pathSeparator").trim();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
