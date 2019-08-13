package member.model.vo;

import java.sql.Date;

public class PersonMember implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2845427768252133333L;
	
	private int userNo;
	private String userID;
	private String userPwd;
	private String userName;
	private String socialNo;
	private Date birth;
	private String gender;
	private String email;
	private String phone;
	private String address;
	private Date enrollDate;
	private Date modifyDate;
	private String status;
	
	
	public PersonMember() {
		
	}

	// 회원 가입
	public PersonMember(String userID, String userPwd, String userName, String socialNo, String email, String phone,
			String address) {
		super();
		this.userID = userID;
		this.userPwd = userPwd;
		this.userName = userName;
		this.socialNo = socialNo;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	// 정보수정
	public PersonMember(String userPwd, String userName, String email, String phone, String address) {
		super();
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	// 비밀번호 변경
	public PersonMember(String userPwd) {
		super();
		this.userPwd = userPwd;
	}

	public PersonMember(int userNo, String userID, String userPwd, String userName, String socialNo, Date birth,
			String gender, String email, String phone, String address, Date enrollDate, Date modifyDate,
			String status) {
		super();
		this.userNo = userNo;
		this.userID = userID;
		this.userPwd = userPwd;
		this.userName = userName;
		this.socialNo = socialNo;
		this.birth = birth;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.status = status;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSocialNo() {
		return socialNo;
	}

	public void setSocialNo(String socialNo) {
		this.socialNo = socialNo;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PersonMember [userNo=" + userNo + ", userID=" + userID + ", userPwd=" + userPwd + ", userName="
				+ userName + ", socialNo=" + socialNo + ", birth=" + birth + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + ", enrollDate=" + enrollDate + ", modifyDate="
				+ modifyDate + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
