package getter_setter;

public class SocialMedia {
	Facebook facebook;
	Insta insta;
	public SocialMedia(Facebook facebook, Insta insta) {
		super();
		this.facebook = facebook;
		this.insta = insta;
	}
	public SocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facebook getFacebook() {
		return facebook;
	}
	public void setFacebook(Facebook facebook) {
		this.facebook = facebook;
	}
	public Insta getInsta() {
		return insta;
	}
	public void setInsta(Insta insta) {
		this.insta = insta;
	}
	

}
