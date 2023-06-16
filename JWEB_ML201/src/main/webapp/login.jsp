<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="preconnect" href="https://fonts.gstatic.com">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
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

            .username {
                margin-top: 40px;

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
                    <form action="login" method="post">
                        <div class="username">
                            <label>UserName <span>*</span> </label>
                            <input type="text" name="username" id="username" placeholder="Enter User Name">
                        </div>
                        <div class="password">
                            <label>PassWord <span>*</span></label>
                            <input type="password" name="password" id="password" placeholder="Enter Password">
                        </div>
                        <div class="error">
                            <i class="text-danger">${message}</i>
                        </div>
                        <div class="submit">
                            <button type="submit"> Login</button>
                            <a href="/JWEB_ML201/view/Register.jsp">Click here to Register</a>
                        </div>
                    </form>

                </div>
            </div>

        </section>

    </body>

    </html>