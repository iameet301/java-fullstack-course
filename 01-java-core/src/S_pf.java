import java.util.Scanner;

public class S_pf {
	public static boolean isPass(Studentpf s) {
		if(s.getMarks()>=35)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		
		if(isPass(new Studentpf(id,marks)))
			System.out.println("Student is pass");
		else
			System.out.println("Student is fail");
	}

}
