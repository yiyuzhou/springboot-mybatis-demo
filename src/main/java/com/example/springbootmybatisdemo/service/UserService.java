package com.example.springbootmybatisdemo.service;

import com.example.springbootmybatisdemo.entity.User;

import java.util.List;

/**
 * @author by yyz
 * on 2018/5/28
 */
public interface UserService {

    public List<User> getUserInfo();

    public void insert(User user);
}
