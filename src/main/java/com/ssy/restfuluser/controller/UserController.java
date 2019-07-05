package com.ssy.restfuluser.controller;

import com.ssy.restfuluser.bean.ReqPack;
import com.ssy.restfuluser.bean.RespPack;
import com.ssy.restfuluser.bean.User;
import com.ssy.restfuluser.exception.UnifiedException;
import com.ssy.restfuluser.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.SysUtil;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping("/login")
    Object login(@RequestBody ReqPack reqPack) {

        String id;
        String pwd;

        try {
            id = reqPack.getData().getString("id");
            pwd = reqPack.getData().getString("pwd");
        } catch (Exception e) {
            throw UnifiedException.create(1, "参数异常", SysUtil.getCurLineInfo());
        }

        if (id == null || id.length() <= 0 || pwd == null || pwd.length() <= 0) {
            throw UnifiedException.create(1, "用户名密码不可为空", SysUtil.getCurLineInfo());
        }

        //业务
        User user = userService.getUserbyToken(id, pwd);
        if (user == null) {
            throw UnifiedException.create(2, "用户名或密码错误", SysUtil.getCurLineInfo());
        }

        user.setPwd("");
        return RespPack.respPackSuc(user);
    }
}