package com.minicare.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.minicare.dao.SitterDao;
import com.minicare.form.CaptureMyProfileForm;

public class CaptureMyProfileAction extends Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,HttpServletResponse response)
            throws Exception {
		HttpSession hs=request.getSession();
    	CaptureMyProfileForm form1=(CaptureMyProfileForm)form;
		String title=form1.getPtitle();
		String desc=form1.getPdesc();
		int id=(Integer)hs.getAttribute("id");
		SitterDao.add(id,title,desc);
            return mapping.findForward("successSitter");
        }
}