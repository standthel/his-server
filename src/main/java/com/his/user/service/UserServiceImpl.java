package com.his.user.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.user.entity.User;
import com.his.user.mapper.UserMapper;
import com.his.user.util.M;
/**
 * 
 * @author Administrator
 * @version 2024-0617-1.0
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
	@Autowired
private UserMapper userMapper;
	/**
	 * 注释
	 */
	@Override
	public List<User> getUserList(Integer page, 
			                      Integer limit, 
			                      String keywords, 
			                      String keywords02, 
			                      String keywords03) {
		return userMapper.getUserList(page, limit, keywords, keywords02, keywords03);
	}
	/**
	 * 注释
	 */
	@Override
	public int getUserCount(String keywords, String keywords02, String keywords03) {
		return userMapper.getUserCount(keywords, keywords02, keywords03);
	}
	/**
	 * 注释
	 */
	@Override
	public boolean deleteUserByIds(Integer[] ids) {
		int result=userMapper.deleteUserByIds(ids);
		boolean flag=false;
		if(result>0) {
			flag=true;
		}
		return flag;
	}
	/**
	 * 注释
	 */
	@Override
	public boolean addUser(User user) {
		boolean flag=false;
		int result=userMapper.addUser(user);
		if(result>0) {
			flag=true;
		}
		return flag;
	}
	/**
	 * 注释
	 */
	@Override
	public User  getUserBean(String keywords, String keywords02) {
		return userMapper.getUserBean(keywords, keywords02);
	}

}
