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
public class sayHelloCOntroller {
	@Autowired
	private SysUserRepo SysUserRepo

	@GetMapping("hello")
	public String hello() { 
		return "hello";
	}

	@GetMapping("get-sys-user")
	public List<SysUser> users = sysUserRepo.findAll();
	return users;
}
