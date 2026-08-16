package com.enterprise_ai.mapper;

import com.enterprise_ai.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    //根据用户名查询用户
    @Select("SELECT * FROM user WHERE username = #{username}")
    User findByUserName(String username);

    //添加
    @Insert("insert into user(username,password,create_time)" +
            " values (#{username},#{password},now())")
    void register(String username,String password);
}
