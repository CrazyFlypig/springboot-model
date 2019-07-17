package com.cc.springbootmodel.service;

import com.cc.springbootmodel.entity.UserInfo;
import com.cc.springbootmodel.core.universal.Service;

/**
* @Description: UserInfoService接口
* @author cc
* @date 2019/07/17 21:32
*/
public interface UserInfoService extends Service<UserInfo> {
    public int getNum();
}