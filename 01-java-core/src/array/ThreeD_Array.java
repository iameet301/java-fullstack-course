package array;

import java.util.Arrays;

public class ThreeD_Array {
	public static void main(String[] args) {
		int[][][] arr= {{{1,2},{3,4}},{{5,6},{7,8}}};
		
		//enhanced for loop
		
		for(int[][] arr1:arr) {
			for(int[] arr2:arr1) {
				for(int x:arr2) {
					System.out.print(x);
				}
			}
		}
		System.out.println();
		
		//TO string
		
		for(int[][] arr1:arr) {
			for(int[] arr2:arr1) {
					System.out.print(Arrays.toString(arr2));
				
			}
		}
		System.out.println();
		
		//index wise
		
		System.out.print(arr[0][0][0]+" ");
		System.out.print(arr[0][0][1]+" ");
		
		System.out.print(arr[0][1][0]+" ");
		System.out.print(arr[0][1][1]+" ");
		
		System.out.print(arr[1][0][0]+" ");
		System.out.print(arr[1][0][1]+" ");
		
		System.out.print(arr[1][1][0]+" ");
		System.out.print(arr[1][1][1]+" ");
		
		
	}

}
