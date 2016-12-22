package com.zenglan.etutor.entity;
/*
 * 实体学生类
 */
public class Student {
	
	private int studentId;		 //学生id
	private String studentName;	 //学生姓名
	private String studentNumber;//学生编号
	private int tutorId;	 	 //导师id
	private String studentInfo;  //个人情况简介
	private UserProfile user;	 //关联用户
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public String getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(String studentInfo) {
		this.studentInfo = studentInfo;
	}
	public UserProfile getUser() {
		return user;
	}
	public void setUser(UserProfile user) {
		this.user = user;
	}
	
	
}
