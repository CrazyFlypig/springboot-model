package com.cc.springbootmodel.controller;

import com.cc.springbootmodel.core.ret.RetResponse;
import com.cc.springbootmodel.core.ret.RetResult;
import com.cc.springbootmodel.core.utils.ApplicationUtils;
import com.cc.springbootmodel.entity.CheckJob;
import com.cc.springbootmodel.service.CheckJobService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: CheckJobController类
* @author cc
* @date 2019/07/18 10:38
*/
@RestController
@RequestMapping("/checkJob")
@Api(tags = {"核数作业表操作接口"}, description = "CheckJobController")
public class CheckJobController {

    @Resource
    private CheckJobService checkJobService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(CheckJob checkJob) throws Exception{
        checkJob.setJobId(ApplicationUtils.getUUID());
        Integer state = checkJobService.insert(checkJob);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = checkJobService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(CheckJob checkJob) throws Exception {
        Integer state = checkJobService.update(checkJob);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/selectById")
    public RetResult<CheckJob> selectById(@RequestParam String id) throws Exception {
        CheckJob checkJob = checkJobService.selectById(id);
        return RetResponse.makeOKRsp(checkJob);
    }

    /**
    * @Description: 分页查询
    * @param pageNum 页码
    * @param pageSize 每页条数
    * @Reutrn RetResult<PageInfo<CheckJob>>
    */
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum", value = "当前页码", dataType = "Integer", paramType = "query"),
        @ApiImplicitParam(name = "pageSize", value = "每页显示条数", dataType = "Integer", paramType = "query")
    })
    @GetMapping("/list")
    public RetResult<PageInfo<CheckJob>> list(@RequestParam(defaultValue="0") Integer pageNum,@RequestParam(defaultValue ="0") Integer pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        List<CheckJob> list = checkJobService.selectAll();
        PageInfo<CheckJob> pageInfo = new PageInfo<CheckJob>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}