package com.his.user.controller;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import lombok.var;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.his.user.entity.User;
import com.his.user.service.UserService;
import com.his.user.service.UserServiceImpl;
import com.his.user.util.M;

import javax.annotation.Resource;


@RestController
@CrossOrigin
@RequestMapping("/his/user")
public class UserController {
	@Autowired
private UserServiceImpl userServiceiImpl;
	@Autowired
	private UserService userService;


	/**
 * 注释
 */
	@GetMapping("/getUserList")
	public M getUserList(Integer page,
			Integer limit,
			String keywords,
			String keywords02,
			String keywords03) {
		Page pageinfo = new Page(page, limit);
		LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();

//		UserService.page(pageinfo,queryWrapper);
		//分页页码处理
		page=(page-1)*limit;
		int counts=userServiceiImpl.getUserCount(keywords, keywords02, keywords03);
		List<User> list=userServiceiImpl.getUserList(page, limit, keywords, keywords02, keywords03);
		return M.ok().data("list",list).data("count",counts);
	}
	
	@RequestMapping("/getUserBean")
	public M getUserBean(String keywords, String keywords02) {
		if(userServiceiImpl.getUserBean(keywords, keywords02) == null) return M.error();
		LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
		//queryWrapper.eq(User::getId,)
		//else return M.ok();
		var threadPoolExecutor = new ThreadPoolExecutor(){

		};
	}
	@RequestMapping("/deleteUserByIds")
	public M deleteUserByIds(@RequestParam("ids") Integer[] ids) {
		if(userServiceiImpl.deleteUserByIds(ids)) return M.ok();
		else return M.error();
	}

	public M page(){
			Page pageInfo = new Page();

		LambdaQueryWrapper queryWrapper = new LambdaQueryWrapper();

		queryWrapper.like(StringU);
		return  null;
	}
	@RequestMapping("/addUser")
	public M addUser(@RequestBody User user) {
		if(userServiceiImpl.addUser(user)) return M.ok();
		else return M.error();
	}
	
}
