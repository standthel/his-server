package com.his.registlevel.util;
/**
 * 
 * @author stranlc
 *封装状态码、封装成功或失败的信息、封装是否成功的标识
 *使用了java的单例模式；
 *外界无法实例化对象，只能通过静态方法完成调用
 */

import java.util.HashMap;
import java.util.Map;


public class M {
	private boolean success;//是否成功标识（true/false）
	private Integer code;//状态码
	private String message;//封装返回的信息
	private Map<String, Object> data=new HashMap<String, Object>();//封装返回数据，键值对的形式
	/**
	 * 构造方法私有化意味着除了本类，任何外界不能使用
	 */
	private M() {}
	/**
	 * 定义static修饰的方法ok代表的是成功，返回值为M
	 * @return
	 */
	public static M ok() {
		M m=new M();
		m.setSuccess(true);
		m.setCode(ResultCode.SUCCESS);
		m.setMessage("成功");
		return m;
	}
	/**
	 * 定义static修饰的方法error代表失败，返回值为M
	 * @return
	 */
	public static M error() {
		M m=new M();
		m.setSuccess(false);
		m.setCode(ResultCode.ERROR);
		m.setMessage("失败");
		return m;
	}
	/**
	 * 封装返回的键值对数据
	 * @return
	 */
	public M data(String key,Object obj) {
		this.data.put(key,obj);
		return this;
	}
	/**
	 * 给属性data通过set方法完成赋值
	 * @return
	 */
	public M data(Map<String, Object>map) {
		this.setData(map);
		return this;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	public boolean getSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
