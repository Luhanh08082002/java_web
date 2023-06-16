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

.noi-dung {
	display: flex;
	justify-content: center;
}

.form h2 {
	text-align: center;
	margin-top: 40px;
	font-size: 30px;
	font-weight: bold;
}

.lastname {
	margin-top: 40px;
}

.lastname label {
	font-size: 18px;
	font-weight: bold;
}

.lastname input {
	width: 400px;
	padding: 5px 20px;
}

.firstname {
	margin-top: 20px;
}

.firstname label {
	font-size: 18px;
	font-weight: bold;
}

.firstname input {
	width: 400px;
	padding: 5px 20px;
}

.username {
	margin-top: 20px;
}

label span {
	color: red;
}

.username label {
	font-size: 18px;
	font-weight: bold;
}

.username input {
	width: 400px;
	padding: 5px 20px;
}

.email {
	margin-top: 20px;
}

.email label {
	font-size: 18px;
	font-weight: bold;
}

.email input {
	width: 400px;
	padding: 5px 20px;
}

.password {
	margin-top: 20px;
}

.password label {
	font-size: 18px;
	font-weight: bold;
}

.password input {
	width: 400px;
	padding: 5px 20px;
}

.error {
	margin: 20px 0px 20px 100px;
	color: red;
}

.submit {
	margin-left: 100px;
}

.submit button {
	padding: 7px 14px;
	background-color: blue;
	border: none;
	color: white;
	border-radius: 7px;
}

.submit a {
	color: blue;
	margin-left: 30px;
	text-decoration: none;
}
</style>
</head>

<body>

	<section>

		<!--Bắt Đầu Phần Nội Dung-->
		<div class="noi-dung">
			<div class="form">
				<h2>LOGIN</h2>
				<form action="register" method="post">
					<div class="lastname">
						<label>LastName <span>*</span>
						</label> <input type="text" name="lastname" id="lastname"
							placeholder="Enter Last Name">
					</div>
					<div class="firstname">
						<label>Firstname<span>*</span>
						</label> <input type="text" name="firstname" id="firstname"
							placeholder="Enter First Name">
					</div>
					<div class="username">
						<label>UserName <span>*</span>
						</label> <input type="text" name="username" id="username"
							placeholder="Enter User Name">
					</div>
					<div class="email">
						<label>Email <span>*</span>
						</label> <input type="text" name="email" id="email"
							placeholder="Enter Email">
					</div>
					<div class="password">
						<label>PassWord <span>*</span></label> <input type="password"
							name="password" id="password" placeholder="Enter Password">
					</div>
					<div class="password">
						<label>PassWord <span>*</span></label> <input type="password"
							name="repass" id="repeatpassword" placeholder="Repeat Password">
					</div>
					<div class="error">
						<i class="text-danger">${message}</i>
					</div>
					<div class="submit">
						<button type="submit">Register</button>
						<a href="/JWEB_ML201/login.jsp">Click here to login</a>
					</div>
				</form>

			</div>
		</div>
	</section>

</body>

</html>