package com.cc.springbootmodel.dao;

import com.cc.springbootmodel.core.universal.Mapper;
import com.cc.springbootmodel.entity.UserInfo;
import org.apache.ibatis.annotations.Select;

public interface UserInfoMapper extends Mapper<UserInfo> {
    @Select("select count(1) from user_info")
    int countNum();
}