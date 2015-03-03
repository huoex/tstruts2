package com.hex.action;
import com.hex.model.MyJavaBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
 
@SuppressWarnings("serial")
public class WelcomeAction extends ActionSupport implements ModelDriven<MyJavaBean>{
 
    public String execute(){
        return SUCCESS;
    }
     
    private MyJavaBean bean = new MyJavaBean();
     
    public MyJavaBean getModel() {
        return bean;
    }
 
}