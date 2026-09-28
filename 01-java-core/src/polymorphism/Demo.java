package polymorphism;

public class  Demo {
    public static void main(String[] args) {

        Examole obj = new Child();

        System.out.println("--- 1. Compile-Time Polymorphism ---");
        obj.calculate(10);        
        obj.calculate(10, 20);    

        System.out.println("\n--- 2. Runtime Polymorphism ---");
        obj.show(); 

        System.out.println("\n--- 3. Method Hiding ---");
        obj.display(); 
       
    }//
}


