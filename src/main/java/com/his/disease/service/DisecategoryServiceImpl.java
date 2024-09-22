package com.his.disease.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.disease.entity.Disecategory;
import com.his.disease.mapper.DiseCategoryMapper;

@Service
public class DisecategoryServiceImpl implements DisecategoryService {
	@Autowired
	private DiseCategoryMapper diseCategoryMapper;
	/*1.获取所有的疾病分类
	 * @see 获取所有的疾病分类,支持根据分类名称和疾病类型 进行条件过滤
	 * @param dicaName 分类名称	dicaType 疾病类型
	 * @return List<Disecategory> 包含Disecategory实体类的对象
	 * */
	@Override
	public List<Disecategory> getAllDiseCategory(String dicaName, 
												 Integer dicaType) {
		return diseCategoryMapper.getAllDiseCategory(dicaName, dicaType);
	}
	/*2.添加疾病分类的方法
	 * @see 添加疾病分类的方法
	 * @param Disecategory disecategory实体类对象
	 * @return int,表示添加的数量
	 * */
	@Override
	public boolean addDiseCategory(Disecategory disecategory) {
		int result=diseCategoryMapper.addDiseCategory(disecategory);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/*3.修改疾病分类的方法
	 * @see 修改疾病分类的方法
	 * @param Disecategory disecategory实体类对象
	 * @return int,表示修改的数量
	 * */
	@Override
	public boolean updateDiseCategory(Disecategory disecategory) {
		int result=diseCategoryMapper.updateDiseCategory(disecategory);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/*4.分页查询疾病分类 
	 * @see 修改疾病分类的方法  支持分类名称和疾病类型
	 * @param page 表示当前页	limit表示每页数量	dicaName 分类名称	dicaType 疾病类型
	 * @return List<Disecategory> 包括疾病分类的对象
	 * */	
	@Override
	public List<Disecategory> pageDiseCategoryQuery(Integer page, 
													Integer limit, 
													String dicaName, 
													Integer dicaType) {
		return diseCategoryMapper.pageDiseCategoryQuery(page, limit, dicaName, dicaType);
	}
	/*5.查找分类总数
	 * @see 用于分页显示，查找分类总数
	 * @param dicaName 分类名称	dicaType 疾病类型
	 * @return int 分页总数
	 * */
	@Override
	public Integer pageDiseCategoryTotal(String dicaName, 
										 Integer dicaType) {
		return diseCategoryMapper.pageDiseCategoryTotal(dicaName, dicaType);
	}
	/*6.删除疾病分类
	 * @see 根据id删除疾病分类,删除该疾病分类之前应先删除该分类下的疾病信息
	 * @param id 疾病分类id
	 * @return int 删除的数量
	 * */	
	@Override
	public boolean deleteDiseCategoryQuery(Integer id) {
		int result=diseCategoryMapper.deleteDiseCategoryQuery(id);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}

}
