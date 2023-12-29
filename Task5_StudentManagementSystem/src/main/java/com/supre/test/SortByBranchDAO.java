package com.supre.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class SortByBranchDAO 
{
	public ArrayList<StudentBean> aL = new ArrayList<>();
	public ArrayList<StudentBean> retrieveByBranch(HttpServletRequest req)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement retrieveByBranch = con.prepareStatement("Select * from stuprofile where stubranch = ?");
			retrieveByBranch.setString(1,req.getParameter("value"));
			ResultSet rs = retrieveByBranch.executeQuery();
			while(rs.next())
			{
				StudentBean sB = new StudentBean();
				sB.setStuId(rs.getString(1));
				sB.setStuRno(rs.getLong(2));
				sB.setStuName(rs.getString(3));
				sB.setStuBranch(rs.getString(4));
				sB.setStuMid(rs.getString(5));
				sB.setStuPhno(rs.getLong(6));
				sB.setStuCity(rs.getString(7));
				sB.setStuPno(rs.getInt(8));
				aL.add(sB);
			}	
		}//end of try
		catch(Exception e) {e.printStackTrace();}
		return aL;
	}


}
