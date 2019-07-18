package com.cc.springbootmodel.controller;

import com.cc.springbootmodel.core.ret.RetResponse;
import com.cc.springbootmodel.core.ret.RetResult;
import com.cc.springbootmodel.core.utils.ApplicationUtils;
import com.cc.springbootmodel.entity.CheckJobInstanceLog;
import com.cc.springbootmodel.service.CheckJobInstanceLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: CheckJobInstanceLogController类
* @author cc
* @date 2019/07/18 10:41
*/
@RestController
@RequestMapping("/checkJobInstanceLog")
@Api(tags = {"作业执行示例表操作接口"}, description = "CheckJobInstanceLogController")
public class CheckJobInstanceLogController {

    @Resource
    private CheckJobInstanceLogService checkJobInstanceLogService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(CheckJobInstanceLog checkJobInstanceLog) throws Exception{
        checkJobInstanceLog.setInstanceId(ApplicationUtils.getUUID());
        Integer state = checkJobInstanceLogService.insert(checkJobInstanceLog);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = checkJobInstanceLogService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(CheckJobInstanceLog checkJobInstanceLog) throws Exception {
        Integer state = checkJobInstanceLogService.update(checkJobInstanceLog);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/selectById")
    public RetResult<CheckJobInstanceLog> selectById(@RequestParam String id) throws Exception {
        CheckJobInstanceLog checkJobInstanceLog = checkJobInstanceLogService.selectById(id);
        return RetResponse.makeOKRsp(checkJobInstanceLog);
    }

    /**
    * @Description: 分页查询
    * @param pageNum 页码
    * @param pageSize 每页条数
    * @Reutrn RetResult<PageInfo<CheckJobInstanceLog>>
    */
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum", value = "当前页码", dataType = "Integer", paramType = "query"),
        @ApiImplicitParam(name = "pageSize", value = "每页显示条数", dataType = "Integer", paramType = "query")
    })
    @GetMapping("/list")
    public RetResult<PageInfo<CheckJobInstanceLog>> list(@RequestParam(defaultValue="0") Integer pageNum,@RequestParam(defaultValue ="0") Integer pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        List<CheckJobInstanceLog> list = checkJobInstanceLogService.selectAll();
        PageInfo<CheckJobInstanceLog> pageInfo = new PageInfo<CheckJobInstanceLog>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}