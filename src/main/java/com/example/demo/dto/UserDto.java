package com.example.demo.dto;

public class UserDto {
	private String userId;
	private String userPw;
	private String userName;
	private String userGender;
	private String userEmail;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String toString() {
		return "UserDto [userId=" +userId + ",UserPw="+userPw+"UserName="+userName+"UserGender="+userGender+"UserEmail="+userEmail+"]";
	}

}
