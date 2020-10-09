package com.chen.service;

import com.chen.dao.UserMapper;
import com.chen.pojo.User;

public class UserServiceImpl implements UserService{

    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public User login(User user) {
        User u = userMapper.loginCheck(user);
        return u;
    }

    public boolean findUserByName(String name) {
        User user = userMapper.queryUserByName(name);
        if (user != null){
            return true;
        }
        return false;
    }

    public int saveUser(User user) {
        int result = userMapper.addUser(user);
        return result;
    }

}
