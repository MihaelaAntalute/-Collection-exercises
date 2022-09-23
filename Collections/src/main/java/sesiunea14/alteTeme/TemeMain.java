package sesiunea14.alteTeme;

import java.util.*;

public class TemeMain {
    public static void main(String[] args) {
        //Ses 14
        //Exercitiul 5
        //Primeste ca parametru o lista de numere, care are un element duplicat
        //Returneaza elementul duplicat
        //HINT (alt mod de rezolvare decat cel clasic): metoda add din interfata Set returneaza false,
        // daca nu poate adauga elementul primit ca parametru in set
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(8);
        System.out.println(numbers);
        System.out.println(returnDuplicateNumber(numbers));

        //Exercitiul 6
//Afiseaza cel mai mic si cel mai mare element din lista
//HINT (alt mod de rezolvare decat cel clasic): adauga toate elementele din lista intr-un treeset,
// apoi apeleaza metodele first() si last() pe acel treeset

        System.out.println("Exercitiul 6");
        TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(2);
        numbers1.add(1);
        numbers1.add(6);
        numbers1.add(9);
        numbers1.add(4);
        numbers1.add(8);
        System.out.println(numbers1);
        System.out.println("Cel mai mic numar: "+ numbers1.first());
        System.out.println("Cel mai mare numar: " + numbers1.last());



    }

    public static Integer returnDuplicateNumber(List<Integer> numbers) {
        Set<Integer> numbers2 = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
           boolean result =  numbers2.add(numbers.get(i));
            if(result == false){
                return numbers.get(i);
            }
        }
        return 0;
    }
}
