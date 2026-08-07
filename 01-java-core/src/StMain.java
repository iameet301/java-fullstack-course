
public class StMain {
	    public static void main(String[] args) {
	        // Calls  regular constructor
	        StudentOp original = new StudentOp("meet", 21);
	        
	        // Calls  copy constructor
	        StudentOp clone = new StudentOp(original); 
	        
	        System.out.println("Original Name: " + original.name+" "+original.age);
	        System.out.println("Clone Name: " + clone.name);
	    }
	}


