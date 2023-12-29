<%@ page 
		language="java" 
		contentType="text/html; charset=ISO-8859-1"
    	pageEncoding="ISO-8859-1"
    	import="com.supre.test.AdminBean"
 %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        #admin-welcome {
            font-size: 18px;
            margin-bottom: 20px;
        }

        nav {
            display: flex;
            justify-content: center;
        }

        nav a {
            margin: 0 15px;
            text-decoration: none;
            padding: 10px 15px;
            border-radius: 5px;
            background-color: #3498db;
            color: #fff;
        }

        nav a:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div id="admin-welcome">
        <% AdminBean aB = (AdminBean)session.getAttribute("aBean"); %>
        Welcome User: <%= aB.getfName() %>
    </div>

    <nav>
        <a href="NewStudent.html">Add New Student</a>
        <a href="view">View All Student Details</a>
        <a href="alogout">Logout</a>
    </nav>
</body>
</html>
