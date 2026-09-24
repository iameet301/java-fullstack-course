import java.util.Scanner;

public class Trafic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select any color \n1.RED\n2.GREEN\3.AMBER");
		String signal=sc.next().toUpperCase();
		
		Trafic input=signal.valueOf(signal);
		
		switch (signal) {
		case "RED":
		System.out.println("STOP");
		break;
		
		case "AMBER":
		System.out.println("READY");
		break;
		
		case "GREEN":
		System.out.println("GO");
		break;
		
		}
	}

}
