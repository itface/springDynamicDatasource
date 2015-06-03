package com.jd.controller;

import com.jd.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by wangrongtao on 15/6/1.
 */
@Controller
@RequestMapping("/test")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping("/insert")
    public void insert(String userName){
        userInfoService.save(userName);
    }
}
