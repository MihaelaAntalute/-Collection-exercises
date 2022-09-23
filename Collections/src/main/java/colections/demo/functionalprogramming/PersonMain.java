package colections.demo.functionalprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 23));
        persons.add(new Person("Ana", 60));
        persons.add(new Person("Mihai", 45));

        //am pasat metodei sort() o expresie lambda care implementeaza metoda compare() din interfata functionala Comparator
        persons.sort((Person p1, Person p2) -> {
            return Integer.valueOf(p1.getAge()).compareTo(Integer.valueOf(p2.getAge()));
        });
        System.out.println(persons);

        //am pasat metodei forEach() o expresie lambda care implementeaza metoda accept() din interfata functionala Consumer
        persons.forEach(p -> System.out.println(p));
    }
}
