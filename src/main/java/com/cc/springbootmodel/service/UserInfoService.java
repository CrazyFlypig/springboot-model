package com.cc.springbootmodel.service;

import com.cc.springbootmodel.core.universal.Service;
import com.cc.springbootmodel.entity.UserInfo;
import com.github.pagehelper.PageInfo;

public interface UserInfoService extends Service<UserInfo> {
    PageInfo<UserInfo> selectAll(Integer page, Integer size);
}
