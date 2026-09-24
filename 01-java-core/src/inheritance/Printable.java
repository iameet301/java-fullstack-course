package inheritance;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

// Implementing multiple interfaces
class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void show() {
        System.out.println("Showing document preview...");
    }
}

