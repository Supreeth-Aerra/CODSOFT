package com.supre.test;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllStudentDetailsServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs == null)
		{
			req.setAttribute("msg","Session Expired....");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			ArrayList<StudentBean> aL = new ViewAllStudentDetailsDAO().retrieveAll();
			hs.setAttribute("aL", aL);
			req.getRequestDispatcher("ViewStudentDetails.jsp").forward(req, res);
		}
	}
}
