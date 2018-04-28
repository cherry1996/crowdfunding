package com.xhp.crowdfunding.controller;

import com.google.gson.Gson;
import com.xhp.crowdfunding.entity.User;
import com.xhp.crowdfunding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: luqinglin
 * Date: 2018-04-28
 * Time: 13:54
 */
@Controller
@RequestMapping("manage")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login.do")
    @ResponseBody
    public String login(HttpServletResponse response, @RequestParam("signin_username") String username, @RequestParam("signin_password") String password) throws Exception{
        User user = userService.login(username, password);
        if (null !=user) {
            Gson gson = new Gson();
            String userInfo = URLEncoder.encode(gson.toJson(user),"UTF-8");
            Cookie cookie = new Cookie("userInfo",userInfo);
            cookie.setMaxAge(60 * 50);
            cookie.setSecure(false);
            response.addCookie(cookie);
            return "1" ;
        }
        return "0" ;
    }


}
