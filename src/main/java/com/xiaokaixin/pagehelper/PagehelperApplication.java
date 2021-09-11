package com.xiaokaixin.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaokaixin.pagehelper.dao")
public class PagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagehelperApplication.class, args);
    }

}
