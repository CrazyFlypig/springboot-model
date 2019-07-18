package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.core.universal.AbstractService;
import com.cc.springbootmodel.dao.CheckInfoConfigMapper;
import com.cc.springbootmodel.entity.CheckInfoConfig;
import com.cc.springbootmodel.service.CheckInfoConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: CheckInfoConfigService接口实现类
* @author cc
* @date 2019/07/18 10:13
*/
@Service
public class CheckInfoConfigServiceImpl extends AbstractService<CheckInfoConfig> implements CheckInfoConfigService {

    @Resource
    private CheckInfoConfigMapper checkInfoConfigMapper;

}