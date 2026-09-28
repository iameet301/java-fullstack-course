package polymorphism;

public class Examole {

	    void calculate(int a) {
	        System.out.println("Parent calculate (1 param): " + a);
	    }

	    void calculate(int a, int b) {
	        System.out.println("Parent calculate (2 params): " + (a + b));
	    }
	    void show() {
	        System.out.println("Parent instance show()");
	    }

	    static void display() {
	        System.out.println("Parent static display()");
	    }
	}

	class Child extends Examole {
	    
	    @Override
	    void show() {
	        System.out.println("Child instance show()");
	    }

	    static void display() {
	        System.out.println("Child static display()");
	    }
	}
	

	