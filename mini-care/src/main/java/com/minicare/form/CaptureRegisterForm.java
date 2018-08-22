package com.minicare.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CaptureRegisterForm extends ActionForm {
	private String member=null,userID=null,pwd=null,fname=null,lname=null,al1=null,al2=null,city=null,states=null,phno=null,zip=null;
	public String getUserID()
	{
		return userID;
	}
	public String getPwd()
	{
		return pwd;
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
	public String getAl1()
	{
		return al1;
	}
	public String getAl2()
	{
		return al2;
	}
	public String getCity()
	{
		return city;
	}
	public String getStates()
	{
		return states;
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
	public void setAl1(String al1)
	{
		this.al1=al1;
	}
	public void setAl2(String al2)
	{
		this.al2=al2;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setStates(String states)
	{
		this.states=states;
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
		else if(!(fname.matches("[a-zA-Z]+")))
			actionErrors.add("fname", new ActionMessage("actionErrors.fname.pattern"));
		if(lname ==null || lname.length()==0)
			actionErrors.add("lname", new ActionMessage("actionErrors.lname.required"));
		else if(!(lname.matches("[a-zA-Z]+")))
			actionErrors.add("lname", new ActionMessage("actionErrors.lname.pattern"));
		if(phno == null || phno.length()==0) 
			actionErrors.add("phno", new ActionMessage("actionErrors.phno.required"));
		else if(!(phno.matches("[(][0-9]{3}[)][0-9]{3}-[0-9]{4}")))
			actionErrors.add("phno", new ActionMessage("actionErrors.phno.pattern"));
		if(zip ==null || zip.length()==0) 
			actionErrors.add("zip", new ActionMessage("actionErrors.zip.required"));
		else if(!(zip.matches("[0-9]{5}")))
			actionErrors.add("zip", new ActionMessage("actionErrors.zip.pattern"));
		if(al1 == null || al1.length()==0) 
			actionErrors.add("al1", new ActionMessage("actionErrors.al1.required"));
		else if(!(al1.matches("[a-zA-Z]+")))
			actionErrors.add("al1", new ActionMessage("actionErrors.al1.pattern"));
		if(al2 == null || al2.length()==0) 
			actionErrors.add("al2", new ActionMessage("actionErrors.al2.required"));
		else if(!(al2.matches("[a-zA-Z]+")))
			actionErrors.add("al2", new ActionMessage("actionErrors.al2.pattern"));
		if(city == null || city.length()==0) 
			actionErrors.add("city", new ActionMessage("actionErrors.city.required"));
		else if(!(city.matches("[a-zA-Z]+")))
			actionErrors.add("city", new ActionMessage("actionErrors.city.pattern"));
		if(states == null || states.length()==0) 
			actionErrors.add("states", new ActionMessage("actionErrors.states.required"));
		else if(!(states.matches("[a-zA-Z]+")))
			actionErrors.add("states", new ActionMessage("actionErrors.states.pattern"));
		return actionErrors;
	}
	public void reset(ActionMapping mapping,
            HttpServletRequest request)
	{
		userID="";
		pwd="";
		fname="";
		lname="";
		phno="";
		zip="";
		al1="";
		al2="";
		city="";
		states="";
		super.reset(mapping,request);
	}
}
