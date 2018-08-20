package com.minicare.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.minicare.form.CaptureMyProfileForm;

public class CaptureMyProfileAction extends Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,HttpServletResponse response)
            throws Exception {
    	CaptureMyProfileForm form1=(CaptureMyProfileForm)form;
		String title=form1.getPtitle();
		String desc=form1.getPdesc();
            return mapping.findForward("success");
        }
}