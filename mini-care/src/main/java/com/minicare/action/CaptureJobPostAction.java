package com.minicare.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.minicare.dao.SeekerJobDao;
import com.minicare.form.CaptureJobPostForm;

public class CaptureJobPostAction extends Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,HttpServletResponse response)
            throws Exception {
		HttpSession hs=request.getSession();
    	CaptureJobPostForm form1=(CaptureJobPostForm)form;
		String title=form1.getTitle();
		String desc=form1.getDesc();
		int id=(Integer)hs.getAttribute("id");
		SeekerJobDao.add(id,title,desc);
            return mapping.findForward("successSeeker");
        }
}