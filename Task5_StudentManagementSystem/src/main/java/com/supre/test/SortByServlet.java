package com.supre.test;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/filter")
public class SortByServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs == null)
		{
			req.setAttribute("msg","Session Expired....");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			if(req.getParameter("Filter").equalsIgnoreCase("id"))
			{
				ArrayList<StudentBean> aLId = new SortByIdDAO().retrieveById(req);
				req.setAttribute("aLId", aLId);
				req.getRequestDispatcher("SortById.jsp").forward(req, res);
			}
			else if(req.getParameter("Filter").equalsIgnoreCase("city"))
			{
				ArrayList<StudentBean> aLCity = new SortByCityDAO().retrieveByCity(req);
				req.setAttribute("aLCity", aLCity);
				req.getRequestDispatcher("SortByCity.jsp").forward(req, res);
			}
			else if(req.getParameter("Filter").equalsIgnoreCase("branch"))
			{
				ArrayList<StudentBean> aLBranch = new SortByBranchDAO().retrieveByBranch(req);
				req.setAttribute("aLBranch", aLBranch);
				req.getRequestDispatcher("SortByBranch.jsp").forward(req, res);
			}
			
		}
	}

}
