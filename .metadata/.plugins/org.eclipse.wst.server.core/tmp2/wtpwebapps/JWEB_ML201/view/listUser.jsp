
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
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Roboto', sans-serif;
}

.containerfulls {
	max-width: 100vw;
	display: flex;
}

.sibar_container {
	width: 20vw;
	background-color: blue;
	height: 100vh;
}

.right_container {
	width: 80vw;
	height: 100%;
}

.logo_t {
	height: 50px;
	border-bottom: 1px solid white;
	text-align: center;
	line-height: 50px;
	color: azure;
	font-weight: 600;
}

.sibar_item {
	padding: 20px 20px;
}

.sibar_item li {
	list-style: none;
	padding: 13px 20px;
	border-radius: 6px;
}

.sibar_item li:hover {
	background-color: rgba(0, 0, 0, 0.3);
}

.sibar_item li span {
	border: 1px solid white;
	width: 30px;
	height: 30px;
	text-align: center;
	line-height: 30px;
	border-radius: 50%;
	font-size: 20px;
	margin-right: 10px;
	color: white;
}

.sibar_item li a {
	font-size: 15px;
	font-weight: bold;
	color: azure;
	text-decoration: none;
}

/* right */
.top_menu_item {
	box-shadow: rgba(0, 0, 0, 0.02) 0px 1px 3px 0px, rgba(27, 31, 35, 0.15)
		0px 0px 0px 1px;
	height: 50px;
	background-color: aliceblue;
	display: flex;
	align-items: center;
	justify-content: space-between;
}

.title {
	margin-left: 20px;
	font-weight: 500;
	font-size: 20px;
	color: gray;
}

/*  */
.menu_itemRight {
	display: flex;
	padding-right: 30px;
}

.menu_itemRight li {
	list-style: none;
	border: 2px solid blue;
	border-radius: 7px;
	padding: 4px 12px;
	margin-left: 10px;
}

.menu_itemRight li a {
	text-decoration: none;
}

.right_container_bt {
	height: calc(100vh - 50px);
	background-color: #d7d7d7;
	padding: 20px 20px;
}

.title_dm {
	color: gray;
	font-weight: 500;
	padding: 10px 10px;
	margin-bottom: 10px;
	background-color: white;
	box-shadow: rgba(0, 0, 0, 0.02) 0px 1px 3px 0px, rgba(27, 31, 35, 0.15)
		0px 0px 0px 1px;
}

.item_data {
	margin-top: 30px;
}

.item_data h6 {
	margin-bottom: 10px;
}

.item_data_text {
	width: 100%;
	margin-right: 30px;
	padding: 7px 15px;
	box-sizing: border-box;
}

input[type=date] {
	width: 15vw;
	padding: 7px 15px;
	margin-right: 30px;
}

.address_text {
	width: 74vw;
	padding: 7px 15px;
	box-sizing: border-box;
}

.select {
	width: 14vw;
	margin-right: 30px;
	padding: 7px 15px;
	box-sizing: border-box;
}

.level {
	width: 22vw;
	margin-right: 60px;
	padding: 7px 15px;
	box-sizing: border-box;
}

.achievements_text {
	width: 74vw;
	padding: 7px 15px;
	box-sizing: border-box;
}

.submit_button {
	margin-top: 40px;
}

.submit_button button {
	margin-right: 20px;
	padding: 6px 15px;
	border-radius: 5px;
}

.create {
	border: 1px solid blue;
	color: blue;
	font-weight: 400;
	font-size: 18px;
}

.cancel {
	border: 1px solid red;
	color: red;
	font-weight: 400;
	font-size: 18px;
}

/* LIST DS PHÒNG BAN */
.container_data {
	width: 100%;
	height: 100%;
	background-color: white;
	margin-right: 40px;
}

.data {
	padding: 20px 30px;
}

.data h4 {
	margin-bottom: 30px;
}

.create_pb {
	text-decoration: none;
	padding: 7px 15px;
	border: 1px solid blue;
	color: blue;
	border-radius: 7px;
}

.table {
	margin-top: 20px;
	width: 100%;
	background-color: transparent;
	border-collapse: collapse;
	border-spacing: 0;
	font-family: 'Droid Serif', serif;
	overflow: value;
	margin-bottom: 20px;
}

.table th, .table td {
	font-size: 10px;
	padding: 15px 0;
	line-height: 20px;
	text-align: left;
	vertical-align: top;
}

.table-zebra tbody>tr:nth-child(odd)>td, .table-zebra tbody>tr:nth-child(odd)>th
	{
	background-color: #f4f4f4;
}

.table td a {
	text-decoration: none;
	padding: 5px 10px;
	border-radius: 5px;
}

.container_list {
	height: 65vh;
	overflow: auto;
	margin-top: 20px;
}

.create_empl {
	border: 2px solid blueviolet;
	color: #663399;
}

.view {
	border: 2px solid yellowgreen;
	color: green;
}

.update {
	border: 2px solid blue;
	color: blue;
}

.delete {
	border: 2px solid red;
	color: red;
}
</style>

</head>

<body>
	<div class="containerfulls">
		<div class="sibar_container">
			<div class="logo_t">WEB HRM</div>
			<div class="sibar_item">
				<li><span class="fa fa-home"></span> <a href="/JWEB_ML201/home">HOME</a></li>
				<li><span class="fa fa-user"></span> <a href="">USER
						PROFILE</a></li>
				<li><span class="fa fa-briefcase"></span> <a href="/JWEB_ML201/ListDepartmentSevlet">PHÒNG
						BAN</a></li>
				<li><span class="fa fa-address-card"></span> <a href="/JWEB_ML201/ListEmployeeServlet">NHÂN
						VIÊN</a></li>


			</div>

		</div>

		<div class="right_container">
			<div class="top_menu_item">
				<div class="title">
					<span class="fa fa-tongle"></span>
				</div>
				<div class="menu_itemRight">
					<c:if test="${sessionScope.acc != null }">
						<li><a href="">${sessionScope.acc.username}</a></li>
						<li><a href="/JWEB_ML201/LogoutServlet">Logout</a></li>
					</c:if>
					<c:if test="${sessionScope.acc == null }">
						<li><a >Khách Hàng</a></li>
						<li><a href="/JWEB_ML201/login">Login</a></li>
					</c:if>

				</div>
			</div>

			<div class="right_container_bt">

				<div class="container_data">
					<div class="data">
						<h4>DANH SÁCH CÁC PHÒNG BAN</h4>
						<a href="/JWEB_ML201/AddDepartmentServlet" class="create_pb">Tạo
							Phòng Ban Mới</a>
						<div class="container_list">
						<table class="table table-zebra table-hover ">
							<thead>
								<tr>
									<th>MÃ PHÒNG BAN</th>
									<th>TÊN PHÒNG BAN</th>
									<th>MÔ TẢ</th>
									<th>TÙY CHỌN</th>
								</tr>
							</thead>

							<tbody class="">

								<c:forEach items="${listDep }" var="e">
									<tr>
										<td>${e.department_id }</td>
										<td>${e.department_name }</td>
										<td>${e.mota }</td>
										<td><a href="" class="create_empl">Thêm NV</a> <a href=""
											class="view">Xem NV</a> <a href="updateDepartment?sid=${e.department_id }" class="update ">Sửa</a> <a
											href="delete?sid=${e.department_id}" class="delete">xóa</a></td>
									</tr>
								</c:forEach>

							</tbody>
						</table>
					</div>


				</div>
			</div>
		</div>
	</div>

	</div>





</body>

<script type="text/javascript">
function showMess(id) {
	var option = cofirm("are you sure to delete");
	if(option === true){
		window.location.herf = 'delete?sid='+id;
	}
	
}
</script>

</html>