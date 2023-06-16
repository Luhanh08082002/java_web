package vku.udn.servlet;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vku.udn.common.RegisterDao;
import vku.udn.model.Account;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet( urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
	private RegisterDao registerDao = new RegisterDao();

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("view/Register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String lastname = request.getParameter("lastname");
		String firstname = request.getParameter("firstname");
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		String repass = request.getParameter("repass");
		String email = request.getParameter("email");

		Account a = new Account();
		a.setUsername(user);
		a.setPassword(pass);
		a.setLastname(lastname);
		a.setFirstname(firstname);
		a.setEmail(email);
		try {
			if(!pass.equals(repass)) {
				request.getRequestDispatcher("view/Register.jsp").forward(request, response);
			}else {
				Account acc = registerDao.checkRegister(user,pass,lastname,firstname,email);
				if(acc==null) {
					registerDao.register(a);
					request.getRequestDispatcher("view/List-employees.jsp").forward(request, response);
//					response.sendRedirect("home");
					
				}else {
					request.getRequestDispatcher("view/Register.jsp").forward(request, response);
				}
			}
			

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//	request.getRequestDispatcher("view/List-employees.jsp").forward(request, response);
	}
}
