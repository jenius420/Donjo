package empService.model.vo;

import java.sql.Date;

public class EmpEvaluation {
	
	private int eevalNum;
	private int onum;
	private String opname;
	private int empNum;
	private int eevalPoint;
	private String eevalComment;
	private String invalidEval;
	private Date enrollDate;
	
	public EmpEvaluation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpEvaluation(int eevalNum, int onum, String opname, int empNum, int eevalPoint, String eevalComment, String invalidEval,
			Date enrollDate) {
		super();
		this.eevalNum = eevalNum;
		this.onum = onum;
		this.opname = opname;
		this.empNum = empNum;
		this.eevalPoint = eevalPoint;
		this.eevalComment = eevalComment;
		this.invalidEval = invalidEval;
		this.enrollDate = enrollDate;
	}
	

	public EmpEvaluation(int eevalNum, String opname, int eevalPoint, String eevalComment, Date enrollDate) {
		super();
		this.eevalNum = eevalNum;
		this.opname = opname;
		this.eevalPoint = eevalPoint;
		this.eevalComment = eevalComment;
		this.enrollDate = enrollDate;
	}

	public String getOpname() {
		return opname;
	}

	public void setOpname(String opname) {
		this.opname = opname;
	}

	public int getEevalNum() {
		return eevalNum;
	}

	public void setEevalNum(int eevalNum) {
		this.eevalNum = eevalNum;
	}

	public int getOnum() {
		return onum;
	}

	public void setOnum(int onum) {
		this.onum = onum;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public int getEevalPoint() {
		return eevalPoint;
	}

	public void setEevalPoint(int eevalPoint) {
		this.eevalPoint = eevalPoint;
	}

	public String getEevalComment() {
		return eevalComment;
	}

	public void setEevalComment(String eevalComment) {
		this.eevalComment = eevalComment;
	}

	public String getInvalidEval() {
		return invalidEval;
	}

	public void setInvalidEval(String invalidEval) {
		this.invalidEval = invalidEval;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	
	

}
