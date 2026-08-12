package getter_setter;

public class Insta {
	String in_username;
	String in_password;
	public Insta(String in_username, String in_password) {
		super();
		this.in_username = in_username;
		this.in_password = in_password;
	}
	public Insta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIn_username() {
		return in_username;
	}
	public void setIn_username(String in_username) {
		this.in_username = in_username;
	}
	public String getIn_password() {
		return in_password;
	}
	public void setIn_password(String in_password) {
		this.in_password = in_password;
	}
	
}
