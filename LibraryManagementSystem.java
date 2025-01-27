import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book class representing individual books
class Book {
    private String title;
    private String author;
    private boolean available;

    // Constructor to initialize the book
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Getter method for availability status
    public boolean isAvailable() {
        return available;
    }

    // Setter method to change the availability of the book
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

// Library class to manage a collection of books
class Library {
    private List<Book> books;

    // Constructor to initialize the library and the book list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all available books
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }

    // Method to borrow a book by title
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You have successfully borrowed the book: " + book.getTitle());
                    return;
                } else {
                    System.out.println("The book is currently not available for borrowing.");
                    return;
                }
            }
        }
        System.out.println("The book with the title \"" + title + "\" was not found in the library.");
    }

    // Method to return a borrowed book by title
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setAvailable(true);
                System.out.println("You have successfully returned the book: " + book.getTitle());
                return;
            }
        }
        System.out.println("The book with the title \"" + title + "\" was not found in the library.");
    }
}

// Main class for the Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a library object and add some books to it
        Library library = new Library();
        library.addBook(new Book("Python Programming", "Punit"));
        library.addBook(new Book("Computer Networks", "Harsh"));
        library.addBook(new Book("Introduction to Web Development", "Sidhu"));
        library.addBook(new Book("JAVA", "Punit"));
        library.addBook(new Book("Computer Networks", "Arin"));
        library.addBook(new Book("Cloud COmputing", "Sidhu"));

        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Main program loop
        while (true) {
            System.out.println("\n----- Library Management System -----");
            System.out.println("1. Display Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Display available books
                    library.displayAvailableBooks();
                    break;
                case 2:
                    // Borrow a book
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 3:
                    // Return a book
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
