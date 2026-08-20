import java.util.Scanner;

public class GradeGeneration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		
		if(marks>=91 && marks<=100)
			System.out.println("grade a+");
		else if(marks>=81 && marks<=90 )
			System.out.println("grade a");
		else if(marks>=71&& marks<=80 )
			System.out.println("grade b+");
		else if(marks>=61 && marks<=70)
			System.out.println("grade b");
		else if(marks>=51 && marks<=60)
			System.out.println("grade c+");
		else if(marks>40 && marks<=50)
			System.out.println("c");
		else if(marks<40 && marks>=0)
			System.out.println("you are fail");
		else {
			System.out.println("enter valid input");
		}
	}

}
