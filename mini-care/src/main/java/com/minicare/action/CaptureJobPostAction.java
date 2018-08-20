package com.minicare.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.minicare.form.CaptureJobPostForm;

public class CaptureJobPostAction extends Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,HttpServletResponse response)
            throws Exception {
    	CaptureJobPostForm form1=(CaptureJobPostForm)form;
		String title=form1.getTitle();
		String desc=form1.getDesc();
            return mapping.findForward("success");
        }
}