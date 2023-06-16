
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
	

</body>

</html>