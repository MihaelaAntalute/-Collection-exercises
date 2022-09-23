package colections.demo.streams;

import colections.demo.streams.helperclasses.Person;

import java.util.ArrayList;
import java.util.List;

public class MatchingOp {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23, "India"));
        list.add(new Person("Joe", 18, "USA"));
        list.add(new Person("Ryan", 54, "Canada"));
        list.add(new Person("Iyan", 5, "India"));
        list.add(new Person("Ray", 63, "China"));
        //1. verifica daca lista de persoana contine cel putin o persoana din Canada
//        boolean isAnyPerson =list.stream()
//        .anyMatch(person -> person.getCountry().equals("Canada"));
//        System.out.println(isAnyPerson);
        System.out.println(isAnyPersonFrom("Canada", list));
        System.out.println(isAnyPersonFrom2("Canada",list));
        //2. verifica daca toate persoanele din lista sunt din Canada
        System.out.println(isAllPersonFrom("Canada", list));
        System.out.println(isAllPersonFrom2("Canada",list));
        //3. verifica daca nu exista nicio persoana din Rusia
        System.out.println(isNotPersonFrom("Rusia",list));
        System.out.println(isNotPersonFrom2("Rusia",list));
    }

    public static boolean isAnyPersonFrom(String countryName, List<Person> personList) {
        return personList.stream()
                .anyMatch(person -> person.getCountry().equals(countryName));
    }
//1 varianta cu for
    public static boolean isAnyPersonFrom2(String countryName, List<Person> personList){
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getCountry().contains(countryName)){
                return true;
            }
        }
        return false;
    }
    //2
    public static boolean isAllPersonFrom(String countryName, List<Person> personList) {
        return personList.stream()
                .allMatch(person -> person.getCountry().equals(countryName));
    }
    //2 var cu for
    public static boolean isAllPersonFrom2(String countryName, List<Person> personList){
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getCountry().equals(countryName)){
                return false;
            }
        }
        return true;
    }//3
    public static boolean isNotPersonFrom(String countryName,List<Person> personList){
        return personList.stream()
                .noneMatch(person -> person.getCountry().equals(countryName));
    }
    //3 varianta cu for
    public static boolean isNotPersonFrom2(String countryName,List<Person> personList){
        for (int i = 0; i < personList.size(); i++) {
            if(!personList.get(i).getCountry().equals(countryName)){
                return true;
            }
        }
        return false;
    }
}

