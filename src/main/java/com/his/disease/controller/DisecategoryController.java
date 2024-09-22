package com.his.disease.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.disease.entity.Disecategory;
import com.his.disease.service.DisecategoryService;
import com.his.disease.util.M;

@RestController
@CrossOrigin
@RequestMapping("/his/disecategory")
public class DisecategoryController {
	@Autowired
	private DisecategoryService disecategoryService;
	/*1.获取所有的疾病分类
	 * @see 获取所有的疾病分类,支持根据分类名称和疾病类型 进行条件过滤
	 * @param dicaName 分类名称	dicaType 疾病类型
	 * @return List<Disecategory> 包含Disecategory实体类的对象
	 * */
	@RequestMapping("/getAllDiseCategory")
	public M getAllDiseCategory(String dicaName, 
			 					Integer dicaType)throws Exception{
		List<Disecategory> allDiseCategory=disecategoryService.getAllDiseCategory(dicaName, dicaType);
		return M.ok().data("allDiseCategory", allDiseCategory);
	}
	/*2.添加疾病分类的方法
	 * @see 添加疾病分类的方法
	 * @param Disecategory disecategory实体类对象
	 * @return int,表示添加的数量
	 * */
	@RequestMapping("/addDiseCategory")
	public M addDiseCategory(@RequestBody Disecategory disecategory)throws Exception{
		boolean flag=disecategoryService.addDiseCategory(disecategory);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*3.修改疾病分类的方法
	 * @see 修改疾病分类的方法
	 * @param Disecategory disecategory实体类对象
	 * @return int,表示修改的数量
	 * */
	@RequestMapping("/updateDiseCategory")
	public M updateDiseCategory(@RequestBody Disecategory disecategory)throws Exception{
		boolean flag=disecategoryService.updateDiseCategory(disecategory);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*4.分页查询疾病分类 
	 * @see 修改疾病分类的方法  支持分类名称和疾病类型
	 * @param page 表示当前页	limit表示每页数量	dicaName 分类名称	dicaType 疾病类型
	 * @return List<Disecategory> 包括疾病分类的对象
	 * */
	@RequestMapping("/pageDiseCategoryQuery")
	public M pageDiseCategoryQuery(Integer page, 
								   Integer limit, 
								   String dicaName, 
								   Integer dicaType)throws Exception{
		page=(page-1)*limit;
		List<Disecategory> DCQuery=disecategoryService.pageDiseCategoryQuery(page, limit, dicaName, dicaType);
		Integer count=disecategoryService.pageDiseCategoryTotal(dicaName, dicaType);
		return M.ok().data("DCQuery", DCQuery).data("count", count);
	}
	/*6.删除疾病分类
	 * @see 根据id删除疾病分类,删除该疾病分类之前应先删除该分类下的疾病信息
	 * @param id 疾病分类id
	 * @return int 删除的数量
	 * */
	@RequestMapping("/deleteDiseCategoryQuery")
	public M deleteDiseCategoryQuery(Integer id)throws Exception{
		boolean flag=disecategoryService.deleteDiseCategoryQuery(id);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
}
