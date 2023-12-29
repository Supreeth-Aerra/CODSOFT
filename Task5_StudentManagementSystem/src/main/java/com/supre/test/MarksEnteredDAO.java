package com.supre.test;

import java.sql.*;

public class MarksEnteredDAO 
{
	public int k= 0;
	public int updateMarks(StuMarksBean smB)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement update =con.prepareStatement("update stumarks "
															+ "set corejava = ?,advjava = ?, webtechnologies = ?,javalab = ?,aptitude = ?"
															+ "where stuid = ?");
			update.setInt(1, smB.getcJava());
			update.setInt(2, smB.getaJava());
			update.setInt(3, smB.getWebTech());
			update.setInt(4, smB.getJavaLab());
			update.setInt(5, smB.getApti());
			update.setString(6, smB.getStuId());
			k = update.executeUpdate();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}	
}
