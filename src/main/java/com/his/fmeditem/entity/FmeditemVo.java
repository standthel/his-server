package com.his.fmeditem.entity;

public class FmeditemVo {
	private Integer id;
	private String itemCode;
	private String itemName;
	private String format;
	private double price;
	private Integer expClassID;
	private Integer deptID;
	private String mnemonicCode;
	private String creationDate;
	private String lastUpdateDate;
	private Integer recordType;
	private Integer delMark;
	private String deptName;
	private String expName;
	public FmeditemVo() {
		super();
	}
	public FmeditemVo(Integer id) {
		super();
		this.id = id;
	}
	public FmeditemVo(String itemName, Integer recordType) {
		super();
		this.itemName = itemName;
		this.recordType = recordType;
	}
	public FmeditemVo(Integer id, String itemCode, String itemName, String format, double price, Integer expClassID,
			Integer deptID, String mnemonicCode, String creationDate, String lastUpdateDate, Integer recordType,
			Integer delMark, String deptName, String expName) {
		super();
		this.id = id;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.format = format;
		this.price = price;
		this.expClassID = expClassID;
		this.deptID = deptID;
		this.mnemonicCode = mnemonicCode;
		this.creationDate = creationDate;
		this.lastUpdateDate = lastUpdateDate;
		this.recordType = recordType;
		this.delMark = delMark;
		this.deptName = deptName;
		this.expName = expName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getExpClassID() {
		return expClassID;
	}
	public void setExpClassID(Integer expClassID) {
		this.expClassID = expClassID;
	}
	public Integer getDeptID() {
		return deptID;
	}
	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}
	public String getMnemonicCode() {
		return mnemonicCode;
	}
	public void setMnemonicCode(String mnemonicCode) {
		this.mnemonicCode = mnemonicCode;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public Integer getRecordType() {
		return recordType;
	}
	public void setRecordType(Integer recordType) {
		this.recordType = recordType;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getExpName() {
		return expName;
	}
	public void setExpName(String expName) {
		this.expName = expName;
	}
	@Override
	public String toString() {
		return "FmeditemVo [id=" + id + ", itemCode=" + itemCode + ", itemName=" + itemName + ", format=" + format
				+ ", price=" + price + ", expClassID=" + expClassID + ", deptID=" + deptID + ", mnemonicCode="
				+ mnemonicCode + ", creationDate=" + creationDate + ", lastUpdateDate=" + lastUpdateDate
				+ ", recordType=" + recordType + ", delMark=" + delMark + ", deptName=" + deptName + ", expName="
				+ expName + "]";
	}
}
