package com.zenglan.etutor.dao.Test;

import org.junit.Test;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zenglan.etutor.dao.UserDao;
import com.zenglan.etutor.entity.Student;
import com.zenglan.etutor.entity.UserProfile;

import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

import static org.junit.Assert.*;
/**
 * 配置Spring和Junit整合,junit启动时加载springIOC容器
 * spring-test,junit
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class DaoTest {


    //注入Dao实现类依赖
	@Resource
    private UserDao userDao;
   
	@Test
	public void testuserDao() throws Exception{
		
		UserProfile user = new  UserProfile();
		user.setUserNmae("2222ab");
		user.setPasswaord("12334567");
		user.setRole("tes12t");
		
		userDao.insertUser(user);
		System.out.println(user.getUserId());
		
		Student student = new Student();
		student.setUser(user);
		student.setStudentInfo("i am student..");
		student.setStudentName("黄大大");
		student.setStudentNumber("2016666666");
		
		userDao.insetStudent(student);
		System.out.println(student.getStudentId());
		userDao.activeUser(student.getUser());
		
	}
	
	@Test
	public void testlogin() throws Exception{
		UserProfile user = new  UserProfile();
		user.setUserNmae("2222ab");
		user.setPasswaord("12334567");
		user = userDao.login(user);
		System.out.println(user.getUserId());
	}

}
