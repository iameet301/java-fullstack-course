
public class Emp2 {
	int id;
	String name;
	public Emp2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Emp2(Emp2 emp) {
		super();
		this.id=emp.id;
		this.name=emp.name;
		
	}
	public static void main(String[] args) {
		Emp2 e=new Emp2(1,"meet");
		Emp2 e2=new Emp2(e);
		System.out.println(e.id+" "+e.name);
		System.out.println(e2.id+" "+e.name);
	}

}
