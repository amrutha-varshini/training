package com.minicare.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.minicare.model.Users;
import com.minicare.dao.UsersDao;

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
		int id=(Integer)request.getAttribute("id");
		hs.setAttribute("member", mem);
		String fname=UsersDao.getFname(id);
		String lname=UsersDao.getLname(id);
		hs.setAttribute("id",id);
		hs.setAttribute("fname", fname);
		hs.setAttribute("lname", lname);
		if("sitter".equals(mem))
			return mapping.findForward("successSitter");
		else
			return mapping.findForward("successSeeker");
    }
}