package com.his.department.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.his.department.entity.Department;

@Mapper
public interface DepartmentMapper {
	/**
	 * 描述： 根据条件对科室管理进行查询，并分页显示
	 * 参数描述： int page 当前页   int limit 行数 String keywords String keywords02 String keywords03
	 * 返回值：  List<Department> 返回查询到的用户数据
	 */
	public List<Department> getDepartmentList(@Param("page")Integer page,
											  @Param("limit")Integer limit,
											  @Param("keywords01")String keywords01,
											  @Param("keywords02")String keywords02,
											  @Param("keywords03")String keywords03);
	/**
	 * 	描述： 根据条件查询用户的行数（为分页提供总行数）
	 *  参数描述：  String keywords String keywords02 String keywords03	   
	 *  返回值： int                   
	 */
	public int getDepartmentCount(@Param("keywords01")String keywords01,
								  @Param("keywords02")String keywords02);
	/** 对科室的删除单个
	 * 描述: 对科室数据进行单个删除
	 * 参数描述：id 科室的id
	 * 返回值： int,表示删除的数量
	 * */
	public int deleteDepartment(@Param("id")Integer id);
	/**对科室的删除通过多个id
	 * 描述: 对科室数据进行批量删除
	 * 参数描述：Integter [] ids  多个科室id
	 * 返回值：int,表示删除的数量
	 * */
	public int deleteDepartmentByIds(@Param("ids")Integer[] ids);
	/** 对科室的添加
	 * 描述:对科室数据进行添加
	 * 参数描述：Department department实体类对象
	 * 返回值： int,表示添加的数量
	 * */
	public int addDepartment(Department department);
	/** 对科室的修改
	 * 描述:对科室数据修改
	 * 参数描述：Department department实体类对象
	 * 返回值：int,表示修改的数量
	 * */
	public int updateDepartment(@Param("keywords01")String keywords01,
								@Param("keywords02")String keywords02,
								@Param("keywords03")Integer keywords03,
								@Param("keywords04")Integer keywords04);
	/**批量插入通过excel
	 * 描述: 对科室数据通过excel进行批量插入
	 * 参数描述：List<Department> department
	 * 返回值：int	插入数量
	 * */
	public int batchInsert(List<Department> department);
	/**导出excel
	 * 描述: 根据id查询，用于导出excel
	 * 参数描述：List<Department> department
	 * 返回值：List<Department>
	 * */
	public List<Department> selectDepartmentsByids(@Param("ids")Integer[] ids);
}
