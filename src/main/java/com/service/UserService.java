package com.service;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @desc：
 * @title：UserService
 * @author: huangwencai
 * @date: 2020-01-16 15:23
 * @version: v4.40.0
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public void add(){
         userMapper.add();
    }
    public void minute(){
         userMapper.subtract();
    }
}