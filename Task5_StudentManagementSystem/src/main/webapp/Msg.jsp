<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
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
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        p {
            color: #3498db;
            margin-top: 10px;
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

        h2 {
            color: #333;
        }

        .home-content {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        .link-container {
            display: flex;
            margin-top: 10px;
        }

        .link-container a {
            margin: 0 10px;
        }

        .link-container a:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="home-content">
        <h2>Student Management System</h2>

        <div class="link-container">
            <a href="AdminLogin.html">Admin Login</a>
            <a href="StudentLogin.html">Student Login</a>
        </div>

        <%
            String msg = (String)request.getAttribute("msg");
            if (msg != null && !msg.isEmpty()) {
        %>
        <p><%= msg %></p>
        <%
            }
        %>
    </div>
</body>
</html>
