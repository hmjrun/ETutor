package com.zenglan.etutor.web;

import javax.servlet.http.HttpSession;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zenglan.etutor.entity.UserProfile;
import com.zenglan.etutor.service.UserService;
  
/** 
 * 登录认证的控制器 
 */  
@Controller  
@RequestMapping("/user")
public class UserController {  
	@Autowired
	private UserService userService;
    /** 
     * 登录 
     * @param session 
     *          HttpSession 
     * @param username 
     *          用户名 
     * @param password 
     *          密码 
     * @return 
     */  
    @RequestMapping(value="/login")  
    public String login(HttpSession session, 
    					@RequestParam(value="user_name" ,required=false) String user_name,
    					@RequestParam(value="password" ,required=false) String password) throws Exception{        
    	if (user_name==null || password==null){
    		return "login";
    	}
    	//构造user对象
    	UserProfile user = new UserProfile();
    	user.setPasswaord(password);
    	user.setUserNmae(user_name);
    	user = userService.login(user);
    	if (user != null){
    		//在Session里保存信息  
    		session.setAttribute("user_name", user.getUserNmae());
    		session.setAttribute("password", user.getPasswaord());
    		if (user.getRole().equals("student")){
    			return "student/StuIndex";
    		}
    		else if (user.getRole().equals("tutor")){
    			return "tutor/TutorIndex";
    		}
    		else if (user.getRole().equals("admin")){
    			return "admin/AdminIndex";
    		}
    		else{
    			return "login";
    		}
    	}else{
    		return "login";
    	} 
    }  
      
    /** 
     * 退出系统 
     * @param session 
     *          Session 
     * @return 
     * @throws Exception 
     */  
    @RequestMapping(value="/logout")  
    public String logout(HttpSession session) throws Exception{  
        //清除Session  
        session.invalidate();  
          
        return "login";  
    }  
    
    @RequestMapping(value="/register")  
    public String register() throws Exception{  
        return "register";  
    }  
    
    @RequestMapping(value="/registeruser")  
    public String registeruser() throws Exception{  
    	
        return "register";  
    }  
      
      
      
}  
