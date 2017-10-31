package com.heitian.ssm.service;

import com.heitian.ssm.model.User;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {


    int insert(User user);

    User login(User user);

    User selectByUserNmae(String username);
//    List<User> getAllUser();
//
//    User getUserByPhoneOrEmail(String emailOrPhone, Short state);
//
//    User getUserById(Long userId);
//
//    User login(String user_phone);
}
