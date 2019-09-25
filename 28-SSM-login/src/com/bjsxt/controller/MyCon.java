package com.bjsxt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;

@Controller
public class MyCon {
	//����ҵ������
	@Resource
	private UserService userServiceImpl;
	//�û���¼
	@RequestMapping("user")
	public String userLogin(String uname,String pwd){
		//��������
		User u=userServiceImpl.selUserInfoService(uname, pwd);
		//��Ӧ
		if(u!=null){
			
			return "main";//�Զ�����ͼ������������ת��
		}else{
			
			return "forward:/login.jsp";//Ĭ����ͼ������������ת��
		}
		
	}
	
	
	
	
}
