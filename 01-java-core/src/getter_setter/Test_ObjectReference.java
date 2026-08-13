package getter_setter;

import java.util.Scanner;

public class Test_ObjectReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter car price:");
        int price = sc.nextInt();
        
        System.out.println("Enter car model:");
        String model = sc.next();
        
        // 1. Create empty object using No-Arg Constructor
        Car c1 = new Car();
        
        // 2. Initialize directly using the Object Reference (dot operator)
        c1.price = price;
        c1.model = model;
        
        // Printing the results in 3 different ways
        System.out.println(c1.price + " " + c1.model);
        System.out.println(c1.getPrice() + " " + c1.getModel());
        System.out.println(c1);
    }
}
