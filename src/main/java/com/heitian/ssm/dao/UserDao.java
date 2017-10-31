package com.heitian.ssm.dao;

import com.heitian.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Repository
public interface UserDao {

        int deleteByPrimaryKey(Integer id);

        int insert(User record);

        int insertSelective(User record);

        User selectByPrimaryKey(Integer id);

        int updateByPrimaryKeySelective(User record);

        int updateByPrimaryKey(User record);

        User login(User user);

        User selectByUserName(String username);
}
