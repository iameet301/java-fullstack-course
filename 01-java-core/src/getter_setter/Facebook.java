package getter_setter;

public class Facebook {
	String fb_username;
	String fb_password;
	public String getFb_username() {
		return fb_username;
	}
	public void setFb_username(String fb_username) {
		this.fb_username = fb_username;
	}
	public String getFb_password() {
		return fb_password;
	}
	public void setFb_password(String fb_password) {
		this.fb_password = fb_password;
	}
	public Facebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facebook(String fb_username, String fb_password) {
		super();
		this.fb_username = fb_username;
		this.fb_password = fb_password;
	}

}
