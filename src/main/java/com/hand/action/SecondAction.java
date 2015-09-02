package com.hand.action;

import java.sql.Struct;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class SecondAction extends ActionSupport implements RequestAware{

	private ServletRequest request;
	private ServletResponse response;
	private ServletContext con;
	
	@Override
	public String execute() throws Exception {
		String username = request.getParameter("username");
		System.out.println("第二个action"+username);
		return SUCCESS;
	}
	
	public void setRequest(Map<String, Object> arg0) {
		request = (ServletRequest) arg0.get(StrutsStatics.HTTP_REQUEST);
		response = (ServletResponse) arg0.get(StrutsStatics.HTTP_RESPONSE);
		con = (ServletContext) arg0.get(StrutsStatics.SERVLET_CONTEXT);
	}

}
