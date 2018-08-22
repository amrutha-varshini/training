package com.minicare.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.minicare.form.CaptureLoginForm;

public class CaptureLoginAction extends Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,HttpServletResponse response)
            throws Exception {
    		HttpSession hs=request.getSession();
    		CaptureLoginForm form1=(CaptureLoginForm)form;
    		String mem=form1.getMember();
    		String uid=form1.getUserID();
    		String pwd=form1.getPwd();
    		hs.setAttribute("member", mem);
    		
    		hs.setAttribute("fname", "Abc");
    		hs.setAttribute("lname", "Def");
    	 if("sitter".equals(mem))
         	return mapping.findForward("successSitter");
         else if("seeker".equals(mem))
        	 return mapping.findForward("successSeeker");
        else
        	 return mapping.findForward("failure");
    }
}