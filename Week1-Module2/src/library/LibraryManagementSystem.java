
package library;

import java.util.List;

public class LibraryManagementSystem {

    // Linear Search for books by title
    public static Book linearSearchByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; // Book found
            }
        }
        return null; // Book not found
    }
    
    public static Book binarySearchByTitle(List<Book> books, String title) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Book midBook = books.get(mid);
            
            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook; // Book found
            }
            if (comparison < 0) {
                low = mid + 1; // Search the right half
            } else {
                high = mid - 1; // Search the left half
            }
        }
        return null; // Book not found
    }
}
