package com.hex.action;

import com.hex.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class StudentActionClass  extends ActionSupport{
	
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("run..");
		return super.execute();
	}

}
