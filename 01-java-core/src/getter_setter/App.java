package getter_setter;

public class App {
	public Emp getData(Emp e) {
		return e;
		
	}
	public App() {
		Emp e=getData(new Emp(1,"aman"));
		System.out.println(e.getId()+" "+e.getName());
	}
	public static void main(String[] args) {
		App a=new App();
		
	}

}
