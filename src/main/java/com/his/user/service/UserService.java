package com.his.user.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.his.user.entity.User;

/**
 * 
 * @author Administrator
 * @version 2024-0617-1.0
 */
@Service
public interface UserService extends IService<User> {
	/**
	 * 描述： 根据条件对用户信息进行查询，并分页显示
	 * 参数描述： int page 当前页   int limit 行数 String keywords String keywords02 String keywords03
	 * 返回值：  List<User> 返回查询到的用户数据
	 */
		public List<User> getUserList(Integer page,
				                      Integer limit,
				                      String keywords,
				                      String keywords02,
				                      String keywords03
				  );
	/**
	 * 	描述： 根据条件查询用户的行数（为分页提供总行数）
	 *  参数描述：  String keywords String keywords02 String keywords03	   
	 *  返回值： int                   
	 */
		public int getUserCount(String keywords,
	                            String keywords02,
	                            String keywords03
	                            );
	/**
	 * 描述： 完成批量删除
	 * 参数： Integer[] ids
	 * 返回值： boolean  如果false代表失败   true代表成功
	 */
		public boolean deleteUserByIds(Integer[] ids);
	/**
	 * 描述： 用户数据的添加
	 * 参数： User user
	 * 返回值： boolean false == 失败  true ==成功
	 */
		public boolean addUser(User user);
	/**
	 * 描述：用来完成登录操作
	 * 参数：String keywords String keywords02
	 * 返回值：  User
	 */
		public User getUserBean(String keywords,
				                String keywords02);
}
