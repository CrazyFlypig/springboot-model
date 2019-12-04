package com.cc.springbootmodel.controller;

import com.cc.springbootmodel.core.ret.RetResult;
import com.cc.springbootmodel.core.ret.RetResponse;
import com.cc.springbootmodel.core.utils.UUIDUtil;
import com.cc.springbootmodel.entity.Test;
import com.cc.springbootmodel.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: TestController类
* @author cc
* @date 2019/12/03 13:21
*/
@RestController
@RequestMapping("/test")
@Api(tags = {"测试操作接口"}, description = "TestController")
public class TestController {

    @Resource
    private TestService testService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(Test test) throws Exception{
        test.setId(UUIDUtil.getUUID());
        Integer state = testService.insert(test);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = testService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(Test test) throws Exception {
        Integer state = testService.update(test);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/selectById")
    public RetResult<Test> selectById(@RequestParam String id) throws Exception {
        Test test = testService.selectById(id);
        return RetResponse.makeOKRsp(test);
    }

    /**
    * @Description: 分页查询
    * @param pageNum 页码
    * @param pageSize 每页条数
    * @Reutrn RetResult<PageInfo<Test>>
    */
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum", value = "当前页码", dataType = "Integer", paramType = "query"),
        @ApiImplicitParam(name = "pageSize", value = "每页显示条数", dataType = "Integer", paramType = "query")
    })
    @GetMapping("/list")
    public RetResult<PageInfo<Test>> list(@RequestParam(defaultValue="0") Integer pageNum,@RequestParam(defaultValue ="0") Integer pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        List<Test> list = testService.selectAll();
        PageInfo<Test> pageInfo = new PageInfo<Test>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}