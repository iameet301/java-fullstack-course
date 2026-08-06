
public class Employee {
	int id;
	String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args) {
		Employee e=new Employee(1,"meet");
		System.out.println("id is"+" "+e.id);
		System.out.println("name"+" "+e.name);
	}

}
