package com.minicare.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CaptureRegisterForm extends ActionForm {
	private String member=null,userID=null,pwd=null,fname=null,lname=null,phno=null,zip=null;
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
	public String getFname()
	{
		return fname;
	}
	public String getLname()
	{
		return lname;
	}
	public String getPhno()
	{
		return phno;
	}
	public String getZip()
	{
		return zip;
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
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public void setLname(String lname)
	{
		this.lname=lname;
	}
	public void setPhno(String phno)
	{
		this.phno=phno;
	}
	public void setZip(String zip)
	{
		this.zip=zip;
	}
	public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request){
		ActionErrors actionErrors=new ActionErrors();
		if(userID == null || userID.length()==0)  
			actionErrors.add("userID", new ActionMessage("actionErrors.userID.required"));
		else if(!(userID.matches(".+@.+")))
			actionErrors.add("userID", new ActionMessage("actionErrors.userID.pattern"));
		if(pwd ==null || pwd.length()==0) 
			actionErrors.add("pwd", new ActionMessage("actionErrors.pwd.required"));
		else if(pwd.length()!=6)
			actionErrors.add("pwd", new ActionMessage("actionErrors.pwd.pattern"));
		if(fname == null || fname.length()==0) 
			actionErrors.add("fname", new ActionMessage("actionErrors.fname.required"));
		if(lname ==null || lname.length()==0)
			actionErrors.add("lname", new ActionMessage("actionErrors.lname.required"));
		if(phno == null || phno.length()==0) 
			actionErrors.add("phno", new ActionMessage("actionErrors.phno.required"));
		else if(!(phno.matches("[(][0-9]{3}[)][0-9]{3}-[0-9]{4}")))
			actionErrors.add("phno", new ActionMessage("actionErrors.phno.pattern"));
		if(zip ==null || zip.length()==0) 
			actionErrors.add("zip", new ActionMessage("actionErrors.zip.required"));
		else if(!(zip.matches("[0-9]{5}")))
			actionErrors.add("zip", new ActionMessage("actionErrors.zip.pattern"));
		return actionErrors;
	}
	public void reset(ActionMapping mapping,
            HttpServletRequest request)
	{
		member="";
		userID="";
		pwd="";
		fname="";
		lname="";
		phno="";
		zip="";
		super.reset(mapping,request);
	}
}
