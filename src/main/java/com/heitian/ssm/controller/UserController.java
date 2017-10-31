package com.heitian.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.heitian.ssm.comm.Constant_ErrMsg;
import com.heitian.ssm.comm.Constant_Params;
import com.heitian.ssm.core.Result;
import com.heitian.ssm.core.ResultGenerator;
import com.heitian.ssm.exception.MyRuntimeException;
import com.heitian.ssm.exception.MyServiceException;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import com.heitian.ssm.util.AssertUtils;
import com.heitian.ssm.util.CommentUtils;
import com.heitian.ssm.util.JsonUtils;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.heitian.ssm.comm.Constant_Params.LOGINNAME;
import static com.heitian.ssm.comm.Constant_Params.PASSWORD;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController implements  Constant_ErrMsg,Constant_Params {

    /**
     * 打印类
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private UserService userService;

    /**
     * 版 权: Copyright udit<br>
     * 描 述: 方法描述<br>
     * 创 建 人: 谢云峰 zbmax001@126.com<br>
     * 创建时间:2017-10-25<br>
     * 版本号： 1.0 <br>
     * 接口uri：http://localhost:8080/web-ssm/user/login?loginname=&password=<br>
     * 提交方式：get/post <br>
     * 参数： 1、loginname 登录名（手机号） 2、password 密码<br>
     * 返回值：<br>
     * ok: <br>
     * {"result":"200","message":"登录成功","data":{"id":1,"mobile":"13179777809","name":"逗一","password":"1","picture":
     * "0","sex":"type_user_sex_m","type":"type_user_me"}}<br>
     * <br>
     * err: <br>
     * {"result":"400","message":"手机号码不合格"}<br>
     * {"result":"400","message":"登录密码不能为空"}<br>
     * {"result":"400","message":"用户名/密码 不正确"}<br>
     * <br>
     */
    @RequestMapping("login")
    @ResponseBody
    public Result login(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map_args = CommentUtils.requestToHashMap(request, logger);
        Object obj_loginname = map_args.get(LOGINNAME);
        Object obj_password = map_args.get(PASSWORD);
        try {
//            // 检验参数
            AssertUtils.NOTNULL_PHONE(obj_loginname, logger);
            AssertUtils.NOTNULL(obj_password, Constant_ErrMsg.IUser_Err.USER_VALIDATE_PASSWORD_ERR, logger);
            User user = new User();
            user.setUsername(obj_loginname.toString());
            user.setPassword(obj_password.toString());
            User userCallBack = userService.login(user);
            HttpSession session= request.getSession();
            String id=   session.getId();
            session.setAttribute(id,userCallBack);
            if (userCallBack != null) {
                return ResultGenerator.genSuccessResult(userCallBack,id);
            } else {
                return ResultGenerator.genFailResult("用戶名或密碼錯誤");
            }
        } catch (MyRuntimeException e) {
                return  ResultGenerator.genFailResult(e.toString());
        }
    }


    @RequestMapping("list")
    @ResponseBody
    public Result getList(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map_args = CommentUtils.requestToHashMap(request, logger);
        JSONObject jsonObject = new JSONObject();
        Object id = map_args.get(USERID);
//        Object obj_password = map_args.get(PASSWORD);
        try {
//            // 检验参数
//            AssertUtils.NOTNULL(id,"缺少参数", logger);
           if(id==null||id.toString().isEmpty())
           {
               return ResultGenerator.genFailResult("缺失参数");
           }
            HttpSession session= request.getSession();
            if(session.getAttribute(id.toString())!=null)
            {
              User user= (User) session.getAttribute(id.toString());
                return ResultGenerator.genSuccessResult(user);
//                userService.selectByUserNmae()
            }
            else
            {
                return ResultGenerator.genFailResult("用戶id错误");
            }
//            AssertUtils.NOTNULL(obj_password, Constant_ErrMsg.IUser_Err.USER_VALIDATE_PASSWORD_ERR, logger);
//            User user = new User();
//            user.setUsername(obj_loginname.toString());
//            user.setPassword(obj_password.toString());
//            User userCallBack = userService.login(user);
//            HttpSession session= request.getSession();
//            String id=   session.getId();
//            session.setAttribute(id,userCallBack);
//            if (userCallBack != null) {
//                return ResultGenerator.genSuccessResult(userCallBack,id);
//            } else {
//                return ResultGenerator.genFailResult("用戶名或密碼錯誤");
//            }
        } catch (MyRuntimeException e) {
            return  ResultGenerator.genFailResult(e.toString());
        }
    }


    @RequestMapping("register")
    @ResponseBody
    public Result register(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map_args = CommentUtils.requestToHashMap(request, logger);
        JSONObject jsonObject = new JSONObject();
        Object obj_loginname = map_args.get(LOGINNAME);
        Object obj_password = map_args.get(PASSWORD);
        try {
//            // 检验参数
            AssertUtils.NOTNULL_PHONE(obj_loginname, logger);
            AssertUtils.NOTNULL(obj_password, Constant_ErrMsg.IUser_Err.USER_VALIDATE_PASSWORD_ERR, logger);
//            HttpSession session= request.getSession();
//            session.setAttribute(obj_loginname.toString());
            User callUser=  userService.selectByUserNmae(obj_loginname.toString());
            if(callUser!=null)
            {
                return  ResultGenerator.genFailResult("该账户已注册!");
            }
            User user = new User();
            user.setUsername(obj_loginname.toString());
            user.setPassword(obj_password.toString());
            user.setCreatetime(new Date());
            user.setModifytime(new Date());
            user.setIsdelete(0);


            int resulst = userService.insert(user);
            if (resulst ==1) {
                return ResultGenerator.genSuccessResult("注册成功");
            } else {
                return ResultGenerator.genFailResult("注册失败");
            }
        } catch (MyRuntimeException e) {
            return  ResultGenerator.genFailResult(e.toString());
        }
    }

}
