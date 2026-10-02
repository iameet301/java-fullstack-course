package polymorphism;

class Product {
    int id;
    
    Product(int id) {
        this.id = id;
    }

    // Custom equals method
    public boolean equals(Product p) {
        return this.id == p.id;
    }


public class Test {
    public static void main(String[] args) {
        Object p1 = new Product(101);
        Object p2 = new Product(101);

        System.out.println(p1.equals(p2));
    }
}
}