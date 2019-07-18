package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.core.universal.AbstractService;
import com.cc.springbootmodel.dao.CheckJobInstanceLogMapper;
import com.cc.springbootmodel.entity.CheckJobInstanceLog;
import com.cc.springbootmodel.service.CheckJobInstanceLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: CheckJobInstanceLogService接口实现类
* @author cc
* @date 2019/07/18 10:41
*/
@Service
public class CheckJobInstanceLogServiceImpl extends AbstractService<CheckJobInstanceLog> implements CheckJobInstanceLogService {

    @Resource
    private CheckJobInstanceLogMapper checkJobInstanceLogMapper;

}