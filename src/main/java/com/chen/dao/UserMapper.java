package com.chen.dao;

import com.chen.pojo.User;

import java.util.List;

public interface UserMapper {

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    User queryUserById(int id);

    List<User> queryAllUser();

    User queryUserByName(String name);

    User loginCheck(User user);
}
