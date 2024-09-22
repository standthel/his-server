package com.his.disease.entity;

public class Disecategory {
	private Integer id;
	private String dicaCode;
	private String dicaName;
	private Integer sequenceNo;
	private Integer dicaType;
	private Integer delMark;
	public Disecategory() {
		super();
	}
	public Disecategory(Integer id, String dicaCode, String dicaName, Integer sequenceNo, Integer dicaType) {
		super();
		this.id = id;
		this.dicaCode = dicaCode;
		this.dicaName = dicaName;
		this.sequenceNo = sequenceNo;
		this.dicaType = dicaType;
	}
	public Disecategory(String dicaCode, String dicaName, Integer sequenceNo, Integer dicaType) {
		super();
		this.dicaCode = dicaCode;
		this.dicaName = dicaName;
		this.sequenceNo = sequenceNo;
		this.dicaType = dicaType;
	}
	public Disecategory(Integer id, String dicaCode, String dicaName, Integer sequenceNo, Integer dicaType,
			Integer delMark) {
		super();
		this.id = id;
		this.dicaCode = dicaCode;
		this.dicaName = dicaName;
		this.sequenceNo = sequenceNo;
		this.dicaType = dicaType;
		this.delMark = delMark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDicaCode() {
		return dicaCode;
	}
	public void setDicaCode(String dicaCode) {
		this.dicaCode = dicaCode;
	}
	public String getDicaName() {
		return dicaName;
	}
	public void setDicaName(String dicaName) {
		this.dicaName = dicaName;
	}
	public Integer getSequenceNo() {
		return sequenceNo;
	}
	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public Integer getDicaType() {
		return dicaType;
	}
	public void setDicaType(Integer dicaType) {
		this.dicaType = dicaType;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "Disecategory [id=" + id + ", dicaCode=" + dicaCode + ", dicaName=" + dicaName + ", sequenceNo="
				+ sequenceNo + ", dicaType=" + dicaType + ", delMark=" + delMark + "]";
	}
}
