<%@page import="vku.udn.vn.common.EmployeeDao"%>
<%@page import="vku.udn.vn.model.Department"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
   import="java.util.ArrayList" import="vku.udn.vn.common.EmployeeDao" import="vku.udn.vn.model.Department" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
            .form div{
                margin-top: 10px;
            }
            .form button{
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
            #department{
                margin: 5px 0;
                width: 500px;
                padding: 5px 10px;
                border: 1px solid gray;

                border-radius: 7px;
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
			<div>
				<!-- <img src="" alt="" width="50px" height="50px"> -->
				<a href="">Logout</a>
			</div>



		</div>
	</div>
	 <div class="addantemployee">

            <div class="fromEployee">
                <h3>List Employees </h3>
                <div class="form">
                    <form action="/Lap2/addemployee" method="post">
                    <div>
                        <label for="">Name :</label><br>
                        <input type="text" name="name" placeholder="Enter Name">
                    </div>
                    <div>
                        <label for="">Gender  :
                            <input name="gender" type="radio"> Male 
                            <input type="radio" name="gender" id=""> Femade
                        </label>
                    </div>
                    <div>
                        <label for="">Date Of Birth :</label><br>
                        <input type="text" name="date_of_birth" placeholder="dd/mm/yyyy">
                    </div>
                    <div>
                        <label for="">Department :</label><br>
                        <%
                        EmployeeDao dao = new EmployeeDao();
                        ArrayList<Department> list = dao.getAllDepartment();
                        %>
                        <select id="department" name="department">
                           <% for(Department o : list){ %>
                            <option value="<%out.print(o.getDepartment_name()); %>">
                            <%out.print(o.getDepartment_name()); %>
                            </option>
                            <%} %>
                            
                        </select>
                    </div>
                   
                        <button type="submit"> Add Employee</button>
                 
                </form>



                </div>

            </div>
           


        </div>

</body>
</html>