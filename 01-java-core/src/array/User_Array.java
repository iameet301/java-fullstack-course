package array;
import java.util.Scanner;
public class User_Array {
		public static void main(String[] args) {
			int[][] arr=new int[2][2];
	        Scanner sc = new Scanner(System.in);
			System.out.println("enter fisrt arr");
			int num=sc.nextInt();
			int num2=sc.nextInt();
			
			arr[0]=new int[2];
			arr[0][0]=num;
			arr[0][1]=num2;
			
			System.out.println("enter second arr");
			int num3=sc.nextInt();
			int num4=sc.nextInt();
			
			arr[1]=new int[2];
			arr[1][0]=num3;
			arr[1][1]=num4;
			
			for(int[] arr2:arr) {
				for(int x:arr2) {
					System.out.print(x+" ");
				}
				System.out.println();
			}
		}

	}
