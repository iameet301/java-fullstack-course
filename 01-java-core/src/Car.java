class Car {

    // Constructor
    Car() {
        System.out.println("Car object created");
    }

    // Method
    void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Car c = new Car();  // Constructor called
        c.drive();          // Method called
    }
}