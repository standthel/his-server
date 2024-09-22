package com.his.registlevel.entity;


public class RegistLevel {
	private Integer id;
	private String registCode;
	private String registName;
	private Integer sequenceNo;
	private double registFee;
	private Integer registQuota;
	private Integer delMark;
	public RegistLevel() {
		super();
	}
	public RegistLevel(String registCode, String registName, Integer sequenceNo, double registFee,
			Integer registQuota) {
		super();
		this.registCode = registCode;
		this.registName = registName;
		this.sequenceNo = sequenceNo;
		this.registFee = registFee;
		this.registQuota = registQuota;
	}
	public RegistLevel(Integer id, String registCode, String registName, Integer sequenceNo, double registFee,
			Integer registQuota, Integer delMark) {
		super();
		this.id = id;
		this.registCode = registCode;
		this.registName = registName;
		this.sequenceNo = sequenceNo;
		this.registFee = registFee;
		this.registQuota = registQuota;
		this.delMark = delMark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRegistCode() {
		return registCode;
	}
	public void setRegistCode(String registCode) {
		this.registCode = registCode;
	}
	public String getRegistName() {
		return registName;
	}
	public void setRegistName(String registName) {
		this.registName = registName;
	}
	public Integer getSequenceNo() {
		return sequenceNo;
	}
	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public double getRegistFee() {
		return registFee;
	}
	public void setRegistFee(double registFee) {
		this.registFee = registFee;
	}
	public Integer getRegistQuota() {
		return registQuota;
	}
	public void setRegistQuota(Integer registQuota) {
		this.registQuota = registQuota;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "RegistLevel [id=" + id + ", registCode=" + registCode + ", registName=" + registName + ", sequenceNo="
				+ sequenceNo + ", registFee=" + registFee + ", registQuota=" + registQuota + ", delMark=" + delMark
				+ "]";
	}
	
}
