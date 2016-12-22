package com.zenglan.etutor.entity;
/*
 * 导师实体类
 */
public class Tutor {
	
	private int tutorId;		//导师id
	private String tutorName;	//导师姓名
	private int tutorNumber;	//导师编号
	private int tutorTitle;		//导师职称
	private UserProfile user;	//关联用户
	private String tutorInfo; 	//个人情况简介
	
	
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public String getTutorName() {
		return tutorName;
	}
	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}
	public int getTutorNumber() {
		return tutorNumber;
	}
	public void setTutorNumber(int tutorNumber) {
		this.tutorNumber = tutorNumber;
	}
	public int getTutorTitle() {
		return tutorTitle;
	}
	public void setTutorTitle(int tutorTitle) {
		this.tutorTitle = tutorTitle;
	}
	public UserProfile getUser() {
		return user;
	}
	public void setUser(UserProfile user) {
		this.user = user;
	}
	public String getTutorInfo() {
		return tutorInfo;
	}
	public void setTutorInfo(String tutorInfo) {
		this.tutorInfo = tutorInfo;
	}
	
	
}
