package com.zenglan.etutor.service;

import java.util.List;

import com.zenglan.etutor.entity.Student;
import com.zenglan.etutor.entity.Tutor;
import com.zenglan.etutor.entity.UserProfile;


/*
 * 业务接口：站在使用者的角度来设计接口
 * 三个方面：方法定义粒度，参数，返回类型（return 类型、异常）
 */
public interface UserService {
	
	public UserProfile registerStudent(UserProfile user,Student student);
	
	public UserProfile registerTutor(UserProfile user,Tutor tutor);
	
	public UserProfile login(UserProfile user);
}
