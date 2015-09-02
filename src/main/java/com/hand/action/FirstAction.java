package com.hand.action;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.HttpHeaderResult;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
//实现org.apache.struts2.interceptor.ServletRequestAware的接口
public class FirstAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{

	private ServletRequest request;
	private ServletResponse response;
	private ServletContext context;
	@Override
	public String execute() throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		return SUCCESS;
	}

	public void setServletResponse(HttpServletResponse arg0) {
		response =  arg0;
		
	}

	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
		
	}

	public void setServletContext(ServletContext arg0) {
		context = arg0;
		
	}


}
