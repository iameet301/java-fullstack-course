public class SpiceProoduct {
    String brand;
    String name;
    int price;

    // 1. Regular Parameterized Constructor
    public SpiceProoduct(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    // 2. THE COPY CONSTRUCTOR
    
    public SpiceProoduct(SpiceProoduct existingProduct) {
        this.brand = existingProduct.brand; // Copying the brand
        this.name = existingProduct.name;   // Copying the name
        this.price = existingProduct.price; // Copying the price
    }

    public void displayData() {
        System.out.println(brand + " " + name + " - ₹" + price);
    }

    public static void main(String[] args) {
 
        SpiceProoduct originalSpice = new SpiceProoduct("Meer Masala", "Turmeric Powder", 100);
        SpiceProoduct clonedSpice = new SpiceProoduct(originalSpice);

        clonedSpice.price = 130; 
        clonedSpice.name = "Premium Turmeric Powder";

        originalSpice.displayData(); 
        clonedSpice.displayData();   
}
}