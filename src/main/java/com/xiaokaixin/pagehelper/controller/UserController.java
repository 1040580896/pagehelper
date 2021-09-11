package com.xiaokaixin.pagehelper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaokaixin.pagehelper.entity.User;
import com.xiaokaixin.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author xiaokaixin
 * @Date 2021/9/11 18:08
 * @Version 1.0
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/")
    public String findUser(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        String orderBy = "id asc";
        PageHelper.startPage(pageNum,5,orderBy);
        List<User> list = userService.getAllUser();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }
}
