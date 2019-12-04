package com.cc.springbootmodel.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cc.springbootmodel.entity.DataDir;
import com.cc.springbootmodel.core.universal.Service;
import com.cc.springbootmodel.entity.response.Catalog;
import com.cc.springbootmodel.entity.response.DataList;

import java.util.List;

/**
 * @author cc
 * @Description: DataDirService接口
 * @date 2019/12/03 17:49
 */
public interface DataDirService extends Service<DataDir> {

    public JSONObject getCatalogService();

    public JSONArray getCountDataService(String catalogPath);

    public List<DataList> getDataListByPath(String catalogPath);
}