package com.zenglan.etutor.entity;
/*
 * 用户实体类
 */
public class UserProfile {
	private int userId;			//用户id
	private String userName;	//账号
	private String passwaord;	//密码
	private String role;		//角色
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserNmae() {
		return userName;
	}
	public void setUserNmae(String userNmae) {
		this.userName = userNmae;
	}
	public String getPasswaord() {
		return passwaord;
	}
	public void setPasswaord(String passwaord) {
		this.passwaord = passwaord;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
 
	
}
