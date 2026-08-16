package com.enterprise_ai.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String userPci;
    private LocalDateTime createTime;
}
