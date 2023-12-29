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
    <title>Admin Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            margin: 20px;
        }

        p {
            font-size: 18px;
            color: #333;
            margin-bottom: 20px;
        }

        a {
            text-decoration: none;
            padding: 10px 15px;
            border-radius: 5px;
            margin: 0 10px;
            color: #fff;
        }

        #add-student {
            background-color: #3498db;
        }

        #view-details {
            background-color: #3498db;
        }

        #logout {
            background-color: #3498db;
        }

        a:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>
    <p>
        <%
            AdminBean aB = (AdminBean)session.getAttribute("aBean");
            out.println("Page of User: " + aB.getfName() + "<br/>");
            out.println("Student Details Added Successfully.....<br/>");
        %>
    </p>

    <a id="add-student" href="NewStudent.html">Add New Student</a>
    <a id="view-details" href="view">View All Student Details</a>
    <a id="logout" href="alogout">Logout</a>
</body>
</html>
