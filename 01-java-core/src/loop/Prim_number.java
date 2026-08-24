package loop;

public class Prim_number {
	public static void main(String[] args) {
		int a=9;
		int i=2;
		int count=0;
		
		do {
			if(a%i==0)
				count++;
				i++;
		}while(i<a);
		if(count==0)System.out.println("prime");
		else System.out.println("not");
		}
	}


