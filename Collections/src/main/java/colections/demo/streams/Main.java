package colections.demo.streams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,7,2,10);
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > 5){
                count ++;
            }
        }
        System.out.println(count);
     //Predicate
      Long numbersCount =  numbers.stream()
                .filter(number -> number > 5)
                .count();
        System.out.println(numbersCount);

        List<String> companies = Arrays.asList("Google","Amazon","google","amazon","Oracle");

        //parcurgem lista
        //transformam cuvantul in litere mari
        //adaugam in set
        companies.stream()
                .map(company -> company.toUpperCase())
                .peek(x->System.out.println(x + " "))
                .distinct()
                .peek(x-> System.out.println(x +" "))
                .forEach(company -> System.out.println(company));

        System.out.println(companies);

    }
}
