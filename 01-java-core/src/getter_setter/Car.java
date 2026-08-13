package getter_setter;

public class Car {
    // Instance variables (default visibility so Object Reference test works)
    int price;
    String model;

    // 1. No-Argument Constructor (Needed for Setter and Object Reference tests)
    public Car() {
    }

    // 2. Parameterized Constructor (Needed for Constructor test)
    public Car(int price, String model) {
        this.price = price;
        this.model = model;
    }

    // 3. Getters and Setters (Needed for Setter test)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // 4. toString Method (Allows you to print the object directly: System.out.println(c1))
    @Override
    public String toString() {
        return "Car [Price=" + price + ", Model=" + model + "]";
    }
}