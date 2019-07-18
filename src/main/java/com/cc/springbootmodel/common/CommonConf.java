package com.cc.springbootmodel.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * @author cc
 * @date 2019-06-25 17:50:50
 */

public class CommonConf {
    private static Logger logger = LoggerFactory.getLogger(CommonConf.class);

    public static String uploadFilePath;
    public static Long uploadFileMaxSize;
    public static String pathSeparator;

    static {
        try {
            //加载配置文件
            Properties properties = new Properties();
            properties.load(CommonConf.class.getResourceAsStream("/conf-param.properties"));

            uploadFilePath = properties.getProperty("uploadFilePath").trim();
            uploadFileMaxSize = Long.parseLong(properties.getProperty("uploadFileMaxSize").trim());
            pathSeparator = properties.getProperty("pathSeparator").trim();

        } catch (Exception e) {
            logger.error("读取信息配置文件出错");
            e.printStackTrace();
        }
        logger.info("参数配置加载成功");
    }
}
