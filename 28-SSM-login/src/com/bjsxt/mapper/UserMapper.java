package com.bjsxt.mapper;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.User;

public interface UserMapper {
	//�����û����������ѯ�û���Ϣ
	@Select("select * from t_user where uname=#{0} and pwd=#{1}")
	User getUserInfo(String uname,String pwd);
}
