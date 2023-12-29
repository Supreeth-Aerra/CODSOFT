package com.supre.test;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;

public class DeleteRecordDAO 
{
	public int k = 0;
	public int delete(HttpServletRequest req)
	{
		try
		{
			Connection con = DBConnection.getCon();
			CallableStatement delete = con.prepareCall("{ call DELETESTUPROFILE(?) }");
			delete.setString(1, req.getParameter("sId"));
			k = delete.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}

}
