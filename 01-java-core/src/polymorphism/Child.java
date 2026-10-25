package polymorphism;

class Child extends Parent {
    public static void display() {
        System.out.println("Child Static");
    }
    @Override
    public void show() {
        System.out.println("Child Instance");
    }
}