package com.hex.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class StudentListAction  extends ActionSupport{
	
	private List<Student> studentList;

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String execute() throws Exception {
		List<Student> list = new ArrayList<Student>();
		Student student = new Student();
		student.setUsername("aaa");
		student.setPassword("a11");
		list.add(student);
		
		student = new Student();
		student.setUsername("bbb");
		student.setPassword("b11");
		list.add(student);
		
		student = new Student();
		student.setUsername("ccc");
		student.setPassword("c11");
		list.add(student);
		
		studentList = list;
		
		ServletActionContext.getRequest().setAttribute("studentList", "studentList");
		ServletActionContext.getRequest().setAttribute("abc", "123");
		return super.execute();
	}

}
