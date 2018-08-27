package com.minicare.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CaptureJobPostForm extends ActionForm {
	private String title=null,desc=null;
	public String getTitle()
	{
		return title;
	}
	public String getDesc()
	{
		return desc;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setDesc(String desc)
	{
		this.desc=desc;
	}
	public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request){
		ActionErrors actionErrors=new ActionErrors();
		if(title == null || title.length()==0) 
			actionErrors.add("title", new ActionMessage("actionErrors.title.required"));
		if(desc ==null ||desc.length()==0)
			actionErrors.add("desc", new ActionMessage("actionErrors.desc.required"));
		return actionErrors;
	}
	public void reset(ActionMapping mapping,
            HttpServletRequest request)
	{
		title="";
		desc="";
		super.reset(mapping,request);
	}
}
