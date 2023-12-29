package com.supre.test;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateStudentDetailsServlet extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs == null)
		{
			req.setAttribute("msg", "Session Expired.....<br/>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			ArrayList<StudentBean> aL = (ArrayList<StudentBean>)hs.getAttribute("aL");
			String sId = req.getParameter("sid");
			Iterator<StudentBean> it = aL.iterator();
			StudentBean sb = null;
			while(it.hasNext())
			{
				sb = it.next();
				if(sb.getStuId().equals(sId))
				{
					sb.setStuName(req.getParameter("sname"));
					sb.setStuBranch(req.getParameter("sbranch"));
					sb.setStuMid(req.getParameter("smid"));
					sb.setStuPhno(Long.parseLong(req.getParameter("sphno")));
					sb.setStuCity(req.getParameter("scity"));
					sb.setStuPno(Integer.parseInt(req.getParameter("spno")));
					break;
				}
			}//end of loop
			int k = new UpdateStudentDetailsDAO().update(sb);
			if(k > 0)
			{
				req.getRequestDispatcher("Update.jsp").forward(req, res);
			}	
		}//end of else
	}
}
