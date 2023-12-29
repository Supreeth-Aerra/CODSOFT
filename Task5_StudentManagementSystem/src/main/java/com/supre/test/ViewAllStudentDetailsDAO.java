package com.supre.test;

import java.sql.*;
import java.util.ArrayList;

public class ViewAllStudentDetailsDAO 
{
	public ArrayList<StudentBean> aL = new ArrayList<>();
	public ArrayList<StudentBean> retrieveAll()
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement retrieveAll = con.prepareStatement("Select * from stuprofile");
			ResultSet rs = retrieveAll.executeQuery();
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
