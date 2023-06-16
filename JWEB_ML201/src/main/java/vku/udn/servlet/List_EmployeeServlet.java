package vku.udn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vku.udn.common.EmployeeDao;
import vku.udn.model.Department;
import vku.udn.model.Employee;

@WebServlet("/ListEmployeeServlet")
public class List_EmployeeServlet extends HttpServlet {

	private EmployeeDao dao = new EmployeeDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
			List<Employee> listEmp = dao.getAllEmployee();
			List<Department> listDep = dao.getAllDepartment();

			request.setAttribute("listDep", listDep);
			request.setAttribute("listEmp", listEmp);

			request.getRequestDispatcher("view/List-employees.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("view/List-employees.jsp").forward(request, response);
	}

}
