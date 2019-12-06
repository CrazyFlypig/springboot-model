package com.cc.springbootmodel.dao;

import com.cc.springbootmodel.core.universal.Mapper;
import com.cc.springbootmodel.entity.DataDir;
import com.cc.springbootmodel.entity.response.DataList;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DataDirMapper extends Mapper<DataDir> {

    //获取资源总数
    public Integer getResourceNum(@Param("dataDir") DataDir dataDir);
    //获取记录数
    public Long getRecordNum(@Param("dataDir") DataDir dataDir);
    //获取数据量
    public Double getDataSize(@Param("dataDir") DataDir dataDir);
    //获取每天增量
    public Integer getSpeed(@Param("dataDir") DataDir dataDir);
    //获取一级列表
    public List<String> getFirstKeyList();
    //获取二级列表
    public List<String> getSecondKeyList();
    //获取三级列表
    public List<String> getKeyClassList();
    //获取四级列表
    public List<String> getAttrClassList();
    //获取数据详情
    public List<DataList> getDataDirList(@Param("dataDir") DataDir dataDir);
}