package inheritance;

public class ok {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.getParentSaving();
		
		Child1 c=new Child1();
		c.getParentSaving();
		
		Child2 c2=new Child2();
		c2.getChild2Saving();
		
		Parent p2=new Child2();
		
				
	}
}
