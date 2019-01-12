package com.tjhq.business.mysqlDemo.controller;

import com.tjhq.business.mysqlDemo.po.User;
import com.tjhq.business.mysqlDemo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * branch
 */
@Controller
public class UserEnter {
    @Autowired
    private IUserService userServiceImpl;
    private  Logger log = LoggerFactory.getLogger(UserEnter.class);

    @RequestMapping("/usermain")
    public String listUser(Model m) {
        log.info("已经进入controller。。。。");
        List<User> users = userServiceImpl.getUserList();
        m.addAttribute("users", users);
        return "mysqlDemo/listUser";
    }

}

