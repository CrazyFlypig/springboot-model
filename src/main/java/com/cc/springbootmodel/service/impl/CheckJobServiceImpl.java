package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.core.universal.AbstractService;
import com.cc.springbootmodel.dao.CheckJobMapper;
import com.cc.springbootmodel.entity.CheckJob;
import com.cc.springbootmodel.service.CheckJobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: CheckJobService接口实现类
* @author cc
* @date 2019/07/18 10:38
*/
@Service
public class CheckJobServiceImpl extends AbstractService<CheckJob> implements CheckJobService {

    @Resource
    private CheckJobMapper checkJobMapper;

}