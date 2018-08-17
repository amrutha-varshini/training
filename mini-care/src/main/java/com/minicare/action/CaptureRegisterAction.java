package com.minicare.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.minicare.form.CaptureRegisterForm;

public class CaptureRegisterAction extends Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,HttpServletResponse response)
            throws Exception {
    	CaptureRegisterForm form1=(CaptureRegisterForm)form;
		String mem=form1.getMember();
    		request.setAttribute("message","Registration Successful. Please Login");
            if("sitter".equals(mem))
            	return mapping.findForward("successSitter");
            else if("seeker".equals(mem))
           	 return mapping.findForward("successSeeker");
            else
           	 return mapping.findForward("failure");
        }
}