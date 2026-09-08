package array;

import java.util.Arrays;

public class Empty_arr {
	public static void main(String[] args) {
		int[][] op=new int[2][2];
		
		op[0][0]=1;
		op[0][1]=2;
		
		op[1][0]=3;
		op[1][1]=4;
		
		for(int[] arr2:op){
			System.out.println(Arrays.toString(arr2));
		}
		
	}

}
