package com.cc.springbootmodel.core.configurer;

import com.cc.springbootmodel.common.CommonConf;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

/**
 * @author cc
 * @date 2019-06-25 17:59:59
 */

@Configuration
public class MultipartConfigurer {

    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofBytes(CommonConf.uploadFileMaxSize * 1024 *1024));
        return factory.createMultipartConfig();
    }
}
