package com.zenglan.etutor.dao;

import com.zenglan.etutor.entity.Student;
import com.zenglan.etutor.entity.Tutor;
import com.zenglan.etutor.entity.UserProfile;

//@MyBatisDao
public interface UserDao {
	
	public int insertUser(UserProfile user);
	
	public int activeUser(UserProfile user);
	
	public int insetStudent(Student student);
	
	public int insetTutor(Tutor tutor);
	
	public UserProfile login(UserProfile user);
	
	

}
