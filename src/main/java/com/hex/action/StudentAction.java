package com.hex.action;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction  extends ActionSupport{
	
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("run..");
		return super.execute();
	}

}
