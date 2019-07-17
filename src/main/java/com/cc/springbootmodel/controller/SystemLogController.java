package com.cc.springbootmodel.controller;

import com.cc.springbootmodel.core.ret.RetResult;
import com.cc.springbootmodel.core.ret.RetResponse;
import com.cc.springbootmodel.core.utils.ApplicationUtils;
import com.cc.springbootmodel.entity.SystemLog;
import com.cc.springbootmodel.service.SystemLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: SystemLogController类
* @author cc
* @date 2019/07/17 21:32
*/
@RestController
@RequestMapping("/systemLog")
@Api(tags = {"系统日志表操作接口"}, description = "SystemLogController")
public class SystemLogController {

    @Resource
    private SystemLogService systemLogService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(SystemLog systemLog) throws Exception{
        systemLog.setId(ApplicationUtils.getUUID());
        Integer state = systemLogService.insert(systemLog);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = systemLogService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(SystemLog systemLog) throws Exception {
        Integer state = systemLogService.update(systemLog);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/selectById")
    public RetResult<SystemLog> selectById(@RequestParam String id) throws Exception {
        SystemLog systemLog = systemLogService.selectById(id);
        return RetResponse.makeOKRsp(systemLog);
    }

    /**
    * @Description: 分页查询
    * @param pageNum 页码
    * @param pageSize 每页条数
    * @Reutrn RetResult<PageInfo<SystemLog>>
    */
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum", value = "当前页码", dataType = "Integer", paramType = "query"),
        @ApiImplicitParam(name = "pageSize", value = "每页显示条数", dataType = "Integer", paramType = "query")
    })
    @GetMapping("/list")
    public RetResult<PageInfo<SystemLog>> list(@RequestParam(defaultValue="0") Integer pageNum,@RequestParam(defaultValue ="0") Integer pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        List<SystemLog> list = systemLogService.selectAll();
        PageInfo<SystemLog> pageInfo = new PageInfo<SystemLog>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}