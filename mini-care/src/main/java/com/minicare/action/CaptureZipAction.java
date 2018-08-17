package com.minicare.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.minicare.form.CaptureZipForm;

public class CaptureZipAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		CaptureZipForm form1 = (CaptureZipForm) form;
		String mem = form1.getMember();
		if (getErrors(request) == null || getErrors(request).size() == 0) {

			if ("sitter".equals(mem))
				return mapping.findForward("successSitter");
			else if ("seeker".equals(mem))
				return mapping.findForward("successSeeker");
			else
				return mapping.findForward("failure");
		} else {
			if ("sitter".equals(mem))
				return mapping.findForward("failureSitter");
			else if ("seeker".equals(mem))
				return mapping.findForward("failureSeeker");
			else
				return mapping.findForward("failure");
		}
	}
}