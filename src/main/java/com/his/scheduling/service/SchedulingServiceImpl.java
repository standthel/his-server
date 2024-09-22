package com.his.scheduling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.scheduling.entity.DeptUser;
import com.his.scheduling.entity.DeptVo;
import com.his.scheduling.entity.Rule;
import com.his.scheduling.entity.UserRoleVo;
import com.his.scheduling.mapper.SchedulingMapper;

@Service
public class SchedulingServiceImpl implements SchedulingService {
	@Autowired
	private SchedulingMapper schedulingMapper;
	/**获取所有课室列表
	 * @see 获取所有课室列表
	 * @param 无
	 * @return List<DeptVo> 封装deptVo用于前台下拉框数据显示
	 * */	
	@Override
	public List<DeptVo> getDeptList() {
		return schedulingMapper.getDeptList();
	}
	/**获取指定科室的医生排班的规则
	 * @see 获取指定科室可排班的医生以及规则列表
	 * @param deptID	科室id
	 * @return List<UserRoleVo> 封装UserRoleVo用于数据显示
	 * */
	@Override
	public List<UserRoleVo> getUserRole(Integer deptID) {
		return schedulingMapper.getUserRole(deptID);
	}
	/**获取所有的医生排班的规则
	 * @see 获取所有的医生排班的规则
	 * @param 无
	 * @return List<UserRoleVo> 封装UserRoleVo用于数据显示
	 * */
	@Override
	public List<UserRoleVo> getAllUserRole() {
		return schedulingMapper.getAllUserRole();
	}
	/**对医生排班的的修改
	 * @see .对医生排班的的修改
	 * @param UserRoleVo userRoleVo 实体类对象
	 * @return int 修改的数量
	 * */
	@Override
	public boolean updateRole(UserRoleVo userRoleVo) {
		int result=schedulingMapper.updateRole(userRoleVo);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/**根据科室查找用户
	 * @see .根据科室查找用户
	 * @param deptID 科室id
	 * @return List<DeptUser> 科室用户数据
	 * */
	@Override
	public List<DeptUser> getUserByDeptID(Integer deptID) {
		return schedulingMapper.getUserByDeptID(deptID);
	}
	/**对医生排班规则的添加
	 * @see .对医生排班的添加
	 * @param Rule rule 实体类对象
	 * @return int 添加的数量
	 * */
	@Override
	public boolean addRule(Rule rule) {
		int result=schedulingMapper.addRule(rule);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}

}
