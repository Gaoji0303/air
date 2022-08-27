package com.tiantian.manage.controller;


import com.tiantian.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author 科比门徒
 * @since 2022-08-27
 */
@RestController
@RequestMapping("/manage/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/getUser")
    public String getUser(){
        String user = userService.getUser();
        return user;
    }



}

