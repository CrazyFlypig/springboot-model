package com.cc.springbootmodel.controller;

import com.cc.springbootmodel.core.ret.RetResponse;
import com.cc.springbootmodel.core.ret.RetResult;
import com.cc.springbootmodel.core.utils.ApplicationUtils;
import com.cc.springbootmodel.entity.CheckInfoConfig;
import com.cc.springbootmodel.service.CheckInfoConfigService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: CheckInfoConfigController类
* @author cc
* @date 2019/07/18 10:13
*/
@RestController
@RequestMapping("/checkInfoConfig")
@Api(tags = {"核数配置表操作接口"}, description = "CheckInfoConfigController")
public class CheckInfoConfigController {

    @Resource
    private CheckInfoConfigService checkInfoConfigService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(CheckInfoConfig checkInfoConfig) throws Exception{
        checkInfoConfig.setId(ApplicationUtils.getUUID());
        Integer state = checkInfoConfigService.insert(checkInfoConfig);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = checkInfoConfigService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(CheckInfoConfig checkInfoConfig) throws Exception {
        Integer state = checkInfoConfigService.update(checkInfoConfig);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/selectById")
    public RetResult<CheckInfoConfig> selectById(@RequestParam String id) throws Exception {
        CheckInfoConfig checkInfoConfig = checkInfoConfigService.selectById(id);
        return RetResponse.makeOKRsp(checkInfoConfig);
    }

    /**
    * @Description: 分页查询
    * @param pageNum 页码
    * @param pageSize 每页条数
    * @Reutrn RetResult<PageInfo<CheckInfoConfig>>
    */
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum", value = "当前页码", dataType = "Integer", paramType = "query"),
        @ApiImplicitParam(name = "pageSize", value = "每页显示条数", dataType = "Integer", paramType = "query")
    })
    @GetMapping("/list")
    public RetResult<PageInfo<CheckInfoConfig>> list(@RequestParam(defaultValue="0") Integer pageNum,@RequestParam(defaultValue ="0") Integer pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        List<CheckInfoConfig> list = checkInfoConfigService.selectAll();
        PageInfo<CheckInfoConfig> pageInfo = new PageInfo<CheckInfoConfig>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}