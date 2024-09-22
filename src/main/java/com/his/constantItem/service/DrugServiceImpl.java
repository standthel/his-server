package com.his.constantItem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.constantItem.entity.Drug;
import com.his.constantItem.mapper.DrugMapper;

@Service
public class DrugServiceImpl implements DrugService {
	@Autowired
	private DrugMapper drugMapper;
	/*
	 * 描述：常数项模块，查询所有并分页显示
	 * 参数：int page int limit
	 * 		String keywords
	 * 返回值：List<ConstantItem>
	 */
	@Override
	public List<Drug> getDrugList(String keywords) {
		return drugMapper.getDrugList(keywords);
	}
	/*
	 * 描述：总行数，为分页提供
	 * 参数：  String keywords
	 * 返回值: int
	 */
	@Override
	public Integer getDrugTotal(String keywords) {
		return drugMapper.getDrugTotal(keywords);
	}
	/*
	 * 描述：删除
	 * 参数： int id
	 * 返回值：int  0--失败  1---成功
	 */
	@Override
	public boolean deleteDrugById(Integer id) {
		int result=drugMapper.deleteDrugById(id);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/*
	 *  描述：增加
	 *  参数:Drug drug
	 *  返回值：int 0--失败 1--成功
	 */
	@Override
	public boolean addDrug(Drug drug) {
		int result=drugMapper.addDrug(drug);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}

}
