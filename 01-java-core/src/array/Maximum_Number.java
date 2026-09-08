package array;

public class Maximum_Number {
	public static void main(String[] args) {
		int[] a= {10,100,999,555,299};
		
		int max=a[0];
		
		for (int i = 1; i < a.length; i++) {
		    if (a[i] > max) {
		        max = a[i];
		    }
		}
		System.out.println("maximum number "+max);
	}

}
