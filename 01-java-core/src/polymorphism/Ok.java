package polymorphism;

public class Ok implements MathOperation {

	@Override
	public int operate(int a, int b) {
		
		return a+b;
	}
	public void printInfo() {
        System.out.println("Executing operation...");
    }

}
