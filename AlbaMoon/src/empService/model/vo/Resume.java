package empService.model.vo;

import java.sql.Date;

public class Resume {
	
	private int rnum;
	private String resumeTitle;
	private int empNum;
	private String district;
	private String type;
	private String comment;
	private String picture;
	private Date updateDate;
	private String invalid;
	private String desireForm;
	private int desireIncome;
	private String openSet;
	private String edu;
	
	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resume(int rnum, String resumeTitle, int empNum, String district, String type, String comment,
			String picture, Date updateDate, String invalid, String desireForm, int desireIncome, String openSet,
			String edu) {
		super();
		this.rnum = rnum;
		this.resumeTitle = resumeTitle;
		this.empNum = empNum;
		this.district = district;
		this.type = type;
		this.comment = comment;
		this.picture = picture;
		this.updateDate = updateDate;
		this.invalid = invalid;
		this.desireForm = desireForm;
		this.desireIncome = desireIncome;
		this.openSet = openSet;
		this.edu = edu;
	}
	
	

	

	public Resume(String resumeTitle, int empNum, String district, String type, String comment, String picture,
			String desireForm, int desireIncome, String openSet, String edu) {
		super();
		this.resumeTitle = resumeTitle;
		this.empNum = empNum;
		this.district = district;
		this.type = type;
		this.comment = comment;
		this.picture = picture;
		this.desireForm = desireForm;
		this.desireIncome = desireIncome;
		this.openSet = openSet;
		this.edu = edu;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	public String getResumeTitle() {
		return resumeTitle;
	}

	public void setResumeTitle(String resumeTitle) {
		this.resumeTitle = resumeTitle;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getInvalid() {
		return invalid;
	}

	public void setInvalid(String invalid) {
		this.invalid = invalid;
	}

	public String getDesireForm() {
		return desireForm;
	}

	public void setDesireForm(String desireForm) {
		this.desireForm = desireForm;
	}

	public int getDesireIncome() {
		return desireIncome;
	}

	public void setDesireIncome(int desireIncome) {
		this.desireIncome = desireIncome;
	}

	public String getOpenSet() {
		return openSet;
	}

	public void setOpenSet(String openSet) {
		this.openSet = openSet;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}
	
	
	
	

}
