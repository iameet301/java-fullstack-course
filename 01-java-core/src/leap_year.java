import java.util.Scanner;

public class leap_year {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("guess any year");
		int y=sc.nextInt();
		
		if((y%400==0)&&(y%4==0 && y%100 !=0))
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
		
	}

}
