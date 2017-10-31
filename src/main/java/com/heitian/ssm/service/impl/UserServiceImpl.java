package com.heitian.ssm.service.impl;

import com.heitian.ssm.dao.UserDao;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserDao userDao;

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public User login(User user) {
//        return userDao.login(user);
        return userDao.login(user);
    }

    @Override
    public User selectByUserNmae(String username) {
        return userDao.selectByUserName(username);
    }


//    public User getUserById(Long userId) {
//        return userDao.selectUserById(userId);
//    }
//
//    public User login(String user_phone) {
//        return userDao.login(user_phone);
//    }
//
//
//    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
//        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
//    }
//
//    public List<User> getAllUser() {
//        return userDao.selectAllUser();
//    }
}
