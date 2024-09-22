package com.his.constantItem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.his.constantItem.entity.Drug;

@Mapper
public interface DrugMapper {
	/*
	 * 描述：常数项模块，查询所有并分页显示
	 * 参数：int page int limit
	 * 		String keywords
	 * 返回值：List<ConstantItem>
	 */
	public List<Drug> getDrugList(@Param("keywords") String keywords);
	/*
	 * 描述：总行数，为分页提供
	 * 参数：  String keywords
	 * 返回值: int
	 */
	public Integer getDrugTotal(@Param("keywords")String keywords);
	/*
	 * 描述：删除
	 * 参数： int id
	 * 返回值：int  0--失败  1---成功
	 */
	public Integer deleteDrugById(@Param("id")Integer id);
	/*
	 *  描述：增加
	 *  参数:Drug drug
	 *  返回值：int 0--失败 1--成功
	 */
	public Integer addDrug(Drug drug);
}
