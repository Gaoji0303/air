package com.tiantian.manage.service.impl;

import com.tiantian.manage.entity.User;
import com.tiantian.manage.mapper.user.UserMapper;
import com.tiantian.manage.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 科比门徒
 * @since 2022-08-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    public String  getUser(){

        User user = new User();
        user.setId(UUID.randomUUID().toString().trim().replaceAll("-", ""));
        user.setAccount( new Integer(new Random().nextInt()).toString());
        user.setName("王八");
        user.setEmail("wangba@qq.com");
        user.setMobile("120");
        user.setPassword("1111");
        user.setCreateTime(new Date());
        int insert = userMapper.insert(user);
        return  "ok";
    }



}
