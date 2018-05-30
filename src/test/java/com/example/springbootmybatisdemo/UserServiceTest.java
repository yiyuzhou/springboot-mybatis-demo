package com.example.springbootmybatisdemo;

import com.example.springbootmybatisdemo.entity.User;
import com.example.springbootmybatisdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author by yyz
 * on 2018/5/30
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {


    @Autowired
    private UserService userService;

    @Test
    public void UserListTest(){
        List<User> userInfo = userService.getUserInfo();
        for (User user : userInfo) {
            System.out.println(user.getUserName());
        }
    }
}
