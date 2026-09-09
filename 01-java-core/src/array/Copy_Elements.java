package array;

public class Copy_Elements {
	public static void main(String[] args) {
		int[] org= {1,2,3,4,5};
		
		int[] copy= new int[org.length];
		
		for(int i=0; i<org.length; i++) {
			copy[i]=org[i];
		}
		System.out.print("Copied Array: ");
        for (int value : copy) {
            System.out.print(value + " ");
        }
	}

}
