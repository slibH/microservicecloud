package com.hxy.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        //return new RoundRobinRule();
        //return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
        return new RetryRule();
    }
}
