package com.minicare.action;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionMessage;

import com.minicare.form.CaptureRegisterForm;

public class CaptureRegisterAction extends Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,HttpServletResponse response)
            throws Exception {
    	ActionMessages actionMessages=new ActionMessages();
    	CaptureRegisterForm form1=(CaptureRegisterForm)form;
		String mem=form1.getMember();
		String fname=form1.getFname();
		String lname=form1.getLname();
		String userID=form1.getUserID();
		String pwd=form1.getPwd();
		String phno=form1.getPhno();
		String zip=form1.getZip();
		if("admin".equals(fname))
			throw new Exception();
		actionMessages.add("msg", new ActionMessage("msg"));
            if("sitter".equals(mem))
            	return mapping.findForward("successSitter");
            else if("seeker".equals(mem))
           	 return mapping.findForward("successSeeker");
            else
           	 return mapping.findForward("failure");
        }
}