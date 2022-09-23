package generics;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("India");
        countries.add("Japonia");
        countries.add("India");//nu se afiseaza k e deja adaugat
        System.out.println(countries);
        System.out.println(countries.contains("Japonia"));
        countries.clear(); //sterge tot
        System.out.println(countries);


    }
}
