package com.service;

import org.springframework.stereotype.Component;

/**
 * @author 李永刚
 * @Param
 */
@Component
public class FeignServiceHystrix implements FeignService{
    @Override
    public String queryUserInfo(String userId) {
        return "queryUserInfo by userId：" + userId + " err！from feign hystrix";
    }
}
