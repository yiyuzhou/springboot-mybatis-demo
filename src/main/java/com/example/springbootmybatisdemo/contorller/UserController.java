package com.example.springbootmybatisdemo.contorller;

import com.alibaba.fastjson.JSON;
import com.example.springbootmybatisdemo.entity.User;
import com.example.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by yyz
 * on 2018/5/28
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    public List<User> getUserInfo() {
        List<User> user = userService.getUserInfo();
        System.out.println(JSON.toJSON(user));
        return user;
    }
}
