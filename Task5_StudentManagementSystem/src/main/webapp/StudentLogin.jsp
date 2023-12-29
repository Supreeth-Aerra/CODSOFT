<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.supre.test.StudentProfileBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }

        nav {
            width: 200px;
            background-color: #eee;
            padding: 20px;
            float: left;
        }

        main {
            margin-left: 220px;
            padding: 20px;
        }

        nav a {
            display: block;
            padding: 15px;
            margin-bottom: 10px;
            color: #333;
            text-decoration: none;
            transition: background-color 0.3s ease-in-out, color 0.3s ease-in-out;
        }

        nav a:hover {
            background-color: #ff0000;
            color: #fff;
        }

        section {
            display: none;
            margin-bottom: 20px;
        }

        #profileSection {
            display: block;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table, th, td {
            border: 1px solid #ddd;
        }

        th, td {
            padding: 15px;
            text-align: left;
        }

        th {
            background-color: #333;
            color: #fff;
        }

        footer {
            background-color: #333;
            color: #fff;
            padding: 20px;
            clear: both;
            text-align: center;
        }
    </style>
<title>Insert title here</title>
</head>
<body>
<%
StudentProfileBean spBean = (StudentProfileBean)session.getAttribute("spBean");
double averageMarks = (spBean.getcJava() + spBean.getaJava() + spBean.getWebTech() + spBean.getJavaLab() + spBean.getApti()) / 5;
String grade;

if (averageMarks >= 90) {
    grade = "A+";
} else if (averageMarks >= 80) {
    grade = "A";
} else if (averageMarks >= 70) {
    grade = "B";
} else if (averageMarks >= 60) {
    grade = "C";
} else {
    grade = "D";
}
%>
	<header>
        <h3>Student Web Portal </h3>
    </header>
    
    
	<nav>
        <a href="#" onclick="showProfile() " class="hover-color-change">Profile</a><hr>
        <a href="#" onclick="showMarks()" class="hover-color-change">Marks</a><hr>
        <a href="slogout" class="hover-color-change">Logout</a><hr>
    </nav>
    
    
    <main>
    	<section id="profileSection">
    		<table>
				<tr>
					<td>ID </td>
					<td>:<%=spBean.getStuId()%></td>
				</tr>
				<tr>
					<td>RollNo. </td>
					<td>:<%=spBean.getStuRno()%></td>
				</tr>
				<tr>
					<td>Full Name </td>
					<td>:<%=spBean.getStuName()%></td>
				</tr>
				<tr>
					<td>Branch </td>
					<td>:<%=spBean.getStuBranch()%></td>
				</tr>
				<tr>
					<td>Mail ID </td>
					<td>:<%=spBean.getStuMid()%></td>
				</tr>
				<tr>
					<td>Phone No. </td>
					<td>:<%=spBean.getStuPhno()%></td>
				</tr>
				<tr>
					<td>City </td>
					<td>:<%=spBean.getStuCity()%></td>
				</tr>
				<tr>
					<td>PinCode </td>
					<td>:<%=spBean.getStuPno()%></td>
				</tr>
			</table>
    	</section>
    	<section id="marksSection">
    		<table>
    			<tr>
    				<th>Subject</th>
    				<th>Marks</th>
    			</tr>
    			<tr>
    				<td>Core Java</td>
    				<td><%=spBean.getcJava() %></td>
    			</tr>
    			<tr>
    				<td>Adv Java</td>
    				<td><%=spBean.getaJava() %></td>
    			</tr>
    			<tr>
    				<td>Web Technologies</td>
    				<td><%=spBean.getWebTech() %></td>
    			</tr>
    			<tr>
    				<td>Java Lab</td>
    				<td><%=spBean.getJavaLab() %></td>
    			</tr>
    			<tr>
    				<td>Aptitude</td>
    				<td><%=spBean.getApti() %></td>
    			</tr>
    			<tr>
    				<td>Total Marks</td>
    				<td><%=spBean.getTotmarks() %></td>
    			</tr>
    		</table>
    		<p>Average Marks: <%= averageMarks %></p>
        	<p>Grade: <%= grade %></p>
    	</section>
    </main>
    
    
    <!-- <footer>
        <p>Footer</p>
    </footer> -->
	<script>
        function showProfile() {
            document.getElementById("profileSection").style.display = "block";
            document.getElementById("marksSection").style.display = "none";
        }

        function showMarks() {
            document.getElementById("profileSection").style.display = "none";
            document.getElementById("marksSection").style.display = "block";
        }
    </script>

</body>
</html>