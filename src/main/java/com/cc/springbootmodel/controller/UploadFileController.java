package com.cc.springbootmodel.controller;

import com.cc.springbootmodel.core.ret.RetResponse;
import com.cc.springbootmodel.core.ret.RetResult;
import com.cc.springbootmodel.core.utils.UploadActionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * 文件上传
 *
 * @author cc
 * @date 2019-06-26 11:40:40
 */

@RestController
@RequestMapping("/uploadFile")
public class UploadFileController {

    @PostMapping("/upload")
    public RetResult<List<String>> upload(HttpServletRequest httpServletRequest) throws IOException {
        List<String> list = UploadActionUtil.uploadFile(httpServletRequest);
        return RetResponse.makeOKRsp(list);
    }
}
