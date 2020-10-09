package com.chen.controller;

import com.chen.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 28444
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    @RequestMapping("/login")
    public String loginCheck(){

        return null;
    }
}
