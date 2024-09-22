package com.his.settlecategory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.settlecategory.entity.SettleCategory;
import com.his.settlecategory.service.SettleCategoryService;
import com.his.settlecategory.util.M;

@RestController
@CrossOrigin
@RequestMapping("/his/settleCategory")
public class SettleCategoryController {
	@Autowired
	private SettleCategoryService settleCategoryService;
	/*1.对结算类别项目的添加
	 * @see 对结算类别数据进行添加
	 * @param SettleCategory settleCategory实体类对象
	 * @return int,表示添加的数量
	 * */
	@RequestMapping("/addSettleCategory")
	public M addSettleCategory(@RequestBody SettleCategory settleCategory)throws Exception{
		boolean flag=settleCategoryService.addSettleCategory(settleCategory);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*2.对结算类别删除单个
	 * @see 对结算类别数据进行单个删除
	 * @param id 结算类别的id
	 * @return int,表示删除的数量
	 * */
	@RequestMapping("/deleteSettleCategory")
	public M deleteSettleCategory(Integer id)throws Exception{
		boolean flag=settleCategoryService.deleteSettleCategory(id);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*3. 对结算类别的修改
	 * @see 对结算类别数据修改
	 * @param SettleCategory settleCategory实体类对象
	 * @return int,表示修改的数量
	 * */
	@RequestMapping("/updateSettleCategory")
	public M updateSettleCategory(@RequestBody SettleCategory settleCategory)throws Exception{
		boolean flag=settleCategoryService.updateSettleCategory(settleCategory);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*4.带条件的分页查询
	 * @see 对结算类别数据进行条件分页查询   支持根据类别名称进行搜索
	 * @param page 表示当前页	limit表示每页数量	
	 * 			查询关键字:	keyword 类别名称
	 * @return List<SettleCategory>分页查询数据
	 * */
	@RequestMapping("/pageSettleCategory")
	public M pageSettleCategory(Integer page, 
			   					Integer limit, 
			   					String keyword)throws Exception{
		page=(page-1)*limit;
		Integer count=settleCategoryService.pageSettleCategoryTotal(keyword);
		List<SettleCategory> sCategory=settleCategoryService.pageSettleCategory(page, limit, keyword);
		return M.ok().data("count", count).data("sCategory", sCategory);
		
	}
}
