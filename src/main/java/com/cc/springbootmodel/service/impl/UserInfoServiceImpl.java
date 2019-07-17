package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.dao.UserInfoMapper;
import com.cc.springbootmodel.entity.UserInfo;
import com.cc.springbootmodel.service.UserInfoService;
import com.cc.springbootmodel.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: UserInfoService接口实现类
* @author cc
* @date 2019/07/17 21:32
*/
@Service
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public int getNum() {
        int num = userInfoMapper.countNum();
        return num;
    }
}