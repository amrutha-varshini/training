package com.minicare.util;
import org.apache.struts.action.RequestProcessor;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.minicare.dao.UsersDao;
import org.apache.struts.action.ActionMapping;

public class MyRequestProcessor extends RequestProcessor
{
	protected boolean processPreprocess (
           HttpServletRequest request,
             HttpServletResponse response) {

    HttpSession session = request.getSession(false);
    if( request.getServletPath().equals("/Visitor/Login.do")
            || request.getServletPath().equals("/Visitor/Register.do")
		|| request.getServletPath().equals("/Visitor/CaptureLogin.do")
		|| request.getServletPath().equals("/Visitor/CaptureRegister.do")
		|| request.getServletPath().equals("/index.jsp")		)
            return true;
        if( session != null &&
        session.getAttribute("id") != null)
            return true;
        else
            return false;
	}
	protected boolean processRoles(HttpServletRequest request,
                                    HttpServletResponse response,
                                    ActionMapping mapping)
         throws IOException, ServletException {
			 HttpSession session = request.getSession(false);
			 String roles[] = mapping.getRoleNames();
         if ((roles == null) || (roles.length < 1)) {
             return (true);
         }
		 Integer id=(Integer)session.getAttribute("id");
		 for (int i = 0; i < roles.length; i++) {
             if (UsersDao.getRole(id).equals(roles[i])) {
                 return (true);
             }
         }                                                    
         return (false);
	}
}