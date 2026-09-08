package array;

public class Two_D_1to9 {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] arr2:arr) {
			for(int x:arr2) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
