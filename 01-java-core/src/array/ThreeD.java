package array;

import java.util.Arrays;
import java.util.Scanner;
public class ThreeD {
	public static void main(String[] args) {
		/*int[][][] arr=new int [2][2][2];
		 arr[0][0]=new int[2];
		 arr[0][0][0]=10;
		 arr[0][0][1]=20;
		 
		 arr[0][1]=new int[2];
		 arr[0][1][0]=30;
		 arr[0][1][1]=40;
		 
		 arr[1][0]=new int[2];
		 arr[1][0][0]=50;
		 arr[1][0][1]=60;
		 
		 arr[1][1]=new int[2];
		 arr[1][1][0]=70;
		 arr[1][1][1]=80;
		 
		 for(int[][] arr2:arr) {
			 for(int[] arr3:arr2) {
				 for(int x:arr3) {
					 System.out.print(x+" ");
				 }
			 }
		 }
		 
		 System.out.println();
		 //To String
		 
		 for(int[][] arr2:arr) {
			 for(int[] arr3:arr2) 
					 System.out.print(Arrays.toString(arr3));
				 }*/
		
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter 3d Array size");
		 int size3=sc.nextInt();
		 int size31=sc.nextInt();
		 System.out.println("enter 2d Array size");
		 int size2=sc.nextInt();
		 System.out.println("enter 1d Array size");
		 int size1=sc.nextInt();
		 
		 int[][][] arr = new int[[size3][size2]][[size1][]];
		 
		 arr[0][0]=new int[2];
		 arr[0][0][0]=size3;
		 arr[0][0][1]=size31;
		 
		 for(int[][] arr2:arr) {
			 for(int[] arr3:arr2) {
				 for(int x:arr3) {
					 System.out.print(x+" ");
				 }
			 }
		 }
		
		 
		
	}

}
