package vku.udn.servlet;

import java.io.IOException;
import java.security.AllPermission;
import java.security.Permission;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import vku.udn.common.EmployeeDao;
import vku.udn.model.Department;
import vku.udn.model.Employee;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDao dao = new EmployeeDao();
		List<Department> listDep = dao.getAllDepartment();
		
		request.setAttribute("listDep", listDep);
		request.getRequestDispatcher("view/Add-employee.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String date_of_birth = request.getParameter("date_of_birth");
		String department_id = request.getParameter("department_id");
		EmployeeDao dao = new EmployeeDao();
		dao.AddEmployee(name, gender, date_of_birth, department_id) ;
		
		
		request.getRequestDispatcher("/ListEmployeeServlet").forward(request, response);

	}

}
