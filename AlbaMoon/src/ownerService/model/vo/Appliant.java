package ownerService.model.vo;

import java.sql.Date;

public class Appliant {
	
	private int applyNum;
	private int eNum;
	private String eName;
	private int wNum;
	private String wTitle;
	private Date applyDate;
	private String passOrFail;
	
	public Appliant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appliant(int applyNum, int eNum, String eName, int wNum, String wTitle, Date applyDate, String passOrFail) {
		super();
		this.applyNum = applyNum;
		this.eNum = eNum;
		this.eName = eName;
		this.wNum = wNum;
		this.wTitle = wTitle;
		this.applyDate = applyDate;
		this.passOrFail = passOrFail;
	}

	public int getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(int applyNum) {
		this.applyNum = applyNum;
	}

	public int geteNum() {
		return eNum;
	}

	public void seteNum(int eNum) {
		this.eNum = eNum;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
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

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getPassOrFail() {
		return passOrFail;
	}

	public void setPassOrFail(String passOrFail) {
		this.passOrFail = passOrFail;
	}
	
	

}
