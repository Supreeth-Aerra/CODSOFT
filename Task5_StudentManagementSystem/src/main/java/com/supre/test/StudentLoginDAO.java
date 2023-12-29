package com.supre.test;

import java.sql.*;
import javax.servlet.http.*;

public class StudentLoginDAO 
{
	public static StudentProfileBean spB = null;
	public static StudentProfileBean retrieveAll(HttpServletRequest req)
	{
		try
		{
			Connection con = DBConnection.getCon();
			CallableStatement retrieveAll = con.prepareCall(" {call RETRIEVESTUPROFILE(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			retrieveAll.setString(1, req.getParameter("sid"));
			retrieveAll.setLong(2, Long.parseLong(req.getParameter("srno")));
			retrieveAll.registerOutParameter(3, Types.VARCHAR);
			retrieveAll.registerOutParameter(4, Types.VARCHAR);
			retrieveAll.registerOutParameter(5, Types.VARCHAR);
			retrieveAll.registerOutParameter(6, Types.NUMERIC);
			retrieveAll.registerOutParameter(7, Types.VARCHAR);
			retrieveAll.registerOutParameter(8, Types.NUMERIC);
			retrieveAll.registerOutParameter(9, Types.NUMERIC);
			retrieveAll.registerOutParameter(10, Types.NUMERIC);
			retrieveAll.registerOutParameter(11, Types.NUMERIC);
			retrieveAll.registerOutParameter(12, Types.NUMERIC);
			retrieveAll.registerOutParameter(13, Types.NUMERIC);
			retrieveAll.registerOutParameter(14, Types.NUMERIC);
			
	
			retrieveAll.execute();
			
			
			spB = new StudentProfileBean();
			spB.setStuId(req.getParameter("sid"));
			spB.setStuRno(Long.parseLong(req.getParameter("srno")));
			spB.setStuName(retrieveAll.getString(3));
			spB.setStuBranch(retrieveAll.getString(4));
			spB.setStuMid(retrieveAll.getString(5));
			spB.setStuPhno(retrieveAll.getLong(6));
			spB.setStuCity(retrieveAll.getString(7));
			spB.setStuPno(retrieveAll.getInt(8));
			spB.setcJava(retrieveAll.getInt(9));
			spB.setaJava(retrieveAll.getInt(10));
			spB.setWebTech(retrieveAll.getInt(11));				
			spB.setJavaLab(retrieveAll.getInt(12));
			spB.setApti(retrieveAll.getInt(13));
			spB.setTotmarks(retrieveAll.getInt(14));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return spB;
	}
	

}
