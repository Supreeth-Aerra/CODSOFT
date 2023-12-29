package com.supre.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/regmarks")
public class MarksEnteredServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs == null)
		{
			req.setAttribute("msg", "Sesssion Expired....<br/>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			StuMarksBean smB = new StuMarksBean();
			smB.setStuId(req.getParameter("sid"));
			smB.setcJava(Integer.parseInt(req.getParameter("cjava")));
			smB.setaJava(Integer.parseInt(req.getParameter("ajava")));
			smB.setWebTech(Integer.parseInt(req.getParameter("web")));
			smB.setJavaLab(Integer.parseInt(req.getParameter("lab")));
			smB.setApti(Integer.parseInt(req.getParameter("apti")));
			int k = new MarksEnteredDAO().updateMarks(smB);
			if(k>0)
			{
				req.setAttribute("sId", req.getParameter("sid"));
				req.getRequestDispatcher("RegisteredMarks.jsp").forward(req, res);
			}
		}
	}
}
