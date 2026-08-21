import java.util.Scanner;

public class Language {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enetr 1 for marathi");
			System.out.println("enter 2 for gujarati");
			System.out.println("enter 3 for hindi");
			
			int input = sc.nextInt();
			if(input == 1)
				System.out.println("marathi");
			else if(input == 2)
				System.out.println("gujarati");
			else if(input == 3)
				System.out.println("hindi");
			else {
				System.out.println("eneter  valid input");
				System.exit(0);
			}
		}
	}
}
