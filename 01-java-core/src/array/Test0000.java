package array;

import java.util.Arrays;

public class Test0000 {
	public static void main(String[] args) {
		int[][] arr=new int[2][];
		arr[0]=new int[2];
		arr[0][0]=1;
		arr[0][1]=2;
		
		arr[1]=new int[2];
		arr[1][0]=3;
		arr[1][1]=4;
		
		for(int[] arr2:arr) {
			System.out.println(Arrays.toString(arr2));
		}
	}

}
