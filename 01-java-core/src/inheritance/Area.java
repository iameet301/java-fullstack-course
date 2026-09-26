package inheritance;

public class Area {
   double pi=3.14;
   
   //Square area
    int area(int side) {
        return side * side;
        
    }

    // Rectangle  area
    int area(int length, int side) {
        return length * side;
    }

    // Circle area
    double area(double radius) {
        return pi * radius * radius;
    }
    //triangle area
    double area(float base, float height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Area shape = new Area();

        System.out.println("Square: " + shape.area(5));
        System.out.println("Rectangle: " + shape.area(10, 4));
        System.out.println("Circle: " + shape.area(7.0));
        System.out.println("Triangle: " + shape.area(6.0f, 3.0f));
    }
}
