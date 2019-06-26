package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.dao.SystemLogMapper;
import com.cc.springbootmodel.entity.SystemLog;
import com.cc.springbootmodel.service.SystemLogService;
import com.cc.springbootmodel.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: SystemLogService接口实现类
* @author cc
* @date 2019/05/27 23:48
*/
@Service
public class SystemLogServiceImpl extends AbstractService<SystemLog> implements SystemLogService {

    @Resource
    private SystemLogMapper systemLogMapper;

}