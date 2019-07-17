package com.cc.springbootmodel.controller;

import com.cc.springbootmodel.core.ret.RetResult;
import com.cc.springbootmodel.core.ret.RetResponse;
import com.cc.springbootmodel.core.utils.ApplicationUtils;
import com.cc.springbootmodel.entity.UserInfo;
import com.cc.springbootmodel.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: UserInfoController类
* @author cc
* @date 2019/07/17 21:32
*/
@RestController
@RequestMapping("/userInfo")
@Api(tags = {"用户信息表操作接口"}, description = "UserInfoController")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(UserInfo userInfo) throws Exception{
        userInfo.setId(ApplicationUtils.getUUID());
        Integer state = userInfoService.insert(userInfo);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = userInfoService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(UserInfo userInfo) throws Exception {
        Integer state = userInfoService.update(userInfo);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/selectById")
    public RetResult<UserInfo> selectById(@RequestParam String id) throws Exception {
        UserInfo userInfo = userInfoService.selectById(id);
        return RetResponse.makeOKRsp(userInfo);
    }

    /**
    * @Description: 分页查询
    * @param pageNum 页码
    * @param pageSize 每页条数
    * @Reutrn RetResult<PageInfo<UserInfo>>
    */
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum", value = "当前页码", dataType = "Integer", paramType = "query"),
        @ApiImplicitParam(name = "pageSize", value = "每页显示条数", dataType = "Integer", paramType = "query")
    })
    @GetMapping("/list")
    public RetResult<PageInfo<UserInfo>> list(@RequestParam(defaultValue="0") Integer pageNum,@RequestParam(defaultValue ="0") Integer pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfo> list = userInfoService.selectAll();
        PageInfo<UserInfo> pageInfo = new PageInfo<UserInfo>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }

    @GetMapping("/num")
    public RetResult<Integer> countNum(){
        int num = userInfoService.getNum();
        return RetResponse.makeOKRsp(num);
    }
}