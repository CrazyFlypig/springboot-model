package com.cc.springbootmodel.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test_post")
    public JSONObject testRequest(){
        String str = "{\n" +
                "    \"code\": 200,\n" +
                "    \"data\": \"成功\",\n" +
                "    \"msg\": \"sucess\"" +
                "}";
        JSONObject result = JSONObject.parseObject(str);
        return result;
    }

}
