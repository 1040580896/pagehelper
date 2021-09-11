package com.xiaokaixin.pagehelper.dao;

import com.xiaokaixin.pagehelper.entity.User;

import java.util.List;

/**
 * @Author xiaokaixin
 * @Date 2021/9/11 18:01
 * @Version 1.0
 */
public interface UserDao {

    // 查询所以用户
    List<User> getAllUser();
}
