package com.example.springbootmybatisdemo.mapper;

import com.example.springbootmybatisdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author by yyz
 * on 2018/5/28
 */

@Component
@Mapper
public interface UserDao {

    List<User> findUserInfo();
    public int addUserInfo(User user);
    public int delUserInfo(int id);
}
