package getter_setter;

public class Main {
	public static void main(String[] args) {

	Student s=new Student(1,"meet");
	College c=new College(10,"vtcbcsr",s);
	University u=new University(101,"vnsgu",c);
	
	
	System.out.println(u.getUniversityId());
	System.out.println(u.getUniversityname());
	
	System.out.println(u.getCollege().collegeId);
	System.out.println(u.getCollege().getCollegeName());
	
	System.out.println(u.getCollege().getStudent().getStudentId());
	System.out.println(u.getCollege().getStudent().getStudentName());
	}

}
