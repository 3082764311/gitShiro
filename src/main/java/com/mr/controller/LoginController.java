package com.mr.controller;

import com.mr.service.LoginService;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 安晓 on 2018/5/25.
 */
@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login(HttpServletRequest request, ModelMap map)
    {
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        //根据shiro返回的异常类路径判断，抛出指定异常信息
        if(exceptionClassName!=null){
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                map.put("username", "账号不存在");
            } else if (IncorrectCredentialsException.class.getName().equals(
                    exceptionClassName)) {
                map.put("password", "密码错误");
            } else {
                map.put("errorMsg", "其他异常信息");
            }
        }
        return "forward:/login.jsp";
    }
}
