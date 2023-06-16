<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.addantemployee {
	display: flex;
	justify-content: center;
}

.fromEployee {
	margin-top: 50px;
}

.fromEployee h3 {
	font-size: 40px;
}

.fromEployee .form {
	margin: 20px 0;
}

.form div {
	margin-top: 10px;
}

.form button {
	margin-top: 10px;
	padding: 7px 14px;
	background-color: blue;
	color: white;
	border-radius: 5px;
	border: none;
	font-weight: 600;
}

.form input[type="text"] {
	margin: 5px 0;
	width: 500px;
	padding: 5px 10px;
	border: 1px solid gray;
	border-radius: 7px;
}

#department {
	margin: 5px 0;
	width: 500px;
	padding: 5px 10px;
	border: 1px solid gray;
	border-radius: 7px;
}
</style>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<div class="addantemployee">

		<div class="fromEployee">
			<h3>List Employees</h3>
			<div class="form">
				<form action="/JWEB_ML201/update" method="post">
					<div>
						<label for="">Name :</label><br> <input type="text"
							name="name" placeholder="Enter Name" value="${lis.employee_id }">
					</div>
					<div>
						<label for="">Gender : <input name="gender" type="radio" value="${lis.gerder}">
							Male <input type="radio" name="gender" id="" value="${lis.gender }"> Femade
						</label>
					</div>
					<div>
						<label for="">Date Of Birth :</label><br> <input type="text"
							name="date_of_birth" placeholder="dd/mm/yyyy" value="${lis.date_of_birth }">
					</div>
					<div>
						<label for="">Department :</label><br> 
						<select
							id="department" name="department_id">
							<c:forEach items="${listDep}" var="x">
							<option value="${x.department_id}">${x.department_name}</option>
							</c:forEach>
							


						</select>
					</div>

					<button type="submit">Add Employee</button>

				</form>



			</div>

		</div>



	</div>

</body>
</html>