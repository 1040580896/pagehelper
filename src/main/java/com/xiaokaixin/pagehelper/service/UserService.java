package com.xiaokaixin.pagehelper.service;

import com.xiaokaixin.pagehelper.entity.User;

import java.util.List;

/**
 * @Author xiaokaixin
 * @Date 2021/9/11 18:05
 * @Version 1.0
 */
public interface UserService  {

    // 查询所以用户
    List<User> getAllUser();
}
