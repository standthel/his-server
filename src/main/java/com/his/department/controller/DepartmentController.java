package com.his.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.his.department.entity.Department;
import com.his.department.service.DepartmentService;
import com.his.department.util.M;

@RestController
@CrossOrigin
@RequestMapping("/his/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	/**
	 * 描述： 根据条件对科室管理进行查询，根据条件查询用户的行数（为分页提供总行数）,并分页显示
	 * 参数描述： int page 当前页   int limit 行数 String keywords String keywords02 String keywords03
	 * 返回值：  List<Department> 返回查询到的用户数据
	 */
	@RequestMapping("/getDepartmentList")
	public M getDepartmentList(Integer page,
							   Integer limit,
							   String keywords01,
							   String keywords02,
							   String keywords03) {
		//分页页码处理
		page=(page-1)*limit; 
		Integer count=departmentService.getDepartmentCount(keywords01, keywords02);
		List<Department> list=departmentService.getDepartmentList(page, limit, keywords01, keywords02, keywords03);
		return M.ok().data("list",list).data("count",count);
	}
	/** 对科室的删除单个
	 * 描述: 对科室数据进行单个删除
	 * 参数描述：id 科室的id
	 * 返回值： int,表示删除的数量
	 * */
	@RequestMapping("/deleteDepartment")
	public M deleteDepartment(Integer id){
		boolean flag=departmentService.deleteDepartment(id);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/**对科室的删除通过多个id
	 * 描述: 对科室数据进行批量删除
	 * 参数描述：Integter [] ids  多个科室id
	 * 返回值：int,表示删除的数量
	 * */
	@RequestMapping("/deleteDepartmentByIds")
	public M deleteDepartmentByIds(@RequestBody Integer[] ids) {
		boolean flag=departmentService.deleteDepartmentByIds(ids);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/** 对科室的添加
	 * 描述:对科室数据进行添加
	 * 参数描述：Department department实体类对象
	 * 返回值： int,表示添加的数量
	 * */
	@RequestMapping("/addDepartment")
	public M addDepartment(@RequestBody Department department){
		boolean flag=departmentService.addDepartment(department);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/** 对科室的修改
	 * 描述:对科室数据修改
	 * 参数描述：Department department实体类对象
	 * 返回值：int,表示修改的数量
	 * */
	@RequestMapping("/updateDepartment")
	public M updateDepartment(String keywords01, 
							String keywords02, 
							Integer keywords03, 
							Integer keywords04){
		int flag=departmentService.updateDepartment(keywords01, keywords02, keywords03, keywords04);
		if (flag>0) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/**批量插入通过excel
	 * 描述: 对科室数据通过excel进行批量插入
	 * 参数描述：List<Department> department
	 * 返回值：int	插入数量
	 * */
}
