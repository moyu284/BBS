package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author 28444
 */
@Controller
@RequestMapping("/bbs")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
    /**
     *跳转登录界面
     */
    @RequestMapping("/login")
    public String toLogin(HttpServletRequest req,HttpSession session){
        session.setAttribute("redirectUrl",req.getHeader("Referer"));
        return "/WEB-INF/bbs/login";
    }
    /**
     *跳转注册界面
     */
    @RequestMapping("/register")
    public String toRegister(HttpServletRequest req,HttpSession session){
        session.setAttribute("redirectUrl",req.getHeader("Referer"));
        return "/WEB-INF/bbs/register";
    }

    /**
     *注销用户
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/bbs/index";
    }
    /**
     *登录验证
     */
    @RequestMapping("/loginCheck")
    public String loginCheck(User u, HttpServletRequest req, Model model){
        User user = userService.login(u);

        if (user == null){
            model.addAttribute("errorInfo","error");
            return "/WEB-INF/bbs/login";
        }

        HttpSession session = req.getSession();
        session.setAttribute("user",user);
        String redirectUrl = (String) session.getAttribute("redirectUrl");
        if (redirectUrl == null) {
            session.setAttribute("redirectUrl", "/bbs/index");
        }
        session.setAttribute("pageTies","登录");
        return "/WEB-INF/bbs/success";
    }

    /**
     * 用户注册
     */
    @RequestMapping("/userRegister")
    public String userRegister(User user,Model model,HttpServletRequest req){

        if (userService.findUserByName(user.getUserName())){
            model.addAttribute("errorInfo","userExists");
            return "/WEB-INF/bbs/register";
        }else {
            if (userService.saveUser(user) > 0){
                HttpSession session = req.getSession();
                String redirectUrl = (String) session.getAttribute("redirectUrl");
                if (redirectUrl == null) {
                    session.setAttribute("redirectUrl", "/bbs/index");
                }
                session.setAttribute("pageTies","注册");
                return "/WEB-INF/bbs/success";
            }else {
                model.addAttribute("errorInfo","registerFail");
                return "/WEB-INF/bbs/register";
            }
        }

    }
}
