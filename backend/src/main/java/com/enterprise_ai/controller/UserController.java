package com.enterprise_ai.controller;

import com.enterprise_ai.pojo.Result;
import com.enterprise_ai.pojo.User;
import com.enterprise_ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username, String password) {
        User u = userService.findByUsername(username);
        if (u == null) {
            userService.register(username, password);
            return Result.success();
        }
        else {
            return Result.fail();
        }
    }

}
