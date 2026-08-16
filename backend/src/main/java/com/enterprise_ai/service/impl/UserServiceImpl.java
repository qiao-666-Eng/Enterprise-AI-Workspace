package com.enterprise_ai.service.impl;

import com.enterprise_ai.pojo.User;
import com.enterprise_ai.service.UserService;
import com.enterprise_ai.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        User u = userMapper.findByUserName(username);
        return null;
    }

    @Override
    public void register(String username, String password) {
        //注册
        userMapper.register(username, password);
    }
}