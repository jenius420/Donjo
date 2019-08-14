package empService.model.vo;

import java.sql.Date;

public class ApplicationState {
	
	private int applyNum;
	private int empNum;
	private int wNum;
	private String wTitle;
	private String opName;
	private Date applyDate;
	private String applicationState;
	
	public ApplicationState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplicationState(int applyNum, int empNum, int wNum, String wTitle, String opName, Date applyDate,
			String applicationState) {
		super();
		this.applyNum = applyNum;
		this.empNum = empNum;
		this.wNum = wNum;
		this.wTitle = wTitle;
		this.opName = opName;
		this.applyDate = applyDate;
		this.applicationState = applicationState;
	}

	public int getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(int applyNum) {
		this.applyNum = applyNum;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
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

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplicationState() {
		return applicationState;
	}

	public void setApplicationState(String applicationState) {
		this.applicationState = applicationState;
	}
	
	
	
	

}
