package com.his.scheduling.entity;

public class DeptVo {
	private Integer id;
	private String deptName;
	public DeptVo() {
		super();
	}
	public DeptVo(Integer id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "DeptVo [id=" + id + ", deptName=" + deptName + "]";
	}
	
}
