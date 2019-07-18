package com.cc.springbootmodel.dao;

import com.cc.springbootmodel.core.universal.Mapper;
import com.cc.springbootmodel.entity.CheckInfoConfig;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CheckInfoConfigMapper extends Mapper<CheckInfoConfig> {

    //获取未使用的配置
    @Select("SELECT * FROM `check_info_config` WHERE check_statute = 0 ")
    List<CheckInfoConfig> getUnUseCheckInfo();

}