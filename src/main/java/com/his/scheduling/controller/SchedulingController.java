package com.his.scheduling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.scheduling.entity.DeptUser;
import com.his.scheduling.entity.DeptVo;
import com.his.scheduling.entity.Rule;
import com.his.scheduling.entity.UserRoleVo;
import com.his.scheduling.service.SchedulingService;
import com.his.scheduling.util.M;

@RestController
@CrossOrigin
@RequestMapping("/his/scheduling")
public class SchedulingController {
	@Autowired
	private SchedulingService schedulingService;
	/**获取所有课室列表
	 * @see 获取所有课室列表
	 * @param 无
	 * @return List<DeptVo> 封装deptVo用于前台下拉框数据显示
	 * */
	@RequestMapping("/getDeptList")
	public M getDeptList()throws Exception{
		List<DeptVo> allDept=schedulingService.getDeptList();
		return M.ok().data("allDept", allDept);
	}
	/**获取指定科室的医生排班的规则
	 * @see 获取指定科室可排班的医生以及规则列表
	 * @param deptID	科室id
	 * @return List<UserRoleVo> 封装UserRoleVo用于数据显示
	 * */
	@RequestMapping("/getUserRole")
	public M getUserRole(Integer deptID)throws Exception{
		List<UserRoleVo> uRole=schedulingService.getUserRole(deptID);
		return M.ok().data("uRole", uRole);
	}
	/**获取所有的医生排班的规则
	 * @see 获取所有的医生排班的规则
	 * @param 无
	 * @return List<UserRoleVo> 封装UserRoleVo用于数据显示
	 * */
	@RequestMapping("/getAllUserRole")
	public M getAllUserRole()throws Exception{
		List<UserRoleVo> alluRoleVos=schedulingService.getAllUserRole();
		return M.ok().data("alluRoleVos", alluRoleVos);
	}
	/**对医生排班的的修改
	 * @see .对医生排班的的修改
	 * @param UserRoleVo userRoleVo 实体类对象
	 * @return int 修改的数量
	 * */
	@RequestMapping("/updateRole")
	public M updateRole(@RequestBody UserRoleVo userRoleVo)throws Exception{
		boolean flag=schedulingService.updateRole(userRoleVo);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/**根据科室查找用户
	 * @see .根据科室查找用户
	 * @param deptID 科室id
	 * @return List<DeptUser> 科室用户数据
	 * */
	@RequestMapping("/getUserByDeptID")
	public M getUserByDeptID(Integer deptID)throws Exception{
		List<DeptUser> uadID=schedulingService.getUserByDeptID(deptID);
		return M.ok().data("uadID", uadID);
	}
	/**对医生排班规则的添加
	 * @see .对医生排班的添加
	 * @param Rule rule 实体类对象
	 * @return int 添加的数量
	 * */
	@RequestMapping("/addRule")
	public M addRule(@RequestBody Rule rule)throws Exception{
		boolean flag=schedulingService.addRule(rule);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
}
