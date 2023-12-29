package com.supre.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditStudentDetailsServlet extends HttpServlet 
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
			req.getRequestDispatcher("UpdateStudentDetails.jsp").forward(req, res);
		}
	}

}
