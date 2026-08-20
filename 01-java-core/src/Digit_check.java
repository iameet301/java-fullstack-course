import java.util.Scanner;

public class Digit_check {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("take a number");
		String a=sc.next();
		
		int b=a.length();
		
		
		
		if(b==3)
			System.out.println("3 digit");
		else if(b==2)
			System.out.println("2 digit");
		else if(b==1)
			System.out.println("1 digit");
		else
			System.out.println("invalid ");
	}

}
