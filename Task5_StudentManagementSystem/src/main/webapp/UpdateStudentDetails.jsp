<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.supre.test.*,java.util.*"
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
        margin: 0;
        padding: 0;
    }

    form {
        max-width: 400px;
        margin: 50px auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    label {
        display: block;
        margin-bottom: 8px;
        color: #333;
    }

    input {
        width: 100%;
        padding: 10px;
        margin-bottom: 16px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #3498db;
        color: #fff;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #2980b9;
    }
</style>
</head>
<body>
<%
AdminBean aBean = (AdminBean)session.getAttribute("aBean");
out.println("Page belongs to : "+aBean.getfName()+"<br/>");
ArrayList<StudentBean> aL = (ArrayList<StudentBean>)session.getAttribute("aL");
String sId = request.getParameter("sId");
Iterator<StudentBean> it = aL.iterator();
while(it.hasNext())
{
    StudentBean sB = it.next();
    if(sId.equals(sB.getStuId()))
    {
%>
    <form action="update" method="post">
        <input type="hidden" name="sid" value=<%=sB.getStuId() %>>
        <label>Student FullName :</label>
        <input type="text" id="sname" name="sname" value=<%=sB.getStuName() %> required autofocus><br/>
        <label>Branch :</label>
        <input type="text" id="sbranch" name="sbranch" value=<%=sB.getStuBranch() %> required><br/>
        <label>Student MailId :</label>
        <input type="email" id="smid" name="smid" value=<%=sB.getStuMid() %> required><br/>
        <label>Student PhoneNo. :</label>
        <input type="text" id="sphno" name="sphno" value=<%=sB.getStuPhno() %> required><br/>
        <label>City :</label>
        <input type="text" id="scity" name="scity" value=<%=sB.getStuCity() %> required><br/>
        <label>Pincode:</label>
        <input type="text" id="spno" name="spno" value=<%=sB.getStuPno() %> required><br/>
        <input type="submit" value="UpdateStudentDetails">
    </form>
<%
    }
}
%>
</body>
</html>
