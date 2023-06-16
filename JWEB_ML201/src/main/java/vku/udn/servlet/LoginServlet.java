package vku.udn.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vku.udn.common.CookieUtils;
import vku.udn.common.LoginDao;
import vku.udn.model.Account;
import vku.udn.model.LoginUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	private static LoginDao loginDao = new LoginDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		try {
			String user = request.getParameter("username");
			String pass = request.getParameter("password");

			
			Account a = loginDao.checkLogin(user, pass);
			if (a==null) {
				request.setAttribute("message", "Tên Đăng Nhập Hoặc Mật Khẩu Không Đúng ");
				request.getRequestDispatcher("/login.jsp").forward(request, response);

			} else {
				
				HttpSession session = request.getSession();
				session.setAttribute("acc",a);
				request.getRequestDispatcher("view/Home-page.jsp").forward(request, response);
				

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
