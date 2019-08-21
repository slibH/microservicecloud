package com.hxy.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: hexueyuan
 * @Name ConfigBean
 * @Date: 2019-08-21 13:13
 * @Description:
 * @Version 1.0
 */
@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
