package com.minicare.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CaptureMyProfileForm extends ActionForm {
	private String ptitle=null,pdesc=null;
	public String getPtitle()
	{
		return ptitle;
	}
	public String getPdesc()
	{
		return pdesc;
	}
	public void setPtitle(String ptitle)
	{
		this.ptitle=ptitle;
	}
	public void setPdesc(String pdesc)
	{
		this.pdesc=pdesc;
	}
	public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request){
		ActionErrors actionErrors=new ActionErrors();
		if(ptitle == null || ptitle.length()==0) 
			actionErrors.add("ptitle", new ActionMessage("actionErrors.ptitle.required"));
		if(pdesc ==null ||pdesc.length()==0)
			actionErrors.add("pdesc", new ActionMessage("actionErrors.pdesc.required"));
		return actionErrors;
	}
	public void reset(ActionMapping mapping,
            HttpServletRequest request)
	{
		ptitle="";
		pdesc="";
		super.reset(mapping,request);
	}
}
