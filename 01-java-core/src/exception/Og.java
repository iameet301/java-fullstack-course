package exception;

public class Og {
	public static void main(String[] args) {
		String s1 = "Tech";
		String s2 = new String("Tech");

		s1.concat(" Interview");

		StringBuilder sb = new StringBuilder("Tech");
		sb.append(" Interview");

		System.out.println(s1 == s2);       // Output 1?
		System.out.println(s1.equals(s2));   // Output 2?
		System.out.println(s1);              // Output 3?
		System.out.println(sb);              // Output 4?
	}

}
