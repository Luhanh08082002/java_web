package vku.udn.model;

public class LoginUser {

	private String username;
	private String password;
	private boolean remember;
	public Object rs;

	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginUser [username=" + username + ", password=" + password + ", remember=" + remember + "]";
	}
	public boolean isRemember() {
		return remember;
	}
	public void setRemember(boolean remember) {
		this.remember = remember;
	}
	
}
