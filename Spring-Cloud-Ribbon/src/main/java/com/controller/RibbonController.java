package com.controller;

import com.service.RibbonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 李永刚
 * @Param
 */
@RestController
public class RibbonController {
    @Resource
    private RibbonService ribbonService;

    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public String queryUserInfo(@RequestParam String userId) {
        return ribbonService.queryUserInfo(userId) + " From Ribbon";
    }
}
