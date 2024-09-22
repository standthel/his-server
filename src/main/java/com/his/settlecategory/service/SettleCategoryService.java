package com.his.settlecategory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.his.settlecategory.entity.SettleCategory;

@Service
public interface SettleCategoryService {
	/*1.对结算类别项目的添加
	 * @see 对结算类别数据进行添加
	 * @param SettleCategory settleCategory实体类对象
	 * @return int,表示添加的数量
	 * */
	public boolean addSettleCategory(SettleCategory settleCategory);
	/*2.对结算类别删除单个
	 * @see 对结算类别数据进行单个删除
	 * @param id 结算类别的id
	 * @return int,表示删除的数量
	 * */
	public boolean deleteSettleCategory(Integer id);
	/*3. 对结算类别的修改
	 * @see 对结算类别数据修改
	 * @param SettleCategory settleCategory实体类对象
	 * @return int,表示修改的数量
	 * */
	public boolean updateSettleCategory(SettleCategory settleCategory);
	/*4.带条件的分页查询
	 * @see 对结算类别数据进行条件分页查询   支持根据类别名称进行搜索
	 * @param page 表示当前页	limit表示每页数量	
	 * 			查询关键字:	keyword 类别名称
	 * @return List<SettleCategory>分页查询数据
	 * */
	public List<SettleCategory> pageSettleCategory(Integer page,
												   Integer limit,
												   String keyword);
	/*5.查询总数依照分页
	 * @see 对结算类别数据总数进行显示 ,用于分页   支持根据类别名称进行搜索
	 * @param 查询关键字:	查询关键字:	keyword 类别名称
	 * @return int	总数量用于分页
	 * */
	public Integer pageSettleCategoryTotal(String keyword);
}
