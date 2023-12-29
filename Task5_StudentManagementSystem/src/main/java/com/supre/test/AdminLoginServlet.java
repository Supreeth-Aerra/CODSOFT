package com.supre.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/alog")
public class AdminLoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		AdminBean aB = new AdminLoginDAO().login(req);
		if(aB==null)
		{
			req.setAttribute("msg", "Invalid Login Process....<br/>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			HttpSession hs = req.getSession();
					//Creating Session
			hs.setAttribute("aBean", aB);
					//Adding AdminBean to Session
			req.getRequestDispatcher("AdminLogin.jsp").forward(req, res);
		}
	}
	

}
