package array;

public class ThreeD_Array {
	public static void main(String[] args) {
		int[][][] arr= {{{1,2},{3,4}},{{5,6},{7,8}}};
		
		for(int[][] arr1:arr) {
			for(int[] arr2:arr1) {
				for(int x:arr2) {
					System.out.println(x);
				}
			}
		}
	}

}
