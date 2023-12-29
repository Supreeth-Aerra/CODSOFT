package com.supre.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class AddStudentDetailsServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
				//Accessing the Existing Session
		if(hs == null)
		{
			req.setAttribute("msg", "Session Expired....");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			StudentBean sB = new StudentBean();
			sB.setStuId(req.getParameter("sid"));
			sB.setStuRno(Long.parseLong(req.getParameter("srno")));
			sB.setStuName(req.getParameter("sname"));
			sB.setStuBranch(req.getParameter("sbranch"));
			sB.setStuMid(req.getParameter("smid"));
			sB.setStuPhno(Long.parseLong(req.getParameter("sphno")));
			sB.setStuCity(req.getParameter("scity"));
			sB.setStuPno(Integer.parseInt(req.getParameter("spno")));
			int k = new AddStudentDetailsDAO().insert(sB);
			if(k > 0)
			{
				req.getRequestDispatcher("AddStudent.jsp").forward(req, res);
			}
		}//end of else	
	}
}
