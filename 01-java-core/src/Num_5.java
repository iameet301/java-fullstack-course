import java.util.Scanner;

public class Num_5 {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	if(num % 5==0 && num% 3==0)
		System.out.println("divisible by 5 and 3");
	else
		System.out.println("not divisible by 5 or 3");
	}
}
