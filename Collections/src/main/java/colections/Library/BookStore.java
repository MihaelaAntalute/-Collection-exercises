package colections.Library;

import java.util.*;
import java.util.stream.Collectors;

public class BookStore {
    private Set<Book> books;

    public BookStore(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean deleteBook(Book book) {
        books.remove(book);
        return true;
    }


    public List<Book> getAllBooksOrderedByYear() {
       List <Book> booksOrderedByYear = new ArrayList<>();
       booksOrderedByYear.addAll(books);
        Collections.sort(booksOrderedByYear);
        return booksOrderedByYear;
    }

    //ok
    public Set<String> getAllGenres() {
        Set<String> allGenres = new HashSet<>();
        for (Book book : books) {
            allGenres.add(book.getGenre());
        }
        return allGenres;
    }
    //cu java8 & lambda
    public Set <String> getAllGenres1(){
        return books.stream()
                .map(book ->book.getGenre())
                .collect(Collectors.toSet());
    }
    //Va returna un set cu toate genurile existente in colectia de carti

    //nu e ok
    public Set<Book> getAllBooksOrderedByAuthor() {
        Set<Book> booksOrderedByAuthor = new TreeSet<>(new AuthorComparator());
        booksOrderedByAuthor.addAll(books);
        return booksOrderedByAuthor;
    }
    //Va returna un TreeSet care va folosi AuthorComparator pentru a sorta cartile dupa autor

    //ok
    public Map<String,Set<Book>> getAllBooksByGenre(){
        Map<String,Set<Book>> allBooksByGenre = new HashMap<>();
        for (Book book : books) {
            if (!allBooksByGenre.containsKey(book.getGenre())) {
                Set<Book> booksList = new HashSet<>();
                booksList.add(book);
                allBooksByGenre.put(book.getGenre(),booksList);
            }else{
                allBooksByGenre.get(book.getGenre()).add(book);
            }
        }
        return allBooksByGenre;
    }
    //Va construi o mapa, in care cheia este un gen, iar valoarea este set-ul de carti care au acel gen
    //Va returna aceasta mapa (toate genurile, cu toate cartile din fiecare gen)

    public Set<Book> getBooksByGenre(String genre) {
        Map<String, Set<Book>> bookByGenre = getAllBooksByGenre();
        for(Book book : books) {
            if (!bookByGenre.containsKey(book.getGenre())) {
                Set<Book> bookSet = new HashSet<>();
                bookSet.add(book);
            }
        }
        return bookByGenre.get(genre);
    }
    //Va construi o mapa, in care cheia este un gen, iar valoarea este set-ul de carti care au acel gen
    //Va primi ca parametru un gen
    //Va returna toate cartile care au acel gen

}
