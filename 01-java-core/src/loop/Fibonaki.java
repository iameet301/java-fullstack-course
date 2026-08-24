package loop;

public class Fibonaki {
	public static void main(String[] args) {
		int firstNumber=0;
		int secondNumber=1;
		
		int nextNumber;
		
	int	i=1;
		
		do {
			System.out.println(firstNumber);
			
			nextNumber=firstNumber+secondNumber;
			
			firstNumber=secondNumber;
			secondNumber=nextNumber;
			
			i++;
		}while(i<=10);
	}

}
