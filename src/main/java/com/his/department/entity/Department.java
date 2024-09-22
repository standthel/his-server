package com.his.department.entity;

import com.alibaba.excel.annotation.ExcelProperty;

public class Department {
	private Integer id;
	private String deptCode;
	private String deptName;
	private Integer deptCategoryID;
	private Integer deptType;
	private Integer delMark;
	public Department() {
		super();
	}
	public Department(String deptCode, String deptName, Integer deptCategoryID, Integer deptType, Integer delMark) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.deptCategoryID = deptCategoryID;
		this.deptType = deptType;
		this.delMark = delMark;
	}
	public Department(Integer id, String deptCode, String deptName, Integer deptCategoryID, Integer deptType,
			Integer delMark) {
		super();
		this.id = id;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.deptCategoryID = deptCategoryID;
		this.deptType = deptType;
		this.delMark = delMark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Integer getDeptCategoryID() {
		return deptCategoryID;
	}
	public void setDeptCategoryID(Integer deptCategoryID) {
		this.deptCategoryID = deptCategoryID;
	}
	public Integer getDeptType() {
		return deptType;
	}
	public void setDeptType(Integer deptType) {
		this.deptType = deptType;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptCode=" + deptCode + ", deptName=" + deptName + ", deptCategoryID="
				+ deptCategoryID + ", deptType=" + deptType + ", delMark=" + delMark + "]";
	}
}
