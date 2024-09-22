package com.his.scheduling.entity;

public class DeptUser {
	private Integer userID;
	private Integer deptID;
	private String realName;
	public DeptUser() {
		super();
	}
	public DeptUser(Integer userID, Integer deptID, String realName) {
		super();
		this.userID = userID;
		this.deptID = deptID;
		this.realName = realName;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getDeptID() {
		return deptID;
	}
	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	@Override
	public String toString() {
		return "DeptUser [userID=" + userID + ", deptID=" + deptID + ", realName=" + realName + "]";
	}
}
