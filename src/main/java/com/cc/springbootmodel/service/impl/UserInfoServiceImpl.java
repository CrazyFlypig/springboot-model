package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.core.ret.ServiceException;
import com.cc.springbootmodel.core.universal.AbstractService;
import com.cc.springbootmodel.dao.UserInfoMapper;
import com.cc.springbootmodel.entity.UserInfo;
import com.cc.springbootmodel.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cc
 * @date 2019-05-27 13:27:27
 */

@Service
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(String id) {
        UserInfo userInfo = mapper.selectByPrimaryKey(id);
        if (userInfo == null){
            throw new ServiceException("暂无用户");
        }
        return userInfo;
    }


    @Override
    public PageInfo<UserInfo> selectAll(Integer page, Integer size) {
        //开启分页查询，写在查询语句上方
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页。
        PageHelper.startPage(page, size);
        List<UserInfo> userInfoList = userInfoMapper.selectAll();
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoList);
        return pageInfo;
    }
}
