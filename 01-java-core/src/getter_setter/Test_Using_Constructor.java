package getter_setter;

import java.util.Scanner;

public class Test_Using_Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter car price:");
        int price = sc.nextInt();
        
        System.out.println("Enter car model:");
        String model = sc.next();
        
        // 1. Initialize using Parameterized Constructor
        Car c1 = new Car(price, model);
        
        // Printing the results in 3 different ways
        System.out.println(c1.price + " " + c1.model);
        System.out.println(c1.getPrice() + " " + c1.getModel());
        System.out.println(c1);
    }
}
