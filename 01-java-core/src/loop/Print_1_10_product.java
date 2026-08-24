package loop;

public class Print_1_10_product {
	public static void main(String[] args) {
		int start=1;
		int end=5;
		int product=1;
		
		do{
			product=product*start;
			start++;
			
		}while(start<=end);
		System.out.println(product);
	}

}
