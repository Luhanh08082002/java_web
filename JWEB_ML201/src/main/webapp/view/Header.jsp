<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
div .username{
color: yellow;
}
</style>
</head>

<body>

	<div class="container">
		<div class="left-menu">
			<a href="/JWEB_ML201/home" class="active">home pages</a> <a
				href="/JWEB_ML201/AddEmployeeServlet">Add an employee</a> <a
				href="/JWEB_ML201/ListEmployeeServlet">List employees</a>

		</div>
		<div class="right-menu">

			<c:if test="${sessionScope.acc != null}">

				<div>
					<a class="username"> ${sessionScope.acc.username}</a>
				</div>
				<div>
					<a href="/JWEB_ML201/LogoutServlet">Logout</a>
				</div>
			</c:if>
			<c:if test="${sessionScope.acc == null }">
				<div>
					<!-- <img src="" alt="" width="50px" height="50px"> -->
					<a>Khách Hàng</a>
				</div>
				<div>
					<a href="/JWEB_ML201/login">Login</a>
				</div>
			</c:if>
		</div>
	</div>


</body>

</html>