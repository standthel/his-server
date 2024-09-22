package com.his.disease.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.disease.entity.Disease;
import com.his.disease.service.DiseaseService;
import com.his.disease.util.M;

@RestController
@CrossOrigin
@RequestMapping("/his/disease")
public class DiseaseController {
	@Autowired
	private DiseaseService diseaseService;
	/*1.根据疾病分类查询疾病信息
	 * @see 根据疾病分类查询疾病信息
	 * @param diseCategoryID 疾病分类	  page 表示当前页	 limit表示每页数量	
	 * @return List<Disease>分页查询数据
	 * */
	/*2.查询总数用于分页
	 * @see 对疾病信息总数进行显示 ,用于分页  
	 * @param diseCategoryID 疾病分类
	 * @return int	总数量用于分页
	 * */
	@RequestMapping("/getdiseaseInfo")
	public M getdiseaseInfo(Integer diseCategoryID, 
							Integer page, 
							Integer limit)throws Exception{
		page=(page-1)*limit;
		List<Disease> dInfo=diseaseService.getdiseaseInfo(diseCategoryID, page, limit);
		Integer count=diseaseService.getdiseaseInfoTotal(diseCategoryID);
		return M.ok().data("dInfo", dInfo).data("count", count);
	}
	/*3.对诊断信息的添加
	 * @see 对诊断信息进行添加
	 * @param Disease disease实体类对象
	 * @return int,表示添加的数量
	 * */
	@RequestMapping("/addDisease")
	public M addDisease(@RequestBody Disease disease)throws Exception{
		boolean flag=diseaseService.addDisease(disease);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*4.对诊断信息的删除通过多个id
	 * @see 对诊断信息进行批量删除
	 * @param Integter [] ids  多个科室id
	 * @return int,表示删除的数量
	 * */
	@RequestMapping("/delDiseaseByIds")
	public M delDiseaseByIds(@RequestBody Integer[] ids)throws Exception{
		boolean flag=diseaseService.delDiseaseByIds(ids);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*5. 对疾病信息的修改
	 * @see 对疾病信息修改
	 * @param Disease disease实体类对象
	 * @return int,表示修改的数量
	 * */
	@RequestMapping("/updateDisease")
	public M updateDisease(@RequestBody Disease disease)throws Exception{
		boolean flag=diseaseService.updateDisease(disease);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*6. 查询疾病分类下的疾病id
	 * @see 对疾病信息修改
	 * @param diseCategoryID 疾病分类id
	 * @return  Integer[]
	 * */
	@RequestMapping("/getDiseaseIds")
	public M getDiseaseIds(Integer diseCategoryID)throws Exception{
		Integer[] ids = diseaseService.getDiseaseIds(diseCategoryID);
		Integer[] intIds = new Integer[ids.length]; // 创建一个与原数组相同长度的新数组
		for (int i = 0; i < ids.length; i++) {
	        intIds[i] = ids[i];
	    }
		return M.ok().data("intIds", intIds);
	}
}
