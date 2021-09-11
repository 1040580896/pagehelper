package com.xiaokaixin.pagehelper.service.impl;

import com.xiaokaixin.pagehelper.dao.UserDao;
import com.xiaokaixin.pagehelper.entity.User;
import com.xiaokaixin.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xiaokaixin
 * @Date 2021/9/11 18:05
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
