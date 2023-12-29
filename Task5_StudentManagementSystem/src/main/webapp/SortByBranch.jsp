<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.supre.test.*,java.util.*"%>
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
        align-items: center;
        margin: 0;
    }

    table {
        width: 82%;
        border-collapse: collapse;
        margin-top: 20px;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 10px;
        text-align: left;
    }

    th {
        background-color: #3498db;
        color: #fff;
    }

    a {
        display: inline-block;
        margin-top: 10px;
        padding: 10px;
        text-decoration: none;
        color: #fff;
        background-color: #3498db;
        border-radius: 5px;
    }

    a:hover {
        background-color: #2980b9;
    }

    .action-column a {
        display: inline-block;
        margin-right: 5px;
    }

    .action-column a:last-child {
        margin-right: 0;
    }
</style>
</head>
<body>
<%
AdminBean aB = (AdminBean)session.getAttribute("aBean");
out.println("<p>Page of User: " + aB.getfName() + "</p><br/>");
ArrayList<StudentBean> aLBranch = (ArrayList<StudentBean>)request.getAttribute("aLBranch");
if (aLBranch.size() == 0) {
    out.println("<p>Student not Available....</p><br/>");
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
            <th class="action-column">Action</th>
        </tr>
        <%
        Iterator<StudentBean> it = aLBranch.iterator();
        while (it.hasNext()) {
            StudentBean sB = it.next();
            %>
            <tr>
                <td><%=sB.getStuId()%></td>
                <td><%=sB.getStuRno()%></td>
                <td><%=sB.getStuName()%></td>
                <td><%=sB.getStuBranch()%></td>
                <td><%=sB.getStuMid()%></td>
                <td><%=sB.getStuPhno()%></td>
                <td><%=sB.getStuCity()%></td>
                <td><%=sB.getStuPno()%></td>
                <td class="action-column">
                    <a href="marks?sId=<%=sB.getStuId()%>">Marks</a>
                    <a href="edit?sId=<%=sB.getStuId()%>">EditStudentDetails</a>
                    <a href="delete?sId=<%=sB.getStuId()%>">DeleteRecord</a>
                </td>
            </tr>
            <%
        }
        %>
    </table>
    <%
}
%>
<div>
    <a href="NewStudent.html">Add New Student</a>
    <a href="alogout">Logout</a>
</div>
</body>
</html>
