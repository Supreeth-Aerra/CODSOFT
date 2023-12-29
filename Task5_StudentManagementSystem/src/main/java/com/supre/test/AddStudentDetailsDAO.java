package com.supre.test;

import java.sql.*;

public class AddStudentDetailsDAO 
{
	public int k = 0;
	public int insert(StudentBean sB)
	{
		try
		{
			Connection con = DBConnection.getCon();
			CallableStatement insert = con.prepareCall("{ call INSERTSTUPROFILE(?,?,?,?,?,?,?,?) }");
			insert.setString(1,sB.getStuId());
			insert.setLong(2, sB.getStuRno());
			insert.setString(3, sB.getStuName());
			insert.setString(4, sB.getStuBranch());
			insert.setString(5, sB.getStuMid());
			insert.setLong(6, sB.getStuPhno());
			insert.setString(7, sB.getStuCity());
			insert.setInt(8, sB.getStuPno());
			k = insert.executeUpdate();
		}
		catch(Exception e) {e.printStackTrace();}
		return k;
	}
}
