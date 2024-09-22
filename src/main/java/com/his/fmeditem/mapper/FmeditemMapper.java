package com.his.fmeditem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.his.fmeditem.entity.Fmeditem;
import com.his.fmeditem.entity.FmeditemVo;

@Mapper
public interface FmeditemMapper {
	/*1.对非药品收费项目的添加
	 * @see 对非药品收费项目数据进行添加
	 * @param Fmeditem fmeditem实体类对象
	 * @return int,表示添加的数量
	 * */
	public Integer addFmeditem(Fmeditem fmeditem);
	/*2.对非药品收费项目删除单个
	 * @see 对非药品收费项目数据进行单个删除
	 * @param id 科室的id
	 * @return int,表示删除的数量
	 * */
	public Integer deleteFmeditem(@Param("id")Integer id);
	/*3.对非药品收费项目的删除通过多个id
	 * @see 对非药品收费项目数据进行批量删除
	 * @param Integter [] ids  多个id
	 * @return int,表示删除的数量
	 * */
	public Integer delFmeditemByIds(@Param("ids")Integer[] ids);
	/*4. 对非药品收费项的修改
	 * @see 对非药品收费项数据修改
	 * @param Fmeditem fmeditem实体类对象
	 * @return int,表示修改的数量
	 * */
	public Integer updateFmeditem(Fmeditem fmeditem);
	/*5.带条件的分页查询
	 * @see 对非药品收费项数据进行条件分页查询   支持根据项目名和项目类型进行搜索
	 * @param page 表示当前页	limit表示每页数量	
	 * 			查询关键字:	itemName 表示项目名	recordType 表示项目类型
	 * @return List<FmeditemVo>分页查询数据
	 * */
	public List<FmeditemVo> pageFmeditem(@Param("page")Integer page,
										 @Param("limit")Integer limit,
										 @Param("itemName")String itemName,
										 @Param("recordType")Integer recordType);
	/*6.查询总数依照分页
	 * @see 对非药品收费项数据总数进行显示 ,用于分页  根据项目名和项目类型进行搜索
	 * @param 查询关键字:	itemName 表示项目名	recordType 表示项目类型
	 * @return int	总数量用于分页
	 * */
	public Integer pageFmeditemTotal(@Param("itemName")String itemName,
									 @Param("recordType")Integer recordType);
	/*7.查询所有非药品收费项信息
	 * @see 查询所有非药品收费项信息
	 * @param 无
	 * @return List<Fmeditem>	全部的非药品收费项数据
	 * */
	public List<Fmeditem> findAll();
	/*8.批量插入通过excel
	 * @see 对科室数据通过excel进行批量插入
	 * @param List<Fmeditem> list
	 * @return int	插入数量
	 * */
	public Integer batchInsert(List<Fmeditem> list);
}
