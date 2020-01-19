package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc：
 * @title：UserController
 * @author: huangwencai
 * @date: 2020-01-16 15:36
 * @version: v4.40.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    @Transactional
    public User getUserById(int id){
       User user1= userService.Sel(id);
       int a=3;//这个时候手动去修改id值的记录，修改任意一个字段的值，再和下面的user2比较
        User user2= userService.Sel(id);
       return user2;
    }



    @RequestMapping("/testTransaction")
    @Transactional
    public User testTransaction(){
         userService.add();
         int a=1/0;
         userService.minute();
         return new User(4,"hu");
    }
}