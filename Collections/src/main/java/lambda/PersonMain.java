package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 34));
        personList.add(new Person("Ana", 60));
        personList.add(new Person("Mircea", 14));
        personList.sort(new NameComparator());
        System.out.println(personList);
        personList.sort((x, y) -> Integer.valueOf(x.getAge()).compareTo(Integer.valueOf(y.getAge())));
        System.out.println(personList);

//        for (Person p: personList){
//            System.out.println(p);
//            //alte chestii
//        }
        personList.forEach(p -> System.out.println(p));

        //personList.remove(1);
        //System.out.println(personList);

        //TODO stergeti din lista persoanele cu varsta mai mare decat 50
        //personList.remove(x -> x > 50)



         // TODO 2.O persoana este caracterizata de nume si varsta.
        //Scrie o metoda statica numita isPersonEligibleForVoting(),
        // care accepta ca parametru o persoana si un predicat. Metoda va testa acel predicat.
        // Atunci cand apelezi metoda isPersonEligibleForVoting(), va trebui sa ii pasezi o persoana si o expresie lambda
        // (care verifica daca o persoana are varsta mai mare decat 18 ani) ca parametrii.

        //TODO 3.Sterge persoanele care nu pot vota
        //Avand o lista de persoane, sterge din lista persoanele care au varsta mai mica decat 18 ani, folosind expresii lambda.

    }


}
