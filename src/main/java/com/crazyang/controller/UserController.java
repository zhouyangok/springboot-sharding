package com.crazyang.controller;

import com.crazyang.entity.User;
import com.crazyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/4 上午11:10.
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/select")
    public List<User> select() {
        return userService.getUserList();
    }

    @RequestMapping("/insert")
    public Boolean insert(User user) {
        return userService.save(user);
    }

}
