package com.bjsxt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;

@Controller
public class MyCon {
	//声明业务层对象
	@Resource
	private UserService userServiceImpl;
	//用户登录
	@RequestMapping("user")
	public String userLogin(String uname,String pwd){
		//处理请求
		User u=userServiceImpl.selUserInfoService(uname, pwd);
		//响应
		if(u!=null){
			
			return "main";//自定义视图解析器的请求转发
		}else{
			
			return "forward:/login.jsp";//默认视图解析器的请求转发
		}
		
	}
	
	
	
	
}
