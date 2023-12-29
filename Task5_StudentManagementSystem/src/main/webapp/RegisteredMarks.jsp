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
            text-align: center;
            margin: 20px;
        }

        p {
            color: #3498db;
        }

        a {
            text-decoration: none;
            padding: 10px 15px;
            margin: 0 10px;
            border-radius: 5px;
            color: #fff;
            background-color: #3498db;
            display: inline-block;
            margin-top: 10px;
        }

        a:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>
    <%
        AdminBean aBean = (AdminBean)session.getAttribute("aBean");
        out.println("Page belongs to : " + aBean.getfName() + "<br/>");
        String sId = (String)request.getAttribute("sId");
    %>

    <p>Student ID '<%= sId %>' Marks Registered or Updated Successfully......</p>

    <a href="view">View All Student Details</a>
    <a href="alogout">Logout</a>
</body>
</html>
