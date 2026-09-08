package array;

public class Minimun_Number {
	public static void main(String[] args) {
		int[] a= {0,1,2,3,4,5};
		
		int min=a[0];
		
		for (int i = 1; i < a.length; i++) {
		    if (a[i] < min) {
		        min = a[i];
		    }
		}
		System.out.println("minimum number "+min);
	}

}
