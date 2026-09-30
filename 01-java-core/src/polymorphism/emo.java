package polymorphism;

public interface emo {
	public static void main(String[] args) {
		i g=name -> name.length();
		int len=g.getTheLengthOfTheString("meet");
		System.out.println(len);
	}

}
