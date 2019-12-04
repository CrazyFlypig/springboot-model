package com.cc.springbootmodel.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cc.springbootmodel.dao.DataDirMapper;
import com.cc.springbootmodel.entity.DataDir;
import com.cc.springbootmodel.entity.response.Catalog;
import com.cc.springbootmodel.entity.response.CountData;
import com.cc.springbootmodel.entity.response.DataList;
import com.cc.springbootmodel.service.DataDirService;
import com.cc.springbootmodel.core.universal.AbstractService;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* @Description: DataDirService接口实现类
* @author cc
* @date 2019/12/03 17:49
*/
@Service
public class DataDirServiceImpl extends AbstractService<DataDir> implements DataDirService {

    @Resource
    private DataDirMapper dataDirMapper;

    /**
     * 获取目录
     * @return 目录数据
     */
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
            if (resourceNum == 0){
                continue;
            }
            Catalog firstValue = new Catalog(first, first, 2, "code", resourceNum, root.getCatalogId(),
                    new StringBuffer().append(root.getCatalogPath()).append(",").append(first).toString(),
                    new StringBuffer().append(root.getCatalogPathName()).append(",").append(first).toString());
            root.getChildren().add(firstValue);
            for (String second : secondKeys){
                temp.setKeySecond(second);
                resourceNum = dataDirMapper.getResourceNum(temp);
                if (resourceNum == 0){
                    continue;
                }
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

    /**
     * 获取统计数据
     * @param catalogPath 当前目录节点
     * @return 当前节点的统计数据
     */
    @Override
    public JSONArray getCountDataService(String catalogPath) {
        DataDir dataDirAll = new DataDir();
        DataDir dataDirOrg = new DataDir();
        DataDir dataDirUnOrg = new DataDir();
        dataDirOrg.setOrgType("结构化");
        dataDirUnOrg.setOrgType("非结构化");
        CountData result = new CountData();
        String[] values = catalogPath.split(",");
        if (values.length >= 2){
            dataDirAll.setKeyFirst(values[1]);
            dataDirOrg.setKeyFirst(values[1]);
            dataDirUnOrg.setKeyFirst(values[1]);
        }
        if (values.length >= 3){
            dataDirAll.setKeySecond(values[2]);
            dataDirOrg.setKeySecond(values[2]);
            dataDirUnOrg.setKeySecond(values[2]);
        }
        if (values.length >= 4){
            dataDirAll.setKeyClass(values[3]);
            dataDirOrg.setKeyClass(values[3]);
            dataDirUnOrg.setKeyClass(values[3]);
        }
        if (values.length >= 4){
            dataDirAll.setAttrClass(values[4]);
            dataDirOrg.setAttrClass(values[4]);
            dataDirUnOrg.setAttrClass(values[4]);
        }
        try {
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
            result.setSpeedUnOrg(dataDirMapper.getSpeed(dataDirUnOrg));
        }catch (Exception e){
            e.printStackTrace();
        }


        String resultStr = result.getData();

        return JSONArray.parseArray(resultStr);
    }

    /**
     * 获取数据详情
     * @param catalogPath 当前目录节点
     * @return 当前节点的详情数据
     */
    @Override
    public List<DataList> getDataListByPath(String catalogPath) {
        DataDir dataDir = new DataDir();
        String[] values = catalogPath.split(",");
        if (values.length >= 2){
            dataDir.setKeyFirst(values[1]);
        }
        if (values.length >= 3){
            dataDir.setKeySecond(values[2]);
        }
        if (values.length >= 4){
            dataDir.setKeyClass(values[3]);
        }
        if (values.length >= 4){
            dataDir.setAttrClass(values[4]);
        }
        List<Map<String,Object>> data = dataDirMapper.getDataDirList(dataDir);
        List<DataList> list = new ArrayList<>();
        try {
            for (Map<String,Object> record : data){
                DataList dl = new DataList();
                dl.setResourceName((String) record.get("resource_name"));
                dl.setDataDayCycle(((BigDecimal) record.get("data_day_increase_num")).intValue());
                dl.setDataRecords(((BigDecimal) record.get("data_records")).intValue());
                dl.setDataSize((Double) record.get("data_size"));
                dl.setOrgType((String) record.get("org_type"));
                dl.setUpdateCycle((String) record.get("update_cycle"));
                list.add(dl);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


}