import java.util.Scanner;

public class Max_Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println("first number is bigger than second number ");
			
		}
		else
			System.out.println("second number is bigger than first number");
		
	}

}
