package com.his.scheduling.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.his.scheduling.entity.DeptUser;
import com.his.scheduling.entity.DeptVo;
import com.his.scheduling.entity.Rule;
import com.his.scheduling.entity.UserRoleVo;

@Service
public interface SchedulingService {
	/**1.获取所有课室列表
	 * @see 获取所有课室列表
	 * @param 无
	 * @return List<DeptVo> 封装deptVo用于前台下拉框数据显示
	 * */	
	public List<DeptVo> getDeptList();		
	/**2.获取指定科室的医生排班的规则
	 * @see 获取指定科室可排班的医生以及规则列表
	 * @param deptID	科室id
	 * @return List<UserRoleVo> 封装UserRoleVo用于数据显示
	 * */
	public List<UserRoleVo> getUserRole(Integer deptID);
	/**3.获取所有的医生排班的规则
	 * @see 获取所有的医生排班的规则
	 * @param 无
	 * @return List<UserRoleVo> 封装UserRoleVo用于数据显示
	 * */
	public List<UserRoleVo> getAllUserRole();
	/**4.对医生排班的的修改
	 * @see .对医生排班的的修改
	 * @param UserRoleVo userRoleVo 实体类对象
	 * @return int 修改的数量
	 * */
	public boolean updateRole(UserRoleVo userRoleVo);
	/**5.根据科室查找用户
	 * @see .根据科室查找用户
	 * @param deptID 科室id
	 * @return List<DeptUser> 科室用户数据
	 * */
	public List<DeptUser> getUserByDeptID(Integer deptID);
	/**6.对医生排班规则的添加
	 * @see .对医生排班的添加
	 * @param Rule rule 实体类对象
	 * @return int 添加的数量
	 * */
	public boolean addRule(Rule rule);
}
