package getter_setter;

public class Testy {
	
	public Testy() { 
		this("pooja");
		System.out.println("no para....");
	}
	public Testy(String name) {
		Student s=new Student(name);
		System.out.println(name);
	
	}
		public Testy(Student s){
			System.out.println(s.getStudentId()+" "+s.getStudentName());
			
	}
		public static void main(String[] args) {
			Testy t=new Testy();
		}

}
