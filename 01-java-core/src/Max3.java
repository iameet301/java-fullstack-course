import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third number");
		int c=sc.nextInt();
		
		System.out.println();
		
		if(a>b && b>c) {
			System.out.println("first number is bigger than second and third number ");
			
		}
		else if(b>c && c>a)
			System.out.println("second number is bigger than first and third number");
		else
			System.out.println("third number is bigger than first and second number");
		
	}

}
