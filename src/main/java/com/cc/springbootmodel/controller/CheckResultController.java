package com.cc.springbootmodel.controller;

import com.cc.springbootmodel.service.CheckResultService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* @Description: CheckResultController类
* @author cc
* @date 2019/07/18 10:43
*/
@RestController
@RequestMapping("/checkResult")
@Api(tags = {"核查结果表操作接口"}, description = "CheckResultController")
public class CheckResultController {

    @Resource
    private CheckResultService checkResultService;

}