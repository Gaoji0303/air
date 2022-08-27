package com.tiantian.manage.service;

import com.tiantian.manage.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author 科比门徒
 * @since 2022-08-27
 */
public interface UserService extends IService<User> {


    String  getUser();
}
