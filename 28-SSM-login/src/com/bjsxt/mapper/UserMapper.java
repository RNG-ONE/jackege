package com.bjsxt.mapper;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.User;

public interface UserMapper {
	//根据用户名和密码查询用户信息
	@Select("select * from t_user where uname=#{0} and pwd=#{1}")
	User getUserInfo(String uname,String pwd);
}
