package vku.udn.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vku.udn.model.Account;
import vku.udn.service.ConnectMysql;

public class RegisterDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	// kiểm tra xem có trùng tài khoản
	public Account checkRegister(String user,String pass,String lastname , String firstname , String email) {
		try {
			String query = "select * from user where username= ?";
			conn = new ConnectMysql().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			rs = ps.executeQuery();
			while (rs.next()) {
				Account account = new Account(rs.getString(1), rs.getString(2));
				return account;

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

	public void register(Account account) throws ClassNotFoundException {
		String query = "insert into user" + 
	"(username,password,lastname,firstname,email,isShell)values"+
	"(?,?,?,?,?,?)";
		
		try {
			conn = new ConnectMysql().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, account.getUsername());
			ps.setString(2, account.getPassword());
			ps.setString(3,account.getLastname());
			ps.setString(4, account.getFirstname());
			ps.setString(5, account.getEmail());
			ps.setInt(6,0);
			
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
