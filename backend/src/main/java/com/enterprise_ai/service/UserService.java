package com.enterprise_ai.service;

import com.enterprise_ai.pojo.User;

public interface UserService {
    //根据用户名查询用户
    User findByUsername(String username);

    //添加
    void register(String username,String password);

}
