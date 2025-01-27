# Library Management System

This is a simple **Library Management System** implemented in Java. The system allows users to:
- View available books in the library.
- Borrow books.
- Return borrowed books.

## Features
- **Add Book**: Add books to the library.
- **Display Available Books**: View the list of available books that are not currently borrowed.
- **Borrow a Book**: Borrow a book if it is available.
- **Return a Book**: Return a borrowed book.
- **Exit**: Exit the system.

## Requirements
- Java 8 or above is required to run this program.

## How to Run

1. **Clone the repository** or **download the code**.
2. Open a terminal or command prompt.
3. Compile the Java file:
   
   javac LibraryManagementSystem.java
   ```
4. Run the compiled Java program:
   ```bash
   java LibraryManagementSystem
   ```

## Classes Overview

### `Book`
This class represents a book in the library. It contains the following fields:
- `title`: Title of the book.
- `author`: Author of the book.
- `available`: A boolean flag to indicate whether the book is available for borrowing.

### Methods:
- `getTitle()`: Returns the title of the book.
- `getAuthor()`: Returns the author of the book.
- `isAvailable()`: Returns whether the book is available for borrowing.
- `setAvailable(boolean available)`: Sets the availability of the book.

### `Library`
This class represents the library itself and manages the collection of books.

### Methods:
- `addBook(Book book)`: Adds a book to the library.
- `displayAvailableBooks()`: Displays all available books.
- `borrowBook(String title)`: Allows borrowing a book by its title.
- `returnBook(String title)`: Allows returning a borrowed book.

### `LibraryManagementSystem`
This is the main class that runs the Library Management System program. It interacts with the user and allows them to choose from the following options:
1. Display Available Books
2. Borrow a Book
3. Return a Book
4. Exit the Program

## Example Usage


----- Library Management System -----
1. Display Available Books
2. Borrow a Book
3. Return a Book
4. Exit
Enter your choice: 1
Available Books:
Title: Python Programming, Author: Punit
Title: Computer Networks, Author: Harsh
Title: Introduction to Web Development, Author: Sidhu

Enter your choice: 2
Enter the title of the book to borrow: Python Programming
You have successfully borrowed the book: Python Programming

Enter your choice: 3
Enter the title of the book to return: Python Programming
You have successfully returned the book: Python Programming

Enter your choice: 4
Exiting the program...
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

```

### Explanation:
1. **Project Overview**: Brief description of what the project does.
2. **Features**: Outlines the functionality available in the Library Management System.
3. **Requirements**: The Java version required to run the program.
4. **How to Run**: Steps to clone, compile, and run the program.
5. **Classes Overview**: Describes the classes used in the program and their key methods.
6. **Example Usage**: Shows how the program works when executed.
7. **License**: A typical MIT license section for open source projects.

This README should help users understand how to use and interact with the Library Management System.
