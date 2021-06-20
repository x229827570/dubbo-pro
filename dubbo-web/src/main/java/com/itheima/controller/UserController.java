package com.itheima.controller;

import com.itheima.Service.UserService;
import com.itheima.pojo.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XuZhuHong
 * @CreateTime 2021/6/19 23:19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "v1.0",loadbalance ="" )
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return userService.sayHello();
    }

    @RequestMapping("/find")
    public User find(int id) {
        return userService.findById(id);
    }
}
