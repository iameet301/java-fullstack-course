import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose your character ");
		char c=sc.next().charAt(0);
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			System.out.println("its vowel");
		else
			System.out.println("its consonent");
	}

}
