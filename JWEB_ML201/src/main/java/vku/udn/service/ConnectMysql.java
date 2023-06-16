package vku.udn.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class ConnectMysql {
	public Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost/qlsinhvien";
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url,user,password);
		
	}
		
		
	private	String url = "jdbc:mysql://localhost/qlsinhvien";
	private	String database = "qlsinhvien";
	private	String user = "root";
	private String instance = "";
	private	String password = "nguyenngocthang123";
	
	
}
