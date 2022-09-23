package colections.demo.streams.mapoperations;

import colections.demo.streams.helperclasses.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapOp {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("a", "b", "c"));
        list.add(Arrays.asList("d", "e", "f"));
        list.add(Arrays.asList("g", "h", "i"));
        list.add(Arrays.asList("j", "k", "l"));

        //1. returneaza o lista formata din toate caracterele din lista de liste
        List<String> characters = list.stream()
                .flatMap(caracterList -> caracterList.stream())
                .collect(Collectors.toList());
        System.out.println(characters);

        List<Book> javaBooks = List.of(
                new Book("Java EE 7 Essentials", List.of("Arun Gupta")),
                new Book("Algorithms", List.of("Robert Sedgewick", "Kevin Wayne")),
                new Book("Clean code", List.of("Robert Martin"))
        );

        //2. returneaza o lista cu toti autorii care incep cu o anumita litera, din lista de carti
        System.out.println(getAllAuthorsStartWith(javaBooks, "Ro"));
    }

    public static List<String> getAllAuthorsStartWith(List<Book> javaBooks, String prefix) {
        return javaBooks.stream()
                .flatMap(book -> book.getAuthors().stream())
                .filter(author -> author.startsWith(prefix))
                .collect(Collectors.toList());

    }

//    public static List<Book> getAllBooksByAuthorStartWith(List<Book> javaBooks, String prefix) {
//        return javaBooks.stream()
//                .flatMap(book -> book.getAuthors().stream())
//                .filter(author -> author.startsWith(prefix))
//                .collect(Collectors.toList());
//
//    }

}