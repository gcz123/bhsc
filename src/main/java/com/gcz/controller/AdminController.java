package com.gcz.controller;

import com.gcz.entity.Admin;
import com.gcz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    public String login(String username,String password){
        Admin admin = adminService.login(username, password);
        if(admin==null){
            return "back/login";
        }
        return "back/main";
    }
}
