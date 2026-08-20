import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("take first angle");
		int a=sc.nextInt();
		System.out.println("take second angle");
		int b=sc.nextInt();
		System.out.println("take third angle");
		int c=sc.nextInt();
		
		if(a<180 ||a>0)
			System.out.println("ok");
		else {
			System.out.println("invalid");
		}
		if(b<180 ||c>0)
			System.out.println("ok");
		else {
			System.out.println("invalid");
		}
		if(c<180 ||c>0)
			System.out.println("ok");
		else {
			System.out.println("invalid");
		}
	}

}
