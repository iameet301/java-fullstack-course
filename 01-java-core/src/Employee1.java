class Employee1 {

    // Constructor
    Employee1() {
        System.out.println("Employee object created");
    }

    // Method
    void work() {
        System.out.println("Employee is working");
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1();  // Constructor called
        e.work();                     // Method called
    }
}