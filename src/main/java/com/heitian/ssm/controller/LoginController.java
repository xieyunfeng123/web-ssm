package com.heitian.ssm.controller;

import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
public class LoginController {

    private Logger log = Logger.getLogger(LoginController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
//        log.info("查询所有用户信息");
//        List<User> userList = userService.getAllUser();
//        model.addAttribute("userList",userList);
        return "login";
    }
}
