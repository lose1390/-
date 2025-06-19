package com.goktech.ops.sys.controller;

import com.alibaba.fastjson2.JSON;
import com.goktech.ops.sys.dao.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制器
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ITUserService userService;

    @RequestMapping("/list")
    public String list(){


        return JSON.toJSONString(userService.list());
    }

}
