package com.supre.test;

import java.sql.*;
import javax.servlet.http.*;

public class AdminLoginDAO {
	public AdminBean aB = null;
	public AdminBean login(HttpServletRequest req)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement retrieve = con.prepareStatement("Select * from admin56 where uname =? and pword =?");
			retrieve.setString(1, req.getParameter("uname"));
			retrieve.setString(2, req.getParameter("pword"));
			ResultSet rs = retrieve.executeQuery();
			if(rs.next())
			{
				aB = new AdminBean();
				aB.setuName(rs.getString(1));
				aB.setpWord(rs.getString(2));
				aB.setfName(rs.getString(3));
				aB.setlName(rs.getString(4));
				aB.setAddr(rs.getString(5));
				aB.setMId(rs.getString(6));
				aB.setPhNo(rs.getLong(7));
			}
		}
		catch(Exception e) {e.printStackTrace();}
		return aB;
	}
}
