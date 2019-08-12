package empService.model.vo;

import java.sql.Date;

public class EmpEvaluationBefore {
	
	private int applyNum;
	private String opName;
	private String wTitle;
	private Date workStartTerm;
	private Date workEndTerm;
	
	public EmpEvaluationBefore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpEvaluationBefore(int applyNum, String opName, String wTitle, Date workStartTerm, Date workEndTerm) {
		super();
		this.opName = opName;
		this.wTitle = wTitle;
		this.workStartTerm = workStartTerm;
		this.workEndTerm = workEndTerm;
	}

	
	public int getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(int applyNum) {
		this.applyNum = applyNum;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getwTitle() {
		return wTitle;
	}

	public void setwTitle(String wTitle) {
		this.wTitle = wTitle;
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
	
	

}
