package com.cc.springbootmodel.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cc.springbootmodel.core.ret.RetResult;
import com.cc.springbootmodel.core.ret.RetResponse;
import com.cc.springbootmodel.core.utils.UUIDUtil;
import com.cc.springbootmodel.entity.DataDir;
import com.cc.springbootmodel.entity.response.DataList;
import com.cc.springbootmodel.service.DataDirService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: DataDirController类
* @author cc
* @date 2019/12/03 17:49
*/
@CrossOrigin
@RestController
@RequestMapping("/dataDir")
@Api(tags = {"数据目录操作接口"}, description = "DataDirController")
public class DataDirController {

    @Resource
    private DataDirService dataDirService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(DataDir dataDir) throws Exception{
        dataDir.setId(UUIDUtil.getUUID());
        Integer state = dataDirService.insert(dataDir);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = dataDirService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(DataDir dataDir) throws Exception {
        Integer state = dataDirService.update(dataDir);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/selectById")
    public RetResult<DataDir> selectById(@RequestParam String id) throws Exception {
        DataDir dataDir = dataDirService.selectById(id);
        return RetResponse.makeOKRsp(dataDir);
    }

    /**
    * @Description: 分页查询
    * @param pageNum 页码
    * @param pageSize 每页条数
    * @Reutrn RetResult<PageInfo<DataDir>>
    */
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum", value = "当前页码", dataType = "Integer", paramType = "query"),
        @ApiImplicitParam(name = "pageSize", value = "每页显示条数", dataType = "Integer", paramType = "query")
    })
    @GetMapping("/list")
    public RetResult<PageInfo<DataList>> list(@RequestParam(defaultValue="0") Integer pageNum, @RequestParam(defaultValue ="0") Integer pageSize, @RequestParam String catalogPath) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        List<DataList> list = dataDirService.getDataListByPath(catalogPath);
        PageInfo<DataList> pageInfo = new PageInfo<DataList>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }

    @GetMapping("/getCatalog")
    public RetResult<JSONArray> getCatalog() throws Exception{
        JSONObject response = dataDirService.getCatalogService();
        String object = response.toJSONString();
        String tmp = "[" + object + "]";
        JSONArray array = JSONArray.parseArray(tmp);
        return RetResponse.makeOKRsp(array);
    }

    @GetMapping("/getCountData")
    public RetResult<JSONArray> getCountData(@RequestParam String catalogPath) throws Exception{
        JSONArray result = dataDirService.getCountDataService(catalogPath);
        return RetResponse.makeOKRsp(result);
    }
}