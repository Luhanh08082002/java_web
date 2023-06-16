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
</head>
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
	margin-bottom: 5px;
}

.item_data_text {
	width: 100%;
	margin-right: 30px;
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

/* phòng ban */
.right_container_bt {
	display: flex;
}

.container_data {
	width: 60%;
	height: 70%;
	background-color: white;
	margin-right: 40px;
}

.data {
	padding: 20px 30px;
}

.container_user {
	width: 40%;
	height: 70%;
	background-color: white;
}

.img_nen {
	width: 100%;
	height: 150px;
	object-fit: cover;
}

.user_data {
	display: flex;
	flex-direction: column;
	justify-content: space-around;
	align-items: center;
}

.avatar {
	width: 80px;
	height: 80px;
	border: 2px solid green;
	border-radius: 50%;
	margin-top: -40px;
}

.user_data h5 {
	font-size: 18px;
	margin-top: 10px;
}

.user_data h3 {
	margin-top: 10px;
	margin-bottom: 20px;
}

.user_data p {
	font-size: 6px;
	padding-bottom: 20px;
	border-bottom: 2px solid gray;
	padding: 10px 10px
}
</style>

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

				<div class="container_data">
					<form action="/JWEB_ML201/AddDepartmentServlet" method="post">
						<div class="data">
							<h4>FROM TẠO PHÒNG BAN</h4>
							<div class="item_data">
								<h6>MÃ PHÒNG BAN</h6>
								<input type="text" class="item_data_text" name="department_id">
							</div>
							<div class="item_data">
								<h6>TÊN PHÒNG BAN</h6>
								<input type="text" class="item_data_text" name="department_name">
							</div>
							<div class="item_data">
								<h6>MÔ TẢ</h6>
								<input type="text" class="item_data_text" name="mota">
							</div>
							<div class="submit_button">
								<button class="create" type="submit">Thêm Mới</button>
								<button class="cancel">Cancel</button>
							</div>
						</div>
					</form>
				</div>
				<div class="container_user">
					<img
						src="https://thuthuatphanmem.vn/uploads/2018/04/10/hinh-nen-bong-hong-dep_052333650.jpg"
						alt="" class="img_nen">
					<div class="user_data">
						<img
							src="https://img.thuthuattinhoc.vn/uploads/2019/01/08/anh-anime-boy-dep-nhat_101905549.jpg"
							class="avatar" alt="">
						<h5>Lữ Hành</h5>
						<h3>CONG TY TNHH PHAN PHOI LU HANH</h3>
						<p>17-My an,Phuong Bac My Phu , Quan Ngu Hanh Son , TP Đà Nẵng

						
						<p>
						<div>
							<i class="fa-brands fa-facebook"></i> <span
								class="fa-brands fa-facebook"></span> <span
								class="fa-brands fa-youtobe"></span> <span
								class="fa-brands fa-home"></span>
						</div>
					</div>

				</div>

			</div>
		</div>

	</div>





</body>

</html>