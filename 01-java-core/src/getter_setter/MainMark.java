package getter_setter;

public class MainMark {
	public static void main(String[] args) {
		Facebook f=new Facebook("meet","okok");
		Insta i=new Insta("kaushik","ogog");
		SocialMedia s=new SocialMedia(f,i);
		
		System.out.println(s.getInsta().getIn_username());
		System.out.println(s.getInsta().getIn_password());
		
		System.out.println(s.getFacebook().getFb_username());
		System.out.println(s.getFacebook().getFb_password());
		
	}
}
