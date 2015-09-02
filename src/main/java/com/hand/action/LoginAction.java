package com.hand.action;

import javax.security.auth.login.FailedLoginException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hand.POJO.Users;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
	
		if(username.equals("admin")&&password.equals("123")){
			Users us = new Users();
			us.setUsername(username);
			us.setPassword(password);
			ServletRequest request = ServletActionContext.getRequest();
			HttpServletRequest req = (HttpServletRequest) request;
			HttpSession session = req.getSession();
			session.setAttribute("us", us);
			return SUCCESS;
		}else{
			return "fail";
		}
		//ServletContext 也就是application对象。
		//这是一个服务器对象，信息会存储在服务器中，只要服务器不关闭，那个这些信息会永远存在。
		//一般数据我们是严禁向application对象中放入的。容易导致内存溢出，程序崩溃
	}
}
