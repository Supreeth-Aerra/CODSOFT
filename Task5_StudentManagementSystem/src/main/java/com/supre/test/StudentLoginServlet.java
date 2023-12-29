package com.supre.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/slog")
public class StudentLoginServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		StudentProfileBean spB = StudentLoginDAO.retrieveAll(req);
		if(spB == null)
		{
			req.setAttribute("msg", "Invalid Login Process.......... <br/>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			HttpSession hs = req.getSession();
			
			hs.setAttribute("spBean", spB);
			
			req.getRequestDispatcher("StudentLogin.jsp").forward(req, res);
		}
	}
}
