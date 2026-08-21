import java.util.Scanner;

public class Main_Calculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for division");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");
		int input=sc.nextInt();
		
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		switch(input) {
		case 1:
			int sum=Calculation.addition(a, b);
			System.out.println("addition is"+sum);
			break;
			
		case 2:
			int subtraction=Calculation.subtraction(a, b);
			System.out.println("subtraction is"+subtraction);
			break;
			
		case 3:
			int multiplication=Calculation.mulplication(a, b);
			System.out.println("multiplication is"+multiplication);
			break;
			
		case 4:
			int division=Calculation.division(a, b);
			System.out.println("multiplication is"+division);
			break;
			
			default:
				System.out.println("invalid");
				System.exit(0);
		}
		}
	}

}
