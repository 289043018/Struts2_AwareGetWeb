package com.hand.action;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FourthAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		ServletRequest request = ServletActionContext.getRequest();
		ServletResponse response = ServletActionContext.getResponse();
		ServletContext con = ServletActionContext.getServletContext();
		
		String username = request.getParameter("username");
		System.out.println("第四种"+username);
		return SUCCESS;
	}
}
