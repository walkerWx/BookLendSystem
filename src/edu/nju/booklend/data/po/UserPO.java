package edu.nju.booklend.data.po;

public abstract class UserPO {
	
	
	/*
	 * 所有用户均继承此基类
	 */

	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
