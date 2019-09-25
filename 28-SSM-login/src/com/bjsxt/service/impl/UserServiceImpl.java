package com.bjsxt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	@Override
	public User selUserInfoService(String uname, String pwd) {
		
		return userMapper.getUserInfo(uname, pwd);
	}
	
}
