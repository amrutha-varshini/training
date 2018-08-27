package com.minicare.action;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.minicare.form.CaptureRegisterForm;

import com.minicare.dao.UsersDao;

public class CaptureRegisterAction extends Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,HttpServletResponse response)
            throws Exception {
    	ActionMessages actionMessages=new ActionMessages();
    	CaptureRegisterForm form1=(CaptureRegisterForm)form;
		String mem=form1.getMember();
		if("sitter".equals(mem) | "seeker".equals(mem))
		{
			String userID=form1.getUserID();
			String fname=form1.getFname();
			if("admin".equals(fname))
				throw new Exception();
			String lname=form1.getLname();
			String pwd=form1.getPwd();
			String phno=form1.getPhno();
			String zip=form1.getZip();
			String al1=form1.getAl1();
			String al2=form1.getAl2();
			String city=form1.getCity();
			String states=form1.getStates();
			UsersDao.add(mem,lname,fname,userID,pwd,phno,zip,al1,al2,city,states);
			if("sitter".equals(mem))
				return mapping.findForward("successSitter");
			else
				return mapping.findForward("successSeeker");
		}
        return mapping.findForward("failure");
	}
}