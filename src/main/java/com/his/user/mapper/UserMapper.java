package com.his.user.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.his.user.entity.User;

/**
 * 
 * @author 你的姓名
 * @version 2024-06-17-1.0
 *
 */
@Mapper

public interface UserMapper extends BaseMapper<User> {
/**
 * 描述： 根据条件对用户信息进行查询，并分页显示
 * 参数描述： int page 当前页   int limit 行数 String keywords String keywords02 String keywords03
 * 返回值：  List<User> 返回查询到的用户数据
 */
	public List<User> getUserList(@Param("page")Integer page,
			                      @Param("limit")Integer limit,
			                      @Param("keywords")String keywords,
			                      @Param("keywords02")String keywords02,
			                      @Param("keywords03")String keywords03
			  );
/**
 * 	描述： 根据条件查询用户的行数（为分页提供总行数）
 *  参数描述：  String keywords String keywords02 String keywords03	   
 *  返回值： int                   
 */
	public int getUserCount(@Param("keywords")String keywords,
                            @Param("keywords02")String keywords02,
                            @Param("keywords03")String keywords03
                            );
/**
 * 描述： 完成批量删除
 * 参数： Integer[] ids
 * 返回值： int  如果0 代表失败   大于0代表成功
 */
	public int deleteUserByIds(@Param("ids")Integer[] ids);
/**
 * 描述： 用户数据的添加
 * 参数： User user
 * 返回值： int 0 == 失败  1 ==成功
 */
	public int addUser(User user);
/**
 * 描述：用来完成登录操作
 * 参数：String keywords String keywords02
 * 返回值：  User
 */
	public User getUserBean(@Param("keywords")String keywords,
			                @Param("keywords02")String keywords02);
/**
 * 描述：对用户数据的更新
 * 参数：User user
 * 返回值：int 0 == 失败  1 ==成功
 */
	
}
