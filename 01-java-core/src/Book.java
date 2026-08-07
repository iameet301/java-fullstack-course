class Book {
    String title;
    int pages;

    // 1. Parameterized Constructor
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // 2. Copy Constructor
    public Book(Book sourceBook) {
        this.title = sourceBook.title;
        this.pages = sourceBook.pages;
    }


    public static void main(String[] args) {
        // Create the first book using the regular constructor
        Book book1 = new Book("Java Basics", 350);
        
        // Create the second book using the copy constructor
        Book book2 = new Book(book1); 
        
        System.out.println("Book 1: " + book1.title + " (" + book1.pages + " pages)");
        System.out.println("Book 2: " + book2.title + " (" + book2.pages + " pages)");
    }
}