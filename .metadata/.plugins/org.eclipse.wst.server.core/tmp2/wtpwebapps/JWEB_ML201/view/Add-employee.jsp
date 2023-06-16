<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	background-color: #663399;
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
	height: calc(100% - 80px);
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

.container_data {
	max-width: 100%;
	/*  */
	background-color: white;
}

.data {
	padding: 10px 20px;
}

.item_data {
	display: flex;
	margin-top: 15px;
}

.item_data h6 {
	margin-bottom: 5px;
}

.item_data_text {
	width: 24vw;
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
	margin-right: 55px;
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

.gender {
	display: flex;
}

.gender div {
	margin-right: 20px;
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
				<li><span class="fa fa-briefcase"></span> <a
					href="/JWEB_ML201/ListDepartmentSevlet">PHÒNG BAN</a></li>
				<li><span class="fa fa-address-card"></span> <a
					href="/JWEB_ML201/ListEmployeeServlet">NHÂN VIÊN</a></li>


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
				<div class="title_dm">// Thêm Nhân Viên >></div>
				<div class="container_data">
					<form action="/JWEB_ML201//AddEmployeeServlet" method="post">
						<div class="data">
							<h4>Thông Tin Nhân Viên</h4>
							<span> vui lòng nhập thông tin sinh viên đầy đủ </span>
							<div class="item_data">
								<div class="name">
									<h6>Họ và Tên</h6>
									<input type="text" name="employee_name" class="item_data_text"
										placeholder="Enter Name">
								</div>
								<div class="gender">
									<div>
										<h6>Nam</h6>
										<input name="gender" type="radio" value="male">
									</div>
									<div>
										<h6>Nữ</h6>
										<input type="radio" name="gender" id="" value="femade">

									</div>
								</div>
								<div class="birth">
									<h6>Ngày Sinh</h6>
									<input type="date" value="dd/mm/yyyy"
										name="date_of_birth">
								</div>
								<div class="fullname">
									<h6>CMND/CCCD</h6>
									<input type="text" class="item_data_text" name="identity">
								</div>

							</div>
							<div class="item_data">
								<div class="address">
									<h6>Địa Chỉ</h6>
									<input type="text" class="address_text" name="address">
								</div>
							</div>
							<div class="item_data">
								<div class="time">
									<h6>Ngày Bắt Đầu</h6>
									<input type="date" class="time_text" name="time_on"> 
								</div>
								<div class="time">
									<h6>Ngày Nghỉ Làm</h6>
									<input type="date" class="time_text" name="time_off">
								</div>
								<div class="room">
									<h6>Phòng Ban</h6>
									<select class="select" name="department_id">
										<c:forEach items="${listDep}" var="x">
											<option value="${x.department_id}">${x.department_name}</option>
										</c:forEach>
									</select>
								</div>
								<div class="position">
									<h6>Chức Vụ</h6>
									<select class="select" name="position">
										<option>Giám Đốc</option>
										<option>Trợ Lý</option>
										<option>Nhân Viên</option>
										<option></option>
										<option>Lập trình mobile</option>
									</select>
								</div>
							</div>
							<div class="item_data">
								<div class="education">
									<h6>Trình Độ Học Vấn</h6>
									<select id="" class="level" name="academic_level">
										<option value="">-None-</option>
										<option value="">Tiểu Học Cơ Sở</option>
										<option value="">Trung Học Cơ SỞ</option>
										<option value="">Trung Học Phổ Thông</option>
										<option value="">Cao Đẳng</option>
										<option value="">Đại Học</option>
									</select>
								</div>
								<div class="english">
									<h6>Trình Độ Tiếng Anh</h6>
									<select name="english_level" id="" class="level" >
										<option value="">-None-</option>
										<option value="">topic</option>
										<option value="">Iseeu</option>
									</select>
								</div>
								<div class="informatics">
									<h6>Trình Độ Tin Học</h6>
									<select name="trust_level" id="" class="level">
										<option value="">-None-</option>
										<option value="">-None-</option>
										<option value="">-None-</option>
									</select>
								</div>
							</div>
							<div class="item_data">
								<div class="achievements">
									<h6>Thành Tích Công Việc</h6>
									<input type="text" class="achievements_text" name="achievement">
								</div>
							</div>
							<div class="submit_button">
								<button class="create" type="submit">Thêm Mới</button>
								<button class="cancel">Cancel</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>

	</div>





</body>

</html>