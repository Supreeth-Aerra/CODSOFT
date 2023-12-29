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

        h3 {
            color: #3498db;
        }

        form {
            width: 50%;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: inline-block;
            width: 150px;
            text-align: left;
            margin-bottom: 10px;
            font-weight: bold;
            color: #333;
        }

        input[type="text"] {
            padding: 8px;
            width: 80%;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: #2ecc71;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #27ae60;
        }
    </style>
</head>
<body>
    <%
        AdminBean aBean = (AdminBean)session.getAttribute("aBean");
        out.println("Page belongs to " + aBean.getfName() + "<br/>");
        StuMarksBean smb = (StuMarksBean)request.getAttribute("smb");
    %>

    <h3>Enter the Student ID <%out.print("'"+smb.getStuId()+"'");%> Marks Below :</h3><br/>

    <form action="regmarks" method="post">
        <input type="hidden" name="sid" value=<%=smb.getStuId() %> >
        <label for="cjava">Core Java:</label>
        <input type="text" id="cjava" name="cjava" value=<%=smb.getcJava() %> required autofocus><br/>

        <label for="ajava">Advance Java:</label>
        <input type="text" id="ajava" name="ajava" value=<%=smb.getaJava() %> required><br/>

        <label for="web">Web Technologies:</label>
        <input type="text" id="web" name="web" value=<%=smb.getWebTech() %> required><br/>

        <label for="lab">Java Lab:</label>
        <input type="text" id="lab" name="lab" value=<%=smb.getJavaLab() %> required><br/>

        <label for="apti">Aptitude:</label>
        <input type="text" id="apti" name="apti" value=<%=smb.getApti() %> required><br/>

        <input type="submit" value="Register Marks">
    </form>
</body>
</html>
