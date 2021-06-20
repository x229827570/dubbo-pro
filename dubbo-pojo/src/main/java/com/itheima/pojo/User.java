package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author XuZhuHong
 * @CreateTime 2021/6/20 16:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    
    private int id;
    private String username;
    private String password;
}
