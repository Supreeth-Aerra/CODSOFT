package com.supre.test;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;

public class MarksRegisterDAO 
{
	public StuMarksBean smb = null;
	public StuMarksBean retrieve(HttpServletRequest req)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement retrieve = con.prepareStatement("Select * from Stumarks where stuid = ?");
			retrieve.setString(1, req.getParameter("sId"));
			ResultSet rs = retrieve.executeQuery();
			if(rs.next())
			{
				smb = new StuMarksBean();
				smb.setStuId(rs.getString(1));
				smb.setcJava(rs.getInt(2));
				smb.setaJava(rs.getInt(3));
				smb.setWebTech(rs.getInt(4));
				smb.setJavaLab(rs.getInt(5));
				smb.setApti(rs.getInt(6));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return smb;
	}

}
