package com.itheima.service.Impl;


import com.itheima.Service.UserService;
import com.itheima.pojo.User;
import org.apache.dubbo.config.annotation.Service;


/**
 * @Author XuZhuHong
 * @CreateTime 2021/6/19 23:12
 */
@Service(version ="v1.0",weight = 100)
public class UserServiceImpl implements UserService {

    public String sayHello() {
        return "Hello Dubbo！！！！！！！！";
    }

    public User findById(int id) {
        User user = new User(id,"zs","123");
        return user;
    }
}
