package com.hex.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.hex.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class StudentListAction  extends ActionSupport{
	
	private List<Student> studentList;

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public StudentListAction() {
		System.out.println("StudentListAction call");
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
		
		Map<String, Object> map = ServletActionContext.getContext().getSession();
		map.put("stu", student);
		return super.execute();
	}

}
