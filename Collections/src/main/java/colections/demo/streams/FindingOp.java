package colections.demo.streams;

import colections.demo.streams.helperclasses.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingOp {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23, "India"));
        list.add(new Person("Joe", 18, "USA"));
        list.add(new Person("Ryan", 54, "Canada"));
        list.add(new Person("Iyan", 5, "India"));
        list.add(new Person("Ray", 63, "China"));
        //1. printeaza prima persoana gasita din lista care este din India
//       Optional<Person> foundFirstPerson = list.stream()
//                .filter(person -> person.getCountry().equals("India"))
//                .findFirst();
//        System.out.println(foundFirstPerson.orElse(new Person()));
        //getFirstPerson("India", list);
        System.out.println("First Person");
        System.out.println(findFirstPerson("India",list));
    }

    public static Optional<Person> getFirstPerson(String countryName, List<Person> personList) {
        Optional<Person> foundFirstPerson = personList.stream()
                .filter(person -> person.getCountry().equals(countryName))
                .findFirst();
        System.out.println(foundFirstPerson.orElse(new Person()));
        return foundFirstPerson;
    }

    public static List<Person> findFirstPerson(String countryName, List<Person> personList) {
        List<Person> foundedPerson = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if (countryName.equals(personList.get(i).getCountry())) {
                foundedPerson.add(personList.get(i));
            }
        }
        return foundedPerson;
    }
}
