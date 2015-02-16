package com.hex.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Inject;

public class TagsAction extends ActionSupport {
	String select;
	String radio;
	String checkbox;
	
	@Inject(value="student")
	Student student;
	
	public String getCheckbox() {
		return checkbox;
	}


	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}


	public String getSelect() {
		return select;
	}


	public void setSelect(String select) {
		this.select = select;
	}


	public String getRadio() {
		return radio;
	}


	public void setRadio(String radio) {
		this.radio = radio;
	}


	@Override
	public String execute() throws Exception {
		System.out.println(toString());
		return super.execute();
	}


	@Override
	public String toString() {
		return "TagsAction [select=" + select + ", radio=" + radio
				+ ", checkbox=" + checkbox + "]";
	}
}
