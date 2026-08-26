package loop;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt();
		int i=1;
		
		do {
			System.out.println(number*i);
			i++;
			
		}while(i<=10);
		}

}
