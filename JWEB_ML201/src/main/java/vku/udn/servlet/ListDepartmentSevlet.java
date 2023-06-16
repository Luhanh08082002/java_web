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


@WebServlet("/ListDepartmentSevlet")
public class ListDepartmentSevlet extends HttpServlet {
	
	private EmployeeDao Dao = new EmployeeDao();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListDepartmentSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Department> listDep = Dao.getAllDepartment();
	System.out.println(listDep);
		
		request.setAttribute("listDep", listDep);
		request.getRequestDispatcher("view/List_department.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
