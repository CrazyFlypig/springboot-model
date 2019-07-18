package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.dao.CheckResultMapper;
import com.cc.springbootmodel.service.CheckResultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: CheckResultService接口实现类
* @author cc
* @date 2019/07/18 10:43
*/
@Service
public class CheckResultServiceImpl implements CheckResultService {

    @Resource
    private CheckResultMapper checkResultMapper;

}