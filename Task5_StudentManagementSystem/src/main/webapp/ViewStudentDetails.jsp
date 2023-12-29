<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.supre.test.*,java.util.*"
 %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>User Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            margin: 20px;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
        }

        th {
            background-color: #3498db;
            color: #fff;
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

        form {
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
            margin-right: 10px;
        }

        select, input[type="text"], input[type="submit"] {
            padding: 8px;
            margin-right: 10px;
        }

        input[type="submit"] {
            background-color: #2ecc71;
            color: #fff;
            cursor: pointer;
            border: none;
            display: inline-block;
        }

        input[type="submit"]:hover {
            background-color: #27ae60;
        }

        .action-links {
            white-space: nowrap; /* Prevent line break */
        }

        .action-links a {
            margin-right: 5px;
        }
    </style>
</head>
<body>
    <%
        AdminBean aB = (AdminBean)session.getAttribute("aBean");
        out.println("Page of User: " + aB.getfName() + "<br/><br/>");

        ArrayList<StudentBean> aL = (ArrayList<StudentBean>)session.getAttribute("aL");

        if(aL.size() == 0) {
            out.println("Student not Available....<br/>");
        } else {
    %>

    <table>
        <tr>
            <th>StudentId</th>
            <th>StuRollNo.</th>
            <th>StudentName</th>
            <th>Branch</th>
            <th>StudentMailId</th>
            <th>StuPhone No.</th>
            <th>City</th>
            <th>Pincode</th>
            <th>Action</th>
        </tr>

        <%
            Iterator<StudentBean> it = aL.iterator();

            while(it.hasNext()) {
                StudentBean sB = it.next();
        %>
        <tr>
            <td><%= sB.getStuId() %></td>
            <td><%= sB.getStuRno() %></td>
            <td><%= sB.getStuName() %></td>
            <td><%= sB.getStuBranch() %></td>
            <td><%= sB.getStuMid() %></td>
            <td><%= sB.getStuPhno() %></td>
            <td><%= sB.getStuCity() %></td>
            <td><%= sB.getStuPno() %></td>
            <td class="action-links">
                <a href="marks?sId=<%= sB.getStuId() %>">Marks</a>
                <a href="edit?sId=<%= sB.getStuId() %>">EditStudentDetails</a>
                <a href="delete?sId=<%= sB.getStuId() %>">DeleteRecord</a>
            </td>
        </tr>

        <%
            }
        }
        %>
    </table>

    <form action="filter" method="post">
        <label for="Filter">Sort By:</label>
        <select id="Filter" name="Filter">
            <option>-select-</option>
            <option value="id">By StudentId</option>
            <option value="city">By City</option>
            <option value="branch">By Branch</option>
        </select>
        <input type="text" placeholder="Enter" name="value" required>
        <input type="submit" value="Filter">
    </form>

    <a href="NewStudent.html">Add New Student</a>
    <a href="alogout">Logout</a>
</body>
</html>
