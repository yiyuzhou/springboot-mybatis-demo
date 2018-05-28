package com.example.springbootmybatisdemo.service.impl;

import com.example.springbootmybatisdemo.entity.User;
import com.example.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootmybatisdemo.mapper.UserDao;

import java.util.List;

/**
 * @author by yyz
 * on 2018/5/28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userMapper;

    @Override
    public List<User> getUserInfo() {

        return userMapper.findUserInfo();
    }

    @Override
    public void insert(User user) {

    }
}
