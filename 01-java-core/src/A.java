
public class A {
	public A(int a){
		
		System.out.println("int A class");
	}
	public A(boolean x) {
		
		this(A);
		System.out.println("boolean A class");
	}

}
