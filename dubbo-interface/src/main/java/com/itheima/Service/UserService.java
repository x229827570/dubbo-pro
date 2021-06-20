package com.itheima.Service;

import com.itheima.pojo.User;

/**
 * @Author XuZhuHong
 * @CreateTime 2021/6/19 23:11
 */
public interface UserService {
    String sayHello();
    User findById(int id);
}
