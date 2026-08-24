package loop;

public class Print_even_1_10 {
	public static void main(String[] args) {

	int start=1;
	int end=10;
	int count=0;
	
	do {
		if(start%2==0){
		System.out.println(start);
		count++;
		}
		start++;
		
		
	}while(start<=end);
	System.out.println("count"+count);

	}
}

