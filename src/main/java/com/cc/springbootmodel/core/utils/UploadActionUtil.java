package com.cc.springbootmodel.core.utils;

import com.cc.springbootmodel.common.CommonConf;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 文件上传控制器
 *
 * @author cc
 * @date 2019-06-26 10:50:50
 */

public class UploadActionUtil {

    public static List<String> uploadFile(HttpServletRequest request) throws IOException {
        List<String> list = new ArrayList<>();
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        if (multipartResolver.isMultipart(request)){
            MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
            Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
            while (iterator.hasNext()){
                //取得上传文件
                MultipartFile file = multipartHttpServletRequest.getFile(iterator.next());
                if (file != null){
                    //取得上传文件的文件名称
                    String myFileName = file.getOriginalFilename();
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在
                    if (!myFileName.trim().equals("")){
                        String fileType = myFileName.substring(myFileName.lastIndexOf("."));
                        String tempName = UUIDUtil.getUUID(15) + fileType;
                        //创建文件夹
                        String folderPath = CommonConf.uploadFilePath + CommonConf.pathSeparator + folderName();
                        File fileFolder = new File(folderPath);
                        if (!fileFolder.exists() && !fileFolder.isDirectory()){
                            fileFolder.mkdir();
                        }
                        File uploadFile = new File(folderPath + CommonConf.pathSeparator + tempName);
                        file.transferTo(uploadFile);
                        myFileName = folderName() + CommonConf.pathSeparator + tempName;
                        list.add(CommonConf.uploadFilePath + CommonConf.pathSeparator + myFileName);
                    }
                }
            }
        }
        return list;
    }

    /**
     * 当前日志文件名
     * @return yyyyMMdd
     */
    private static String folderName(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String str = sdf.format(new Date());
        return str;
    }
}
