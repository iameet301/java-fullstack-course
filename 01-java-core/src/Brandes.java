
public class Brandes {
	String bName;
	String model;
	String color;
	int price;
	public Brandes(String bName, String model, String color, int price) {
		super();
		this.bName = bName;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public void display() {
		System.out.println("brand "+bName+" model "+model+" color "+color+" price "+price);
	}
	public static void main(String[] args) {
		Brandes b=new Brandes("Audi","R8","red",19999999);
		Brandes b2=new Brandes("Mercedes","S100","black",29999999);
		Brandes b3=new Brandes("BMW","I5","blue",39999999);
		Brandes b4=new Brandes("Porsche","P911","yellow",21999999);
		b.display();
		b2.display();
		b3.display();
		b4.display();
	}
	
	
}
