package com.his.fmeditem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.fmeditem.entity.Fmeditem;
import com.his.fmeditem.entity.FmeditemVo;
import com.his.fmeditem.service.FmeditemService;
import com.his.fmeditem.util.M;

@RestController
@CrossOrigin
@RequestMapping("/his/fmeditem")
public class FmeditemController {
	@Autowired
	private FmeditemService fmeditemService;
	/*1.对非药品收费项目的添加
	 * @see 对非药品收费项目数据进行添加
	 * @param Fmeditem fmeditem实体类对象
	 * @return int,表示添加的数量
	 * */
	@RequestMapping("/addFmeditem")
	public M addFmeditem(@RequestBody Fmeditem fmeditem)throws Exception{
		boolean flag=fmeditemService.addFmeditem(fmeditem);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*2.对非药品收费项目删除单个
	 * @see 对非药品收费项目数据进行单个删除
	 * @param id 科室的id
	 * @return int,表示删除的数量
	 * */
	@RequestMapping("/deleteFmeditem")
	public M deleteFmeditem(Integer id)throws Exception{
		boolean flag=fmeditemService.deleteFmeditem(id);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*3.对非药品收费项目的删除通过多个id
	 * @see 对非药品收费项目数据进行批量删除
	 * @param Integter [] ids  多个id
	 * @return int,表示删除的数量
	 * */
	@RequestMapping("/delFmeditemByIds")
	public M delFmeditemByIds(@RequestBody Integer[] ids)throws Exception{
		Integer[] intIds = new Integer[ids.length]; // 创建一个与原数组相同长度的新数组
		for (int i = 0; i < ids.length; i++) {
	        intIds[i] = ids[i];
	    }
		boolean flag=fmeditemService.delFmeditemByIds(intIds);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*4. 对非药品收费项的修改
	 * @see 对非药品收费项数据修改
	 * @param Fmeditem fmeditem实体类对象
	 * @return int,表示修改的数量
	 * */
	@RequestMapping("/updateFmeditem")
	public M updateFmeditem(@RequestBody Fmeditem fmeditem)throws Exception{
		boolean flag=fmeditemService.updateFmeditem(fmeditem);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*5.带条件的分页查询
	 * @see 对非药品收费项数据进行条件分页查询   支持根据项目名和项目类型进行搜索
	 * @param page 表示当前页	limit表示每页数量	
	 * 			查询关键字:	itemName 表示项目名	recordType 表示项目类型
	 * @return List<FmeditemVo>分页查询数据
	 * */
	/*6.查询总数依照分页
	 * @see 对非药品收费项数据总数进行显示 ,用于分页  根据项目名和项目类型进行搜索
	 * @param 查询关键字:	itemName 表示项目名	recordType 表示项目类型
	 * @return int	总数量用于分页
	 * */
	@RequestMapping("/pageFmeditem")
	public M pageFmeditem(Integer page, 
			 			  Integer limit, 
			 			  String itemName, 
			 			  Integer recordType)throws Exception{
		page=(page-1)*limit;
		List<FmeditemVo> aFmeditem=fmeditemService.pageFmeditem(page, limit, itemName, recordType);
		Integer count=fmeditemService.pageFmeditemTotal(itemName, recordType);
		return M.ok().data("aFmeditem", aFmeditem).data("count", count);
	}
	/*7.查询所有非药品收费项信息
	 * @see 查询所有非药品收费项信息
	 * @param 无
	 * @return List<Fmeditem>	全部的非药品收费项数据
	 * */
	@RequestMapping("/findAll")
	public M findAll()throws Exception{
		List<Fmeditem> allFmeditem=fmeditemService.findAll();
		return M.ok().data("allFmeditem", allFmeditem);
	}
	/*8.批量插入通过excel
	 * @see 对科室数据通过excel进行批量插入
	 * @param List<Fmeditem> list
	 * @return int	插入数量
	 * */
	@RequestMapping("/batchInsert")
	public M batchInsert(@RequestBody List<Fmeditem> list)throws Exception{
		boolean flag=fmeditemService.batchInsert(list);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
}
