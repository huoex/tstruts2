package com.hex.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.CookiesAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class GetAwareAction extends ActionSupport implements SessionAware,
		ApplicationAware, RequestAware, ServletRequestAware,
		ServletResponseAware, CookiesAware {

	@Override
	public String execute() throws Exception {
		ServletActionContext.getResponse();
		return SUCCESS;
	}
	public void setCookiesMap(Map<String, String> cookies) {

	}

	public void setServletResponse(HttpServletResponse response) {

	}

	public void setServletRequest(HttpServletRequest request) {

	}

	public void setRequest(Map<String, Object> request) {

	}

	public void setApplication(Map<String, Object> application) {

	}

	public void setSession(Map<String, Object> session) {

	}

}
