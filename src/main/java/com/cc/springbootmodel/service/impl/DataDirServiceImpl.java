package com.cc.springbootmodel.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cc.springbootmodel.dao.DataDirMapper;
import com.cc.springbootmodel.entity.DataDir;
import com.cc.springbootmodel.entity.response.Catalog;
import com.cc.springbootmodel.entity.response.CountData;
import com.cc.springbootmodel.service.DataDirService;
import com.cc.springbootmodel.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: DataDirService接口实现类
* @author cc
* @date 2019/12/03 17:49
*/
@Service
public class DataDirServiceImpl extends AbstractService<DataDir> implements DataDirService {

    @Resource
    private DataDirMapper dataDirMapper;

    @Override
    public JSONObject getCatalogService(){
        //初始化根节点，获取对应数据量
        DataDir dataDir = new DataDir();
        int resourceNum = dataDirMapper.getResourceNum(dataDir);
        Catalog root = new Catalog("data-dir", "数据目录", 1, "code",
                resourceNum, "root", "data-dir", "数据目录");
        //获取一级分类
        List<String> firstKeys = dataDirMapper.getFirstKeyList();
        //获取二级分类
        List<String> secondKeys = dataDirMapper.getSecondKeyList();
        //获取三级分类
        List<String> thirdKeys = dataDirMapper.getKeyClassList();
        //获取四级分类
        List<String> fourthKeys = dataDirMapper.getAttrClassList();
        for (String first : firstKeys){
            DataDir temp = new DataDir();
            temp.setKeyFirst(first);
            resourceNum = dataDirMapper.getResourceNum(temp);
            /*if (resourceNum == 0){
                continue;
            }*/
            Catalog firstValue = new Catalog(first, first, 2, "code", resourceNum, root.getCatalogId(),
                    new StringBuffer().append(root.getCatalogPath()).append(",").append(first).toString(),
                    new StringBuffer().append(root.getCatalogPathName()).append(",").append(first).toString());
            root.getChildren().add(firstValue);
            for (String second : secondKeys){
                temp.setKeySecond(second);
                resourceNum = dataDirMapper.getResourceNum(temp);
                /*if (resourceNum == 0){
                    continue;
                }*/
                Catalog secondValue = new Catalog(second, second, 3, "code", resourceNum, firstValue.getCatalogId(),
                        new StringBuffer().append(firstValue.getCatalogPath()).append(",").append(second).toString(),
                        new StringBuffer().append(firstValue.getCatalogPathName()).append(",").append(second).toString());
                firstValue.getChildren().add(secondValue);
                /*for (String third : thirdKeys){
                    temp.setKeyClass(third);
                    resourceNum = dataDirMapper.getResourceNum(temp);
                    if (resourceNum == 0){
                        continue;
                    }
                    Catalog thirdValue = new Catalog(third, third, 4, "code", resourceNum, secondValue.getCatalogId(),
                            new StringBuffer().append(secondValue.getCatalogPath()).append(",").append(third).toString(),
                            new StringBuffer().append(secondValue.getCatalogPathName()).append(",").append(third).toString());
                    secondValue.getChildren().add(thirdValue);
                    for (String fourth : fourthKeys){
                        temp.setAttrClass(fourth);
                        resourceNum = dataDirMapper.getResourceNum(temp);
                        if (resourceNum == 0){
                            continue;
                        }
                        Catalog fourthValue = new Catalog(fourth, fourth, 5, "code", resourceNum, thirdValue.getCatalogId(),
                                new StringBuffer().append(thirdValue.getCatalogPath()).append(",").append(fourth).toString(),
                                new StringBuffer().append(thirdValue.getCatalogPathName()).append(",").append(fourth).toString());
                        thirdValue.getChildren().add(fourthValue);
                    }
                }*/
            }
        }
        String object = JSONArray.toJSONString(root);
        String tmp = "[" + object + "]";
        return JSONObject.parseObject(object);
    }

    @Override
    public JSONArray getCountDataService(String catalogPath) {
        DataDir dataDirAll = new DataDir();
        DataDir dataDirOrg = new DataDir();
        DataDir dataDirUnOrg = new DataDir();
        dataDirOrg.setOrgType("结构化");
        dataDirUnOrg.setOrgType("非结构化");
        CountData result = new CountData();
        String[] values = catalogPath.split(",");
        if (values.length >= 1){
            dataDirAll.setKeyFirst(values[0]);
            dataDirOrg.setKeyFirst(values[0]);
            dataDirUnOrg.setKeyFirst(values[0]);
        }
        if (values.length >= 2){
            dataDirAll.setKeySecond(values[1]);
            dataDirOrg.setKeySecond(values[1]);
            dataDirUnOrg.setKeySecond(values[1]);
        }
        if (values.length >= 3){
            dataDirAll.setKeyClass(values[2]);
            dataDirOrg.setKeyClass(values[2]);
            dataDirUnOrg.setKeyClass(values[2]);
        }
        if (values.length >= 4){
            dataDirAll.setAttrClass(values[3]);
            dataDirOrg.setAttrClass(values[3]);
            dataDirUnOrg.setAttrClass(values[3]);
        }
        //获取资源个数
        result.setResourceNumAll(dataDirMapper.getResourceNum(dataDirAll));
        result.setResourceNumOrg(dataDirMapper.getResourceNum(dataDirOrg));
        result.setResourceNumUnOrg(dataDirMapper.getResourceNum(dataDirUnOrg));
        //获取记录数
        result.setDataCountAll(dataDirMapper.getRecordNum(dataDirAll));
        result.setDataCountOrg(dataDirMapper.getRecordNum(dataDirOrg));
        result.setDataCountUnOrg(dataDirMapper.getRecordNum(dataDirUnOrg));
        //获取存储规模
        result.setDataSizeAll(dataDirMapper.getDataSize(dataDirAll));
        result.setDataSizeOrg(dataDirMapper.getDataSize(dataDirOrg));
        result.setDataSizeUnOrg(dataDirMapper.getDataSize(dataDirUnOrg));
        //获取数据增速
        result.setSpeedAll(dataDirMapper.getSpeed(dataDirAll));
        result.setSpeedOrg(dataDirMapper.getSpeed(dataDirOrg));

        String resultStr = result.getData();

        return JSONArray.parseArray(resultStr);
    }


}