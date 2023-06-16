package vku.udn.common;

import java.security.Permission;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import vku.udn.model.Department;
import vku.udn.model.Employee;
import vku.udn.service.ConnectMysql;

//load dữ liêu từ db lên
public class EmployeeDao {

	// kết nối với mysql
	Connection conn = null;
	
	// ném câu lệnh sang
	 PreparedStatement ps = null;
	 
	// nhận kết quả trả về
	 ResultSet rs = null;


	 //khai bao hàm trả về tất cả dữ liệu có trong db
	 public List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<>();
		 String query = "SELECT * FROM employee";
		 try {
			 conn = new ConnectMysql().getConnection();
			 ps = conn.prepareStatement(query);
			 rs = ps.executeQuery();
			 while(rs.next()) {
				 list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4), rs.getInt(5)));
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return list;
		 
	 }
	 
	 public List<Department> getAllDepartment(){
		 ArrayList<Department> list = new ArrayList<>();
		 String query = "select * from department";
		 try {
			 conn = new ConnectMysql().getConnection();
			 ps = conn.prepareStatement(query);
			 rs = ps.executeQuery();
			 while(rs.next()) {
				 list.add(new Department(rs.getInt(1),
						 rs.getString(2)
						));
			 }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return list;
		 
	 }
	 
	 
	 public void AddEmployee(String employee_name , String gender , String date_of_birth , String department_id) {
		 String query = "insert into employee" + 
					"(employee_name,gender,date_of_birth,department_id)values"+
					"(?,?,?,?)";
		 try {
			 conn = new ConnectMysql().getConnection();
			 ps = conn.prepareStatement(query);
			 ps.setString(1, employee_name);
			  if(gender.equals("male")) {
				  ps.setString(2,"1" );
			 }
			  else {
				  ps.setString(2,"0" );
			}
					
			 ps.setString(3, date_of_birth);
			 ps.setString(4,department_id);
			 ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }

	 public void DeleteEmployee(String id){
		 String query = "delete from employee " + " where employee_id =?";
		 try {
			 conn = new ConnectMysql().getConnection();
			 ps = conn.prepareStatement(query);
			 ps.setString(1, id);
			 ps.executeUpdate();
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }
	 
	 public Employee getEmployeeById(String id){
			
			 String query = "SELECT * FROM employee" + "where employee_id = ? ";
			 try {
				 conn = new ConnectMysql().getConnection();
				 ps = conn.prepareStatement(query);
				 ps.setString(1,id);
				 rs = ps.executeQuery();
				 System.out.println(ps);
				 while(rs.next()) {
					 return new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4), rs.getInt(5));
				 }
			} catch (Exception e) {
				// TODO: handle exception
			}
			 return null;
			 
		 }

	 public static void main(String[] args) {
		 
		EmployeeDao dao = new EmployeeDao();
		List<Department> li = dao.getAllDepartment();
		
		List<Employee> list = dao.getAllEmployee();
		Employee s = dao.getEmployeeById("10");
		System.out.println(s);
		for(Department e : li) {
			//System.out.println( " Lỗi  " + e);
		}
		for(Employee o : list) {
//			System.out.println(o);
		}
	}
}
