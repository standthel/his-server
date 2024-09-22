package com.his.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.department.entity.Department;
import com.his.department.mapper.DepartmentMapper;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;
	/**
	 * 描述： 根据条件对科室管理进行查询，并分页显示
	 * 参数描述： int page 当前页   int limit 行数 String keywords String keywords02 String keywords03
	 * 返回值：  List<Department> 返回查询到的用户数据
	 */
	@Override
	public List<Department> getDepartmentList(Integer page, 
											  Integer limit, 
											  String keywords01, 
											  String keywords02,
											  String keywords03) {
		return departmentMapper.getDepartmentList(page, limit, keywords01, keywords02, keywords03);
	}
	/**
	 * 	描述： 根据条件查询用户的行数（为分页提供总行数）
	 *  参数描述：  String keywords String keywords02 String keywords03	   
	 *  返回值： int                   
	 */
	@Override
	public int getDepartmentCount(String keywords01, String keywords02) {
		return departmentMapper.getDepartmentCount(keywords01, keywords02);
	}
	/** 对科室的删除单个
	 * 描述: 对科室数据进行单个删除
	 * 参数描述：id 科室的id
	 * 返回值： int,表示删除的数量
	 * */
	@Override
	public boolean deleteDepartment(Integer id) {
		int result=departmentMapper.deleteDepartment(id);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/**对科室的删除通过多个id
	 * 描述: 对科室数据进行批量删除
	 * 参数描述：Integter [] ids  多个科室id
	 * 返回值：int,表示删除的数量
	 * */
	@Override
	public boolean deleteDepartmentByIds(Integer[] ids) {
		int result=departmentMapper.deleteDepartmentByIds(ids);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/** 对科室的添加
	 * 描述:对科室数据进行添加
	 * 参数描述：Department department实体类对象
	 * 返回值： int,表示添加的数量
	 * */
	@Override
	public boolean addDepartment(Department department) {
		boolean flag=false;
		int result=departmentMapper.addDepartment(department);
		if(result>0) {
			flag=true;
		}
		return flag;
	}
	/** 对科室的修改
	 * 描述:对科室数据修改
	 * 参数描述：Department department实体类对象
	 * 返回值：int,表示修改的数量
	 * */
	@Override
	public int updateDepartment(String keywords01, String keywords02, Integer keywords03, Integer keywords04) {
		return departmentMapper.updateDepartment(keywords01, keywords02, keywords03, keywords04);
	}
	/**批量插入通过excel
	 * 描述: 对科室数据通过excel进行批量插入
	 * 参数描述：List<Department> department
	 * 返回值：int	插入数量
	 * */
	@Override
	public boolean batchInsert(List<Department> department) {
		boolean flag=false;
		int result=departmentMapper.batchInsert(department);
		if(result>0) {
			flag=true;
		}
		return flag;
	}
	/**导出excel
	 * 描述: 根据id查询，用于导出excel
	 * 参数描述：List<Department> department
	 * 返回值：List<Department>
	 * */
	public List<Department> selectDepartmentsByids(Integer[] ids){
		return departmentMapper.selectDepartmentsByids(ids);
	}

}
