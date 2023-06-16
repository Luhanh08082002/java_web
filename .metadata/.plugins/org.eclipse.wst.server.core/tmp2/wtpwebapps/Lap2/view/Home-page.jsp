
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"
	import="vku.udn.vn.common.EmployeeDao" import="vku.udn.vn.model.Employee" import="vku.udn.vn.model.Department"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.gstatic.com">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Roboto', sans-serif;
}

.container {
	background-color: black;
	height: 45px;
	display: flex;
	justify-content: space-between;
}

.left-menu a {
	line-height: 45px;
	text-decoration: none;
	color: gray;
	padding: 0px 30px;
}

.right-menu {
	display: flex;
}

.right-menu a {
	line-height: 45px;
	text-decoration: none;
	color: gray;
	padding: 0px 30px;
}

.listemployee {
	display: flex;
	justify-content: center;
}

.tableEployee {
	margin-top: 50px;
}

.tableEployee h3 {
	font-size: 40px;
}

.tableEployee table {
	margin: 20px 0;
}

table, th, td {
	border: 1px solid gray;
	padding: 5px 10px;
	text-align: center;
}

table {
	border-collapse: collapse;
	
}
</style>
</head>

<body>

	<div class="container">
		<div class="left-menu">
			<a href="" class="active">home pages</a> <a href="">Add an
				employee</a> <a href="">List employees</a>

		</div>
		<div class="right-menu">
			<div>
				<!-- <img src="" alt="" width="50px" height="50px"> -->
				<a href="">Khách Hàng</a>
			</div>
			<c:if >
			</c:if>
		
			<div>
				<!-- <img src="" alt="" width="50px" height="50px"> -->
				<a href="">Logout</a>
			</div>

		</div>
	</div>
	<div class="listemployee">

		<div class="tableEployee">
			<h3>List Employees</h3>
			<%
			EmployeeDao dao = new EmployeeDao();
			ArrayList<Employee> list = dao.getAllEmployee();
			ArrayList<Department> ds = dao.getAllDepartment();
			%>
			<table border="1">
				<tr>
					<th>ID</th>
					<th>Employee Name</th>
					<th>Gender</th>
					<th>Date of Birth</th>
					<th>Department Id</th>
				</tr>
				<%
				for (Employee o : list) {
				%>

				<tr>
				<td>
						<%
						out.print(o.getEmployee_id());
						%>
					</td>
					<td>
						<%
						out.print(o.getEmployee_name());
						%>
					</td>
					<td>
						<%
						out.print(o.getGender());
						%>
					</td>
					<td>
						<%
						out.print(o.getDate_of_birth());
						%>
					</td>
					<%
				for (Department e : ds) {
					if(e.getDepartment_id() == o.getDepartment_id()){
				%>
					<td>
						<%
						out.print(e.getDepartment_name());
						%>
					</td>
					<%} }%>
					
				</tr>
				<%
				}
				%>

			</table>
		</div>


	</div>




</body>

</html>