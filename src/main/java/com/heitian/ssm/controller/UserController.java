package com.heitian.ssm.controller;

import com.alibaba.fastjson.JSONArray;
import com.heitian.ssm.core.Result;
import com.heitian.ssm.core.ResultGenerator;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public Result showUser(HttpServletRequest request, Model model) {
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        if (userList != null) {
            return ResultGenerator.genSuccessResult(userList);
        } else {
            return ResultGenerator.genFailResult("");
        }
    }
    @RequestMapping("login")
    @ResponseBody
    public Result login(String name, String password) {
        log.info("用户登录："+"name="+name+" password="+password);
        User user = userService.login(name, password);
        if (user != null) {
            return ResultGenerator.genSuccessResult(user);
        } else {
            return ResultGenerator.genFailResult("用户名或密码错误！");
        }
    }
}
