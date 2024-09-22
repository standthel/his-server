package com.his.disease.entity;

public class Disease {
	private Integer id;
	private String diseaseCode;
	private String diseaseName;
	private String diseaseICD;
	private Integer diseCategoryID;
	private Integer delMark;
	public Disease() {
		super();
	}
	public Disease(Integer id, String diseaseCode, String diseaseName, String diseaseICD, Integer diseCategoryID) {
		super();
		this.id = id;
		this.diseaseCode = diseaseCode;
		this.diseaseName = diseaseName;
		this.diseaseICD = diseaseICD;
		this.diseCategoryID = diseCategoryID;
	}
	public Disease(String diseaseCode, String diseaseName, String diseaseICD, Integer diseCategoryID) {
		super();
		this.diseaseCode = diseaseCode;
		this.diseaseName = diseaseName;
		this.diseaseICD = diseaseICD;
		this.diseCategoryID = diseCategoryID;
	}
	public Disease(Integer id, String diseaseCode, String diseaseName, String diseaseICD, Integer diseCategoryID,
			Integer delMark) {
		super();
		this.id = id;
		this.diseaseCode = diseaseCode;
		this.diseaseName = diseaseName;
		this.diseaseICD = diseaseICD;
		this.diseCategoryID = diseCategoryID;
		this.delMark = delMark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDiseaseCode() {
		return diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getDiseaseICD() {
		return diseaseICD;
	}
	public void setDiseaseICD(String diseaseICD) {
		this.diseaseICD = diseaseICD;
	}
	public Integer getDiseCategoryID() {
		return diseCategoryID;
	}
	public void setDiseCategoryID(Integer diseCategoryID) {
		this.diseCategoryID = diseCategoryID;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "Disease [id=" + id + ", diseaseCode=" + diseaseCode + ", diseaseName=" + diseaseName + ", diseaseICD="
				+ diseaseICD + ", diseCategoryID=" + diseCategoryID + ", delMark=" + delMark + "]";
	}
}
