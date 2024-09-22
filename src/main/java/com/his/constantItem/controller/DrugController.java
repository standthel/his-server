package com.his.constantItem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.constantItem.entity.Drug;
import com.his.constantItem.service.DrugService;
import com.his.constantItem.util.M;

@RestController
@CrossOrigin
@RequestMapping("/his/drug")
public class DrugController {
	@Autowired
	private DrugService drugService;
	/*
	 * 描述：常数项模块，查询所有并分页显示
	 * 参数：int page int limit
	 * 		String keywords
	 * 返回值：List<ConstantItem>
	 */
	@RequestMapping("/getDrugList")
	public M getDrugList(String keywords)throws Exception{
		List<Drug> aDrugList=drugService.getDrugList(keywords);
		return M.ok().data("aDrugList", aDrugList);
	}
	/*
	 * 描述：删除
	 * 参数： int id
	 * 返回值：int  0--失败  1---成功
	 */
	@RequestMapping("/deleteDrugById")
	public M deleteDrugById(Integer id)throws Exception{
		boolean flag=drugService.deleteDrugById(id);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*
	 *  描述：增加
	 *  参数:Drug drug
	 *  返回值：int 0--失败 1--成功
	 */
	@RequestMapping("/addDrug")
	public M addDrug(@RequestBody Drug drug)throws Exception{
		System.out.println(drug);
		boolean flag=drugService.addDrug(drug);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
}
