package com.his.registlevel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.his.registlevel.entity.RegistLevel;

@Service
public interface RegistLevelService {
	/*1.对挂号级别的添加
	 * @see 对挂号级别数据进行添加
	 * @param RegistLevel registLevel实体类对象
	 * @return int,表示添加的数量
	 * */
	public boolean addRegistLevel(RegistLevel registLevel);
	/*2.对挂号级别删除单个
	 * @see 对挂号级别数据进行单个删除
	 * @param id 挂号级别的id
	 * @return int,表示删除的数量
	 * */
	public boolean delRegistLevel(Integer id);
	/*3. 对挂号级别的修改
	 * @see 对挂号级别数据修改
	 * @param RegistLevel registLevel实体类对象
	 * @return int,表示修改的数量
	 * */
	public boolean updateRegistLevel(RegistLevel registLevel);
	/*4.带条件的分页查询
	 * @see 对挂号级别数据进行条件分页查询
	 * @param page 表示当前页	limit表示每页数量	
	 * @return List<RegistLevel>分页查询数据	挂号级别的对象
	 * */
	public List<RegistLevel> pageRegistLevel(Integer page,
											 Integer limit);
	/*5.查询总数依照分页
	 * @see 对挂号级别数据进行条件分页查询
	 * @param 无
	 * @return int	总数量用于分页
	 * */
	public Integer pageRegistLevelTotal();
}
