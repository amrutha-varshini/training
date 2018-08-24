package com.minicare.action;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.minicare.dao.SeekerJobDao;
public class CaptureApplyAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession hs=request.getSession();
		int sid=(Integer)hs.getAttribute("id");
		int jid=Integer.parseInt(request.getParameter("sjid")); 
		SeekerJobDao.apply(jid,sid);
			return mapping.findForward("successSitter");
}}