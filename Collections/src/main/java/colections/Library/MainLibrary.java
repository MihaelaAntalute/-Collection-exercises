package colections.Library;

import java.util.HashSet;
import java.util.Set;

public class MainLibrary {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        Book book = new Book("Fata de pe peron", 2021, "Samantha Bailey", "Thriller");
        Book book1 = new Book("Silent night", 2019, "Danielle Steel", "Fiction");
        Book book2 = new Book("Last message", 2021, "Laura Dave", "Thriller");
        Book book3 = new Book("Invisible", 2022, "Danielle Steel", "Contemporary Women");
        Book book4 = new Book("Hello,sunshine", 2017, "Laura Dave", "Humor");
        BookStore bookStore = new BookStore(books);
        bookStore.addBook(book);
        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);
        bookStore.addBook(book4);
        System.out.println("Lista carti: " + books);
        System.out.println("Stergere");
        bookStore.deleteBook(book);
        System.out.println(books);
        System.out.println("Ordonare dupa an ");//ok
        System.out.println(bookStore.getAllBooksOrderedByYear());
        System.out.println("All genres: ");
        System.out.println(bookStore.getAllGenres());
        System.out.println("Order by author: ");
        System.out.println(bookStore.getAllBooksOrderedByAuthor());//nu e ok
        System.out.println(bookStore.getAllBooksByGenre()); //ok
        System.out.println(bookStore.getBooksByGenre("Thriller")); //ok
    }
}
