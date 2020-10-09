package com.chen.service;

import com.chen.pojo.User;

/**
 * @author 28444
 */
public interface UserService {
    
    User login(User user);
    boolean findUserByName(String name);
    int saveUser(User user);
}
