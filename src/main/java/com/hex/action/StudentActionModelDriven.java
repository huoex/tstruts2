package com.hex.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentActionModelDriven  extends ActionSupport implements ModelDriven<Student>{
	
	private Student student = new Student();

	@Override
	public String execute() throws Exception {
		System.out.println("run..");
		return super.execute();
	}

	public Student getModel() {
		return student;
	}

}
