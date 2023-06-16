package vku.udn.model;

import java.sql.Date;

public class Employee {
	private int employee_id;
	private String employee_name;
	private int gender;
	private String date_of_birth;
	private int department_id;
	
	public Employee() {
		
	}
	
	
	public Employee(int employee_id, String employee_name, int gender, String date_of_birth, int department_id) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.department_id = department_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", gender=" + gender
				+ ", date_of_birth=" + date_of_birth + ", department_id=" + department_id + "]";
	}

	
}
