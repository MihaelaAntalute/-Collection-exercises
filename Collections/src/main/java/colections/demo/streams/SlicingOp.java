package colections.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SlicingOp {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("India");
        countries.add("UK");
        countries.add("China");
        //1. printeaza tarile din lista, fara sa se repete
        System.out.println(printAllCountries(countries));
        //2. printeaza 3 tari din lista, fara sa se repete
//        Set<String> firstThreeCountries = countries.stream()
//                .limit(3)
//                .collect(Collectors.toSet());
//        System.out.println(firstThreeCountries);
        System.out.println(printFirstCountries(3,countries));
    }

    //1
    public static Set <String> printAllCountries(List<String> countryList) {
        Set<String> firstThreeCountries = countryList.stream()
                .collect(Collectors.toSet());
        return firstThreeCountries;
    }
       //2
        public static Set<String> printFirstCountries(int limit,List<String>countryList){
            Set<String> firstThreeCountries = countryList.stream()
                    .limit(limit)
                    .collect(Collectors.toSet());
        return firstThreeCountries;
        }

    }

