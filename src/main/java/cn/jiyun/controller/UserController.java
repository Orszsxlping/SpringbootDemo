package cn.jiyun.controller;

import cn.jiyun.config.JdbcConfig;
import cn.jiyun.config.User;
import cn.jiyun.config.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    JdbcConfig jdbcConfig;

    @Autowired
    User user;

    @Autowired
    User1 user1;

    @RequestMapping("index")
    public String index(){

        return "我是springboot项目"+jdbcConfig;
    }

}
