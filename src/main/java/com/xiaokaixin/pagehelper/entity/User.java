package com.xiaokaixin.pagehelper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author xiaokaixin
 * @Date 2021/9/11 18:01
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class User {

    private Integer id;
    private String username;
    private String password;
}
