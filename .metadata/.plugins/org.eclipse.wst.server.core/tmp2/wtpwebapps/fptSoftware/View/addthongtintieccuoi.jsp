<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
label{
width: 20px;
}
input {
	margin-left: 50px;
	padding: 7px 14px;
}

</style>
</head>
<body>
	<div>
		<h2>DAT Tiec</h2>
		<div>
			<label>ID Khách Hàng</label> <input type="text" >
		</div>
		<div>
			<div>
				<label> NHà Hàng</label> <select>
					<option>QUÁN QUÊ</option>
					<option>NH HƯƠNG HOA</option>
					<option>-none-</option>
				</select>
			</div>
			<div>
				<label>Ngày Tổ Chức</label> <input type="datetime-local">
			</div>
			<div>
				<label>Số Lượng Khách</label> <input type="number">
			</div>
			<div>
				<label>Dịch Vụ</label> <select>
					<option>Nước Ngọt</option>
					<option>Hoa quả</option>
					<option>-none-</option>
				</select>
			</div>
			<div>
				<label>Thành Tiền</label> <input type="number">
			</div>

		</div>
</body>
</html>