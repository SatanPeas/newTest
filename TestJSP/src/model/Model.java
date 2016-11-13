package model;

public class Model {

	private String userName;
	private String userPwd;
	private String userBirthday;
	private String userEmail;
	private Integer userClass;

	public Model() {
		
	}

	public Model(String userName, String userPwd, String userBirthday, String userEmail, Integer userClass) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.userBirthday = userBirthday;
		this.userEmail = userEmail;
		this.userClass = userClass;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getUserClass() {
		return userClass;
	}

	public void setUserClass(Integer userClass) {
		this.userClass = userClass;
	}
}
