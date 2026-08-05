

public class Student {
	public static void printCollegeName() {
		String cName="ppu";
		System.out.println(cName);
	}
	public void setStudyHours(int hours) {
		
		System.out.println("i study for"+" "+ hours + " hours");
		
	}
	public int calculateTotalMarks(int math,int sci) {
		return math+sci;
		
	}
	public static void main(String[] args) {
		Student.printCollegeName();
		Student s=new Student();
		s.setStudyHours(5);
		int t=s.calculateTotalMarks(80, 90);
		System.out.println(t);
	}
	

}
