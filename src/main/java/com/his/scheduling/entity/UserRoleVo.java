package com.his.scheduling.entity;

public class UserRoleVo {
	private Integer id;
	private String ruleName;
	private String realName;
	private Integer deptID;
	private Integer userID;
	private String week;
	private Integer delMark;
	public UserRoleVo() {
		super();
	}
	public UserRoleVo(Integer id, String ruleName, String week) {
		super();
		this.id = id;
		this.ruleName = ruleName;
		this.week = week;
	}
	public UserRoleVo(String ruleName, Integer deptID, Integer userID, String week, Integer delMark) {
		super();
		this.ruleName = ruleName;
		this.deptID = deptID;
		this.userID = userID;
		this.week = week;
		this.delMark = delMark;
	}
	public UserRoleVo(Integer id, String ruleName, Integer deptID, Integer userID, String week, Integer delMark) {
		super();
		this.id = id;
		this.ruleName = ruleName;
		this.deptID = deptID;
		this.userID = userID;
		this.week = week;
		this.delMark = delMark;
	}
	public UserRoleVo(Integer id, String ruleName, String realName, Integer deptID, Integer userID, String week,
			Integer delMark) {
		super();
		this.id = id;
		this.ruleName = ruleName;
		this.realName = realName;
		this.deptID = deptID;
		this.userID = userID;
		this.week = week;
		this.delMark = delMark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getDeptID() {
		return deptID;
	}
	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "UserRoleVo [id=" + id + ", ruleName=" + ruleName+ ", realName=" + realName + ", deptID=" + deptID + ", userID=" + userID
				+ ", week=" + week + ", delMark=" + delMark + "]";
	}
}
