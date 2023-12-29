package com.supre.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/alogout")
public class AlogoutServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs == null)
		{
			req.setAttribute("msg", "Sesssion Expired....<br/>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			hs.removeAttribute("aBean");
			hs.removeAttribute("aL");
			hs.invalidate();
			req.setAttribute("msg","LoggedOut Successfully.....<br/>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
	}
	

}
