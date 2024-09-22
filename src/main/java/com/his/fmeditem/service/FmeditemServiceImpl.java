package com.his.fmeditem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.fmeditem.entity.Fmeditem;
import com.his.fmeditem.entity.FmeditemVo;
import com.his.fmeditem.mapper.FmeditemMapper;

@Service
public class FmeditemServiceImpl implements FmeditemService {
	@Autowired
	private FmeditemMapper fmeditemMapper;
	/*1.对非药品收费项目的添加
	 * @see 对非药品收费项目数据进行添加
	 * @param Fmeditem fmeditem实体类对象
	 * @return int,表示添加的数量
	 * */
	@Override
	public boolean addFmeditem(Fmeditem fmeditem) {
		int result=fmeditemMapper.addFmeditem(fmeditem);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/*2.对非药品收费项目删除单个
	 * @see 对非药品收费项目数据进行单个删除
	 * @param id 科室的id
	 * @return int,表示删除的数量
	 * */
	@Override
	public boolean deleteFmeditem(Integer id) {
		int result=fmeditemMapper.deleteFmeditem(id);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/*3.对非药品收费项目的删除通过多个id
	 * @see 对非药品收费项目数据进行批量删除
	 * @param Integter [] ids  多个id
	 * @return int,表示删除的数量
	 * */
	@Override
	public boolean delFmeditemByIds(Integer[] ids) {
		int result=fmeditemMapper.delFmeditemByIds(ids);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/*4. 对非药品收费项的修改
	 * @see 对非药品收费项数据修改
	 * @param Fmeditem fmeditem实体类对象
	 * @return int,表示修改的数量
	 * */
	@Override
	public boolean updateFmeditem(Fmeditem fmeditem) {
		int result=fmeditemMapper.updateFmeditem(fmeditem);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}
	/*5.带条件的分页查询
	 * @see 对非药品收费项数据进行条件分页查询   支持根据项目名和项目类型进行搜索
	 * @param page 表示当前页	limit表示每页数量	
	 * 			查询关键字:	itemName 表示项目名	recordType 表示项目类型
	 * @return List<FmeditemVo>分页查询数据
	 * */
	@Override
	public List<FmeditemVo> pageFmeditem(Integer page, 
										 Integer limit, 
										 String itemName, 
										 Integer recordType) {
		return fmeditemMapper.pageFmeditem(page, limit, itemName, recordType);
	}
	/*6.查询总数依照分页
	 * @see 对非药品收费项数据总数进行显示 ,用于分页  根据项目名和项目类型进行搜索
	 * @param 查询关键字:	itemName 表示项目名	recordType 表示项目类型
	 * @return int	总数量用于分页
	 * */
	@Override
	public Integer pageFmeditemTotal(String itemName, 
									 Integer recordType) {
		return fmeditemMapper.pageFmeditemTotal(itemName, recordType);
	}
	/*7.查询所有非药品收费项信息
	 * @see 查询所有非药品收费项信息
	 * @param 无
	 * @return List<Fmeditem>	全部的非药品收费项数据
	 * */
	@Override
	public List<Fmeditem> findAll() {
		return fmeditemMapper.findAll();
	}
	/*8.批量插入通过excel
	 * @see 对科室数据通过excel进行批量插入
	 * @param List<Fmeditem> list
	 * @return int	插入数量
	 * */
	@Override
	public boolean batchInsert(List<Fmeditem> list) {
		int result=fmeditemMapper.batchInsert(list);
		boolean flag=false;
		if (result>0) {
			flag=true;
		}
		return flag;
	}

}
