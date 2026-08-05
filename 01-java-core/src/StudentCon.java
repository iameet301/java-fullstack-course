

public class StudentCon { 
	
	public StudentCon(float f) {
		System.out.println("float parameter");
	}
	public StudentCon(String name,long mob) {
		this(5.5f);
		System.out.println("string,long parameter");
	}
	public StudentCon(char c) {
		this("meet",7558786858l);
		System.out.println("char");
	}
	public static void main(String[] args) {
		StudentCon s=new StudentCon('a');
	}
	

}
