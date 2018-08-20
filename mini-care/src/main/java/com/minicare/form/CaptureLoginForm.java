package com.minicare.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
public class CaptureLoginForm extends ActionForm {
	private String member=null,userID=null,pwd=null;
	public String getUserID()
	{
		return userID;
	}
	public String getPwd()
	{
		return pwd;
	}
	public String getMember()
	{
		return member;
	}
	public void setMember(String member)
	{
		this.member=member;
	}
	public void setUserID(String userID)
	{
		this.userID=userID;
	}
	public void setPwd(String pwd)
	{
		this.pwd=pwd;
	}
	public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request){
		ActionErrors actionErrors=new ActionErrors();
		if(userID == null || userID.length()==0)  
			actionErrors.add("userID", new ActionMessage("actionErrors.userID.required"));
		else if(!(userID.matches(".+@.+")))
			actionErrors.add("userID", new ActionMessage("actionErrors.userID.pattern"));
		if(pwd ==null|| pwd.length()==0)
			actionErrors.add("pwd", new ActionMessage("actionErrors.pwd.required"));
		return actionErrors;
	}
	public void reset(ActionMapping mapping,
            HttpServletRequest request)
	{
		member="";
		userID="";
		pwd="";
		super.reset(mapping,request);
	}
}