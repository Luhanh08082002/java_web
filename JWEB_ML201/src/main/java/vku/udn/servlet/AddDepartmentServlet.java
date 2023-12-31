package vku.udn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vku.udn.common.EmployeeDao;
import vku.udn.model.Department;

@WebServlet("/AddDepartmentServlet")
public class AddDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddDepartmentServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("view/Add_department.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String department_id = request.getParameter("department_id");
		String department_name = request.getParameter("department_name");
		String mota = request.getParameter("mota");
		
		EmployeeDao e = new EmployeeDao();
		e.AddDepartmnet(department_id, department_name, mota);		
		response.sendRedirect("ListDepartmentSevlet");
	}

}
