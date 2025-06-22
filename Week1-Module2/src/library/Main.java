
package library;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of books
        List<Book> books = Arrays.asList(
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "Moby Dick", "Herman Melville"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "To Kill a Mockingbird", "Harper Lee"),
            new Book(5, "The Catcher in the Rye", "J.D. Salinger")
        );

        // Sort books by title for binary search (necessary)
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        // Linear Search Test
        System.out.println("Linear Search for '1984':");
        Book foundBook = LibraryManagementSystem.linearSearchByTitle(books, "1984");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Binary Search Test
        System.out.println("\nBinary Search for '1984':");
        Book binaryFoundBook = LibraryManagementSystem.binarySearchByTitle(books, "1984");
        if (binaryFoundBook != null) {
            System.out.println("Found: " + binaryFoundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Try searching for a non-existing book
        System.out.println("\nLinear Search for 'The Hobbit':");
        Book notFoundBook = LibraryManagementSystem.linearSearchByTitle(books, "The Hobbit");
        if (notFoundBook != null) {
            System.out.println("Found: " + notFoundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
