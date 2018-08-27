package com.minicare.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CaptureZipForm extends ActionForm {
	private String zip=null;
	public String getZip()
	{
		return zip;
	}
	public void setZip(String zip)
	{
		this.zip=zip;
	}
	public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request){
		ActionErrors actionErrors=new ActionErrors();
		if(zip ==null || zip.length()==0)  
			actionErrors.add("zip", new ActionMessage("actionErrors.zip.required"));
		else if(zip.length()!=5 || !(zip.matches("[0-9]{5}")))
			actionErrors.add("zip", new ActionMessage("actionErrors.zip.pattern"));
		return actionErrors;
	}
	public void reset(ActionMapping mapping,
            HttpServletRequest request)
	{
		zip="";
		super.reset(mapping,request);
	}
}
