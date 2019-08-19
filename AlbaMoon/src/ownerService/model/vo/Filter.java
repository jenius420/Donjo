package ownerService.model.vo;

public class Filter {
	
	private int rNum;
	private String district;
	private String type;
	private String desireForm;
	private int desireIncome;
	private String invalidYn;
	private String finalEdu;
	private String gender;
	
	public Filter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Filter(int rNum, String district, String type, String desireForm, int desireIncome, String invalidYn,
			String finalEdu, String gender) {
		super();
		this.rNum = rNum;
		this.district = district;
		this.type = type;
		this.desireForm = desireForm;
		this.desireIncome = desireIncome;
		this.invalidYn = invalidYn;
		this.finalEdu = finalEdu;
		this.gender = gender;
	}

	public int getrNum() {
		return rNum;
	}

	public void setrNum(int rNum) {
		this.rNum = rNum;
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

	public String getInvalidYn() {
		return invalidYn;
	}

	public void setInvalidYn(String invalidYn) {
		this.invalidYn = invalidYn;
	}

	public String getFinalEdu() {
		return finalEdu;
	}

	public void setFinalEdu(String finalEdu) {
		this.finalEdu = finalEdu;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
