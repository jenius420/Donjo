package ownerService.model.vo;

import java.sql.Date;

public class Incruit {
	
	private int wNum;
	private String wTitle;
	private int oNum;
	private Date workStartTerm;
	private Date workEndTerm;
	private String workDay;
	private String workStartTime;
	private String workEndTime;
	private int termNo;
	private String gender;
	private int age;
	private String edu;
	private Date enrollDate;
	private String status;
	private Date doneDate;
	private String salaryForm;
	private int salary;
	private int pNum;
	private String product;
	private String description;
	
	public Incruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Incruit(int wNum, String wTitle, int oNum, Date workStartTerm, Date workEndTerm, String workDay,
			String workStartTime, String workEndTime, int termNo, String gender, int age, String edu, Date enrollDate,
			String status, Date doneDate, String salaryForm, int salary, int pNum, String product, String description) {
		super();
		this.wNum = wNum;
		this.wTitle = wTitle;
		this.oNum = oNum;
		this.workStartTerm = workStartTerm;
		this.workEndTerm = workEndTerm;
		this.workDay = workDay;
		this.workStartTime = workStartTime;
		this.workEndTime = workEndTime;
		this.termNo = termNo;
		this.gender = gender;
		this.age = age;
		this.edu = edu;
		this.enrollDate = enrollDate;
		this.status = status;
		this.doneDate = doneDate;
		this.salaryForm = salaryForm;
		this.salary = salary;
		this.pNum = pNum;
		this.product = product;
		this.description = description;
	}

	public int getwNum() {
		return wNum;
	}

	public void setwNum(int wNum) {
		this.wNum = wNum;
	}

	public String getwTitle() {
		return wTitle;
	}

	public void setwTitle(String wTitle) {
		this.wTitle = wTitle;
	}

	public int getoNum() {
		return oNum;
	}

	public void setoNum(int oNum) {
		this.oNum = oNum;
	}

	public Date getWorkStartTerm() {
		return workStartTerm;
	}

	public void setWorkStartTerm(Date workStartTerm) {
		this.workStartTerm = workStartTerm;
	}

	public Date getWorkEndTerm() {
		return workEndTerm;
	}

	public void setWorkEndTerm(Date workEndTerm) {
		this.workEndTerm = workEndTerm;
	}

	public String getWorkDay() {
		return workDay;
	}

	public void setWorkDay(String workDay) {
		this.workDay = workDay;
	}

	public String getWorkStartTime() {
		return workStartTime;
	}

	public void setWorkStartTime(String workStartTime) {
		this.workStartTime = workStartTime;
	}

	public String getWorkEndTime() {
		return workEndTime;
	}

	public void setWorkEndTime(String workEndTime) {
		this.workEndTime = workEndTime;
	}

	public int getTermNo() {
		return termNo;
	}

	public void setTermNo(int termNo) {
		this.termNo = termNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}

	public String getSalaryForm() {
		return salaryForm;
	}

	public void setSalaryForm(String salaryForm) {
		this.salaryForm = salaryForm;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
