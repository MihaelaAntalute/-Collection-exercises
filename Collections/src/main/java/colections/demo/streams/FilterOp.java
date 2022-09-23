package colections.demo.streams;

import colections.demo.streams.helperclasses.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOp {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(23);
        list1.add(45);
        list1.add(6);

        //1. returneaza numerele din lista care sunt mai mari decat x
        //System.out.println(findNumberBiggerThn(list1, 15));

        System.out.println(findNumberBiggerThan1(list1, 15));

        List<String> programmingLanguages = Arrays.asList("Java", "", "scala", "Kotlin", "", "clojure");

        //2. printeaza cate string-uri din lista care incep cu litera mare si care nu sunt goale
//        long count = programmingLanguages.stream()
////                .filter(language -> {
////                    if (!language.isEmpty()) {
////                        if (Character.isUpperCase(language.charAt(0))) {
////                            return true;
////                        }
////                    }
////                    return false;
////                }) ** o varianta1
//                .filter(language -> !language.isEmpty() && Character.isUpperCase(language.charAt(0)))
//                .count();
//        System.out.println(count);
//        long count2 = programmingLanguages.stream()
//                .filter(language -> !language.isEmpty())
//                .filter(language -> Character.isUpperCase(language.charAt(0)))
//                .count();
//        System.out.println(count2);

        System.out.println(printNumbersOfStringsFromList(programmingLanguages));

        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23, "USA"));
        list.add(new Person("Joe", 18, "USA"));
        list.add(new Person("Ryan", 54, "USA"));
        list.add(new Person("Iyan", 5, "USA"));
        list.add(new Person("Ray", 63, "USA"));
        //3. returneaza care sunt persoanele active (cu varsta mai mare decat 18 si mai mica decat 60 de ani)

       // System.out.println(printActivePersons(list));
        System.out.println(printActivePersons2(list));
    }

    //1 varianta lambda
    public static List<Integer> findNumberBiggerThn(List<Integer> list, int x) {
        return list.stream()
                .filter(number -> number > x)
                .collect(Collectors.toList());
    }

    //1 varianta for
    public static List<Integer> findNumberBiggerThan1(List<Integer> list, int number) {
        List<Integer> foundedNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > number) {
                foundedNumbers.add(list.get(i));
            }
        }
        return foundedNumbers;
    }

    //2 varianta lambda
    public static List<Long> printNumbersOfStringsFromList(List<String> programmingLanguages) {
        List<Long> counts = new ArrayList<>();
        long count = programmingLanguages.stream()
                .filter(language -> !language.isEmpty() && Character.isUpperCase(language.charAt(0)))
                .count();
        long count2 = programmingLanguages.stream()
                .filter(language -> !language.isEmpty())
                .filter(language -> Character.isUpperCase(language.charAt(0)))
                .count();
        counts.add(count);
        counts.add(count2);
        return counts;
    }
//2 varianta cu for


    //3
    public static List<Person> printActivePersons(List<Person> list) {
        List<Person> activePersons = list.stream()
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getAge() < 60)
                // .map(person -> person.getName())
                .collect(Collectors.toList());
        return activePersons;
    }
    //3 varianta cu for
    public static List<Person> printActivePersons2(List<Person> list){
        List<Person> foundedPersons = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() > 18 && list.get(i).getAge() < 60){
                foundedPersons.add(list.get(i));
            }
        }
        return foundedPersons;
    }


}


