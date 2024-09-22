package com.his.constantItem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.his.constantItem.entity.Drug;

@Service
public interface DrugService {
	/*
	 * 描述：常数项模块，查询所有并分页显示
	 * 参数：int page int limit
	 * 		String keywords
	 * 返回值：List<ConstantItem>
	 */
	public List<Drug> getDrugList(String keywords);
	/*
	 * 描述：总行数，为分页提供
	 * 参数：  String keywords
	 * 返回值: int
	 */
	public Integer getDrugTotal(String keywords);
	/*
	 * 描述：删除
	 * 参数： int id
	 * 返回值：int  0--失败  1---成功
	 */
	public boolean deleteDrugById(Integer id);
	/*
	 *  描述：增加
	 *  参数:Drug drug
	 *  返回值：int 0--失败 1--成功
	 */
	public boolean addDrug(Drug drug);
}
