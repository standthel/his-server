package com.his.registlevel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.registlevel.entity.RegistLevel;
import com.his.registlevel.service.RegistLevelService;
import com.his.registlevel.util.M;

@RestController
@CrossOrigin
@RequestMapping("/his/registLevel")
public class RegistLevelController {
	@Autowired
	private RegistLevelService registLevelService;
	/*1.对挂号级别的添加
	 * @see 对挂号级别数据进行添加
	 * @param RegistLevel registLevel实体类对象
	 * @return int,表示添加的数量
	 * */
	@RequestMapping("/addRegistLevel")
	public M addRegistLevel(@RequestBody RegistLevel registLevel)throws Exception{
		boolean flag=registLevelService.addRegistLevel(registLevel);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*2.对挂号级别删除单个
	 * @see 对挂号级别数据进行单个删除
	 * @param id 挂号级别的id
	 * @return int,表示删除的数量
	 * */
	@RequestMapping("/delRegistLevel")
	public M delRegistLevel(Integer id)throws Exception{
		boolean flag=registLevelService.delRegistLevel(id);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*3. 对挂号级别的修改
	 * @see 对挂号级别数据修改
	 * @param RegistLevel registLevel实体类对象
	 * @return int,表示修改的数量
	 * */
	@RequestMapping("/updateRegistLevel")
	public M updateRegistLevel(RegistLevel registLevel)throws Exception{
		boolean flag=registLevelService.updateRegistLevel(registLevel);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
	/*4.带条件的分页查询
	 * @see 对挂号级别数据进行条件分页查询
	 * @param page 表示当前页	limit表示每页数量	
	 * @return List<RegistLevel>分页查询数据	挂号级别的对象
	 * */
	@RequestMapping("/pageRegistLevel")
	public M pageRegistLevel(Integer page, 
			 				 Integer limit)throws Exception{
		page=(page-1)*limit; 
		List<RegistLevel> rLevel=registLevelService.pageRegistLevel(page, limit);
		Integer count=registLevelService.pageRegistLevelTotal();
		return M.ok().data("rLevel", rLevel).data("count", count);
	}
}
