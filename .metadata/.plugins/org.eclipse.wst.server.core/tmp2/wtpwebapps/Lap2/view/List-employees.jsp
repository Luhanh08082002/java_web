<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  import="java.util.ArrayList" import="vku.udn.vn.common.EmployeeDao" import="vku.udn.vn.model.Employee"
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	EmployeeDao dao = new EmployeeDao();
	ArrayList<Employee> list = dao.getAllEmployee();
	%>
	<table border="1">
	<% for(Employee o:list) 
	{%>
		<tr>
			<td><%out.print(o.getEmployee_name());%></td>
			<td><%out.print(o.getGender());%></td>
			<td><%out.print(o.getDate_of_birth());%></td>
		</tr>
		<%} %>
	</table>
</body>
</html>