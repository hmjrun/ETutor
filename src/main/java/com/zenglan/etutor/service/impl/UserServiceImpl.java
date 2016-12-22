package com.zenglan.etutor.service.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zenglan.etutor.dao.UserDao;
import com.zenglan.etutor.entity.Student;
import com.zenglan.etutor.entity.Tutor;
import com.zenglan.etutor.entity.UserProfile;
import com.zenglan.etutor.service.UserService;

//@Component @Service @Dao @Controller

@Service
public class UserServiceImpl implements UserService {
	
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired//注入dao
	private UserDao userDao;
	
	@Override
	public UserProfile registerStudent(UserProfile user, Student student) {
		if(userDao.insertUser(user) == 1){
			if(userDao.insetStudent(student) == 1){
				if(userDao.activeUser(user) == 1){
					return user;
				}
			}
		}
		return null;
	}

	@Override
	public UserProfile registerTutor(UserProfile user, Tutor tutor) {
		if(userDao.insertUser(user) == 1){
			if(userDao.insetTutor(tutor)== 1){
				if(userDao.activeUser(user) == 1){
					return user;
				}
			}
		}
		return null;
	}

	@Override
	public UserProfile login(UserProfile user) {
		UserProfile user_logined = userDao.login(user);
		if (user_logined.getUserId() != 0){
			return user_logined;
		}
		return null;
	}
	
}
