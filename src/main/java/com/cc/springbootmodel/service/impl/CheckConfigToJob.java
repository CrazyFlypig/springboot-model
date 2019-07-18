package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.dao.CheckInfoConfigMapper;
import com.cc.springbootmodel.entity.CheckInfoConfig;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * 根据配置生成文件
 *
 * @author cc
 * @date 2019-07-18 14:39:39
 */

public class CheckConfigToJob implements Job {

    private Logger logger = LoggerFactory.getLogger(CheckConfigToJob.class);

    @Resource
    private CheckInfoConfigMapper checkInfoConfigMapper;
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

    }
    public void addJobFromConfig(){
        logger.info("获取未使用的配置");
        logger.debug("执行的SQL：{}，参数：{}","SELECT * FROM `check_info_config` WHERE check_statute = 0 ","");
        List<CheckInfoConfig> checkInfoConfigs = checkInfoConfigMapper.getUnUseCheckInfo();
    }

}
