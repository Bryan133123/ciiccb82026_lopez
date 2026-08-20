// Definition of the Book class
class Book {
    // Attributes
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor to initialize all four attributes
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Overridden toString() method to match the required Sample Output format
    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}

// Separate class with the main method to run the program
public class Task11 {
    public static void main(String[] args) {
        // 1. Instantiating 3 Book objects with different values
        Book book1 = new Book("Java Programming", "Bryan Lopez", 2026, 39.99);
        Book book2 = new Book("Python Basics", "John Zepol", 2025, 29.99);
        Book book3 = new Book("C++ Essentials", "Nayrb John", 2024, 49.99);

        // 2. Printing each book's details using toString()
        System.out.println("Book 1:");
        System.out.println(book1);
        System.out.println(); // Prints a blank line between books

        System.out.println("Book 2:");
        System.out.println(book2);
        System.out.println();

        System.out.println("Book 3:");
        System.out.println(book3);
    }
}
