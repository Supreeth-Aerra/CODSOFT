<%@ page 
		language="java" 
		contentType="text/html; charset=ISO-8859-1"
    	pageEncoding="ISO-8859-1"
    	import="com.supre.test.*"
    	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    a {
        display: inline-block;
        margin-top: 10px;
        margin-right: 10px;
        padding: 10px;
        text-decoration: none;
        color: #fff;
        background-color: #3498db;
        border-radius: 5px;
    }

    a:hover {
        background-color: #2980b9;
    }

    p {
        text-align: center;
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        margin-bottom: 20px;
    }
</style>
</head>
<body>
<%
AdminBean aB = (AdminBean)session.getAttribute("aBean");
out.println("<p>Page belongs to: " + aB.getfName() + "</p>");
String sId = request.getParameter("sId");
out.println("<p>Record of '" + sId + "' Deleted Successfully.......</p><br/>");
%>
<a href="view">ViewAllStudentDetails</a>
<a href="alogout">Logout</a>
</body>
</html>
