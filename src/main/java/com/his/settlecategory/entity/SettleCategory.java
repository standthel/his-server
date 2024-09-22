package com.his.settlecategory.entity;

public class SettleCategory {
	private Integer id;
	private String settleCode;
	private String settleName;
	private Integer sequenceNo;
	private Integer delMark;
	public SettleCategory() {
		super();
	}
	public SettleCategory(String settleCode, String settleName, Integer sequenceNo) {
		super();
		this.settleCode = settleCode;
		this.settleName = settleName;
		this.sequenceNo = sequenceNo;
	}
	public SettleCategory(Integer id, String settleCode, String settleName, Integer sequenceNo) {
		super();
		this.id = id;
		this.settleCode = settleCode;
		this.settleName = settleName;
		this.sequenceNo = sequenceNo;
	}
	public SettleCategory(Integer id, String settleCode, String settleName, Integer sequenceNo, Integer delMark) {
		super();
		this.id = id;
		this.settleCode = settleCode;
		this.settleName = settleName;
		this.sequenceNo = sequenceNo;
		this.delMark = delMark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSettleCode() {
		return settleCode;
	}
	public void setSettleCode(String settleCode) {
		this.settleCode = settleCode;
	}
	public String getSettleName() {
		return settleName;
	}
	public void setSettleName(String settleName) {
		this.settleName = settleName;
	}
	public Integer getSequenceNo() {
		return sequenceNo;
	}
	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "SettleCategory [id=" + id + ", settleCode=" + settleCode + ", settleName=" + settleName
				+ ", sequenceNo=" + sequenceNo + ", delMark=" + delMark + "]";
	}
	
}
