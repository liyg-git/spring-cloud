package com.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 李永刚
 * @Param
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "queryUserInfoFallback")
    public String queryUserInfo(String userId) {
        return restTemplate.getForObject("http://SPRINGCLOUD-EUREKA-CLIENT/api/queryUserInfo?userId=" + userId, String.class);
    }
    public String queryUserInfoFallback(String userId) {
        return "queryUserInfo by userId：" + userId + " err！from ribbon hystrix";
    }
}
