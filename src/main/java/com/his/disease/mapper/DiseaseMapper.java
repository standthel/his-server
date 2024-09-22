package com.his.disease.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.his.disease.entity.Disease;

@Mapper
public interface DiseaseMapper {
	/*1.根据疾病分类查询疾病信息
	 * @see 根据疾病分类查询疾病信息
	 * @param diseCategoryID 疾病分类	  page 表示当前页	 limit表示每页数量	
	 * @return List<Disease>分页查询数据
	 * */
	public List<Disease> getdiseaseInfo(@Param("diseCategoryID")Integer diseCategoryID,@Param("page")Integer page,@Param("limit")Integer limit);
	/*2.查询总数用于分页
	 * @see 对疾病信息总数进行显示 ,用于分页  
	 * @param diseCategoryID 疾病分类
	 * @return int	总数量用于分页
	 * */
	public Integer getdiseaseInfoTotal(@Param("diseCategoryID")Integer diseCategoryID);
	/*3.对诊断信息的添加
	 * @see 对诊断信息进行添加
	 * @param Disease disease实体类对象
	 * @return int,表示添加的数量
	 * */		
	public Integer addDisease(Disease disease);
	/*4.对诊断信息的删除通过多个id
	 * @see 对诊断信息进行批量删除
	 * @param Integter [] ids  多个科室id
	 * @return int,表示删除的数量
	 * */
	public Integer delDiseaseByIds(@Param("ids")Integer[] ids);
	/*5. 对疾病信息的修改
	 * @see 对疾病信息修改
	 * @param Disease disease实体类对象
	 * @return int,表示修改的数量
	 * */
	public Integer updateDisease(Disease disease);
//	查询该疾病分类下的 疾病id 返回 List<Integer>	
	/*6. 查询疾病分类下的疾病id
	 * @see 对疾病信息修改
	 * @param diseCategoryID 疾病分类id
	 * @return  Integer[]
	 * */
	public Integer[] getDiseaseIds(@Param("diseCategoryID")Integer diseCategoryID);
}
