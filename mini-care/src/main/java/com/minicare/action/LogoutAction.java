package com.minicare.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.minicare.dao.UsersDao;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LogoutAction extends Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,HttpServletResponse response)
            throws Exception {
			HttpSession hs=request.getSession();
			if("true".equals(request.getParameter("invalidate")))
			{
				int id=(Integer)hs.getAttribute("id");
				UsersDao.invalidate(id);
			}
    		hs.invalidate();
         	return mapping.findForward("success");
    }
}