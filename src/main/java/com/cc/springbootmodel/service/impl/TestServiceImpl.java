package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.dao.TestMapper;
import com.cc.springbootmodel.entity.Test;
import com.cc.springbootmodel.service.TestService;
import com.cc.springbootmodel.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: TestService接口实现类
* @author cc
* @date 2019/12/03 13:21
*/
@Service
public class TestServiceImpl extends AbstractService<Test> implements TestService {

    @Resource
    private TestMapper testMapper;

}