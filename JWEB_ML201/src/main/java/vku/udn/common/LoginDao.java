package vku.udn.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vku.udn.model.Account;
import vku.udn.service.ConnectMysql;

public class LoginDao {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public Account checkLogin(String username, String password) {
		try {
			String query = "select * from user where username= ? and password = ?";
			conn = new ConnectMysql().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Account(rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6));

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

}
