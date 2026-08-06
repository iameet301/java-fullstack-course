
public class B extends A{
	public B(long x) {
		super(true);
		System.out.println("long B class");
	}
	public B(String x) {
		this(57568587l);
		System.out.println("String B class");
	}

}
