
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<jsp:include page="Header.jsp"></jsp:include>
	<div class="listemployee">

		<div class="tableEployee">
			<h3>List Employees</h3>


			<table border="1">
				<tr>
					<th>ID</th>
					<th>Employee Name</th>
					<th>Gender</th>
					<th>Date of Birth</th>
					<th>Department Id</th>
					<th>Action</th>
				</tr>
				<c:forEach items="${listEmp }" var="o">
					<tr>
						<td>${o.employee_id }</td>
						<td>${o.employee_name }</td>
						<td><c:if test="${o.gender == 1 }">
								Male
							</c:if> <c:if test="${o.gender == 0 }">
								Female
							</c:if>
							</td>
						<td>${o.date_of_birth }</td>
						<c:forEach items="${listDep }" var="x">
							<c:if test="${o.department_id == x.department_id }">
								<td>${x.department_name }</td>
							</c:if>
						</c:forEach>
						<td>
						<a href="update?sid=${o.department_id}">Update </a> ||
						<a href="" onclick="showmess(${o.employee_id })">DeLete</a>
						</td>
						
					</tr>
				</c:forEach>
			</table>

		</div>


	</div>




</body>
<script type="text/javascript">
function showmess(id) {
	var option = confirm('Bạn chắc chắn muốn xoá người dùng này ??');
	if(option === true){
		windows.location.href='delete?sid='+id;
		
	}
	
}

</script>

</html>