package com.his.constantItem.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Drug {
	private Integer id;
	private String drugsCode;
	private String drugsName;
	private String drugsFormat;
	private String drugsUnit;
	private String manufacturer;
	private Integer drugsDosageID;
	private Integer drugsTypeID;
	private double drugsPrice;
	private String mnemonicCode;
	private String creationDate;
	private String lastUpdateDate;
	private Integer delMark;
	public Drug() {
		super();
	}
	public Drug(Integer id) {
		super();
		this.id = id;
	}
	public Drug(Integer id, String drugsCode, String drugsName, String drugsFormat, String drugsUnit,
			String manufacturer, Integer drugsDosageID, Integer drugsTypeID, double drugsPrice, String mnemonicCode,
			String creationDate, String lastUpdateDate) {
		super();
		this.id = id;
		this.drugsCode = drugsCode;
		this.drugsName = drugsName;
		this.drugsFormat = drugsFormat;
		this.drugsUnit = drugsUnit;
		this.manufacturer = manufacturer;
		this.drugsDosageID = drugsDosageID;
		this.drugsTypeID = drugsTypeID;
		this.drugsPrice = drugsPrice;
		this.mnemonicCode = mnemonicCode;
		this.creationDate = creationDate;
		this.lastUpdateDate = lastUpdateDate;
	}
	public Drug(String drugsCode, String drugsName, String drugsFormat, String drugsUnit, String manufacturer,
			Integer drugsDosageID, Integer drugsTypeID, double drugsPrice, String mnemonicCode, String creationDate,
			String lastUpdateDate) {
		super();
		this.drugsCode = drugsCode;
		this.drugsName = drugsName;
		this.drugsFormat = drugsFormat;
		this.drugsUnit = drugsUnit;
		this.manufacturer = manufacturer;
		this.drugsDosageID = drugsDosageID;
		this.drugsTypeID = drugsTypeID;
		this.drugsPrice = drugsPrice;
		this.mnemonicCode = mnemonicCode;
		this.creationDate = creationDate;
		this.lastUpdateDate = lastUpdateDate;
	}
	public Drug(Integer id, String drugsCode, String drugsName, String drugsFormat, String drugsUnit,
			String manufacturer, Integer drugsDosageID, Integer drugsTypeID, double drugsPrice, String mnemonicCode,
			String creationDate, String lastUpdateDate, Integer delMark) {
		super();
		this.id = id;
		this.drugsCode = drugsCode;
		this.drugsName = drugsName;
		this.drugsFormat = drugsFormat;
		this.drugsUnit = drugsUnit;
		this.manufacturer = manufacturer;
		this.drugsDosageID = drugsDosageID;
		this.drugsTypeID = drugsTypeID;
		this.drugsPrice = drugsPrice;
		this.mnemonicCode = mnemonicCode;
		this.creationDate = creationDate;
		this.lastUpdateDate = lastUpdateDate;
		this.delMark = delMark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDrugsCode() {
		return drugsCode;
	}
	public void setDrugsCode(String drugsCode) {
		this.drugsCode = drugsCode;
	}
	public String getDrugsName() {
		return drugsName;
	}
	public void setDrugsName(String drugsName) {
		this.drugsName = drugsName;
	}
	public String getDrugsFormat() {
		return drugsFormat;
	}
	public void setDrugsFormat(String drugsFormat) {
		this.drugsFormat = drugsFormat;
	}
	public String getDrugsUnit() {
		return drugsUnit;
	}
	public void setDrugsUnit(String drugsUnit) {
		this.drugsUnit = drugsUnit;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Integer getDrugsDosageID() {
		return drugsDosageID;
	}
	public void setDrugsDosageID(Integer drugsDosageID) {
		this.drugsDosageID = drugsDosageID;
	}
	public Integer getDrugsTypeID() {
		return drugsTypeID;
	}
	public void setDrugsTypeID(Integer drugsTypeID) {
		this.drugsTypeID = drugsTypeID;
	}
	public double getDrugsPrice() {
		return drugsPrice;
	}
	public void setDrugsPrice(double drugsPrice) {
		this.drugsPrice = drugsPrice;
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
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "Drug [id=" + id + ", drugsCode=" + drugsCode + ", drugsName=" + drugsName + ", drugsFormat="
				+ drugsFormat + ", drugsUnit=" + drugsUnit + ", manufacturer=" + manufacturer + ", drugsDosageID="
				+ drugsDosageID + ", drugsTypeID=" + drugsTypeID + ", drugsPrice=" + drugsPrice + ", mnemonicCode="
				+ mnemonicCode + ", creationDate=" + creationDate + ", lastUpdateDate=" + lastUpdateDate + ", delMark="
				+ delMark + "]";
	}
}
