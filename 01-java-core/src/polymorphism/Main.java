package polymorphism;

public class Main {
	public static void main(String[] args) {
		Ok k=new Ok();
		System.out.println(k.operate(1, 2));
		k.operate(1, 2);
		k.printInfo();
	}

}
