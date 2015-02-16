package com.hex.action;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction  extends ActionSupport{
	
	private String username;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public StudentAction() {
		System.out.println("StudentAction call");
	}
	@Override
	public String execute() throws Exception {
		return super.execute();
	}

}
