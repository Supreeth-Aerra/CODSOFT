package com.supre.test;

import java.sql.*;

public class UpdateStudentDetailsDAO 
{
	public int k=0;
	public int update(StudentBean sb)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement update = con.prepareStatement("UPDATE STUPROFILE "
															+ "SET STUFULLNAME = ? , STUBRANCH = ?, STUMID = ?, STUPHNO = ?, STUCITY = ?, STUPINCODE = ? "
															+ "WHERE STUID = ?");
			update.setString(1,sb.getStuName());
			update.setString(2, sb.getStuBranch());
			update.setString(3, sb.getStuMid());
			update.setLong(4, sb.getStuPhno());
			update.setString(5, sb.getStuCity());
			update.setInt(6, sb.getStuPno());
			update.setString(7, sb.getStuId());
			k =update.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}
}
