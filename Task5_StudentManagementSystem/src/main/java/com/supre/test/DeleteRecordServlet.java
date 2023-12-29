package com.supre.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteRecordServlet extends HttpServlet 
{

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs == null)
		{
			req.setAttribute("msg", "Session Expired......<br/>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			int k = new DeleteRecordDAO().delete(req);
			if(k > 0)
			{
				req.getRequestDispatcher("DeleteRecord.jsp").forward(req, res);
			}
		}
	}
}
