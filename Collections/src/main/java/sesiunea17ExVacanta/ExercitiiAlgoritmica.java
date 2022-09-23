package sesiunea17ExVacanta;

import java.util.*;
import java.util.stream.Collectors;

public class ExercitiiAlgoritmica {
    public static void main(String[] args) {


        //1. Afla profitul maxim pe care il poti face cumparand si vanzand actiuni.
        //Ca si input ai un array cu preturile unei actiuni in fiecare zi.
        // Va trebui sa determini in ce zi trebuie sa cumperi si in ce zi trebuie sa vinzi ca sa obtii profitul maxim
        //Exemplu:
        //Input: [100, 180, 260, 310, 40, 535, 695]
        //Output: Cumpara in ziua 5 (la pretul de 40) si vinde in ziua 7 (la pretul de 695), adica profit maxim 695-40=655
        //Input2: [2, 3, 10, 6, 4, 8, 1]
        //Output: Cumpara in ziau 0 (la pretul de 2) si vinde in ziua 2 (la pretul de 10), adica profit maxim 10-2=8

        List<Integer> prices = new ArrayList<>();
        prices.add(100);
        prices.add(180);
        prices.add(260);
        prices.add(310);
        prices.add(40);
        prices.add(535);
        prices.add(695);
        System.out.println(prices);
        System.out.println(getMaxProfit(prices));


        //2. Inlocuieste fiecare element dintr-un array cu produsul tuturor celorlalte elemente
        //Exemplu:
        //Input: { 1, 2, 3, 4, 5 }
        //Output: { 120, 60, 40, 30, 24 }
        //(hint: foloseste un alt array in care sa pui rezultatul)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println(getProductOfTheOthersNumbers(numbers));

        //3.Sa se verifice daca un array contine duplicate
        //Exemplu:
        //Input: [6,5,6,2,3,1]
        //Output: true, pentru ca 6 apare de doua ori
        //
        //(hint: construieste o mapa care sa numere de cate ori apare fiecare element din lista)
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(6);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(1);
        System.out.println(numbers2);
        System.out.println(findIfArrayHaveDuplicate(numbers2));

        //4. Sunt afisate n-1 numere dintr-un interval de la 1 la n. Sa se gaseasca numarul care lipseste.
        //Exemplu:
        //Input: n=7, a=[3,2,1,6,5,7]
        //Output: 4 - lipseste doar 4 din array.
        //
        //(hint: sorteaza array-ul si verifica daca gasesti o diferenta de 2 intre 2 elemente consecutive.
        // Un gasesti diferenta, acolo va fi si numarul care lipseste. Gandeste-te apoi si la alta metoda de rezolvare)

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(7);
        System.out.println(list);
        System.out.println(getNumberMissed(list));
        System.out.println("Map" + findMissedNumber(list, 7));
        //5. Grupeaza elementele dintr-un array astfel incat elementele duplicate sa fie unul langa altul
        //Exemplu:
        //Input: { 1, 2, 3, 1, 2, 1 }
        //Output: { 1, 1, 1, 2, 2, 3 }
        //
        //(hint: construieste o mapa in care cheia este elementul, iar valoarea de cate ori apare.
        // Apoi construieste rezultatul parcurgand mapa si adaugand elementele unul dupa altul intr-un nou array,
        // in functie de mumarul de aparitii al fiecarui element)

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(1);
        System.out.println(list2);
        System.out.println(getDuplicateElementsOneAfterAnother(list2));


        //Ex6
        //6.Verifica daca un String poate fi derivat din alt String rotindu-l circular.
        //Exemplu:
        //Input: s1 = abcd
        //          s2 = dabc
        //Ouput: true, pentru ca s2 poate fi derivat din s1, rotind-se cu o unitate
        //1.rotesc
        //2.compar
        String word = "abcd";
        String rotatedWord = "";
//        for (int i = 1; i < word.length() ; i++) {
//              rotatedWord += word.charAt(i);
//        }
        rotatedWord =
                //rotatedWord+= word.charAt(0);
                word = word.substring(1) + word.charAt(0);
        System.out.println(word);
        String s1 = "abcd";
        String s2 = "dabc";
        System.out.println(areCircularRotated(s1,s2));
        String s = "abcd";
        String concateneted = s+s;
        if(concateneted.contains(s2)){
            System.out.println("rotated");
        }


    }

    //Ex 1:
    public static int getMaxProfit(List<Integer> prices) {
        //1.parcurgem lista ca sa gasim ziua cu pretul maxim
        //2.parcurgem lista (pana la ziua cu pretul maxim) ca sa gasim ziua cu pretul minim
        //3.calculam profitul
        int maxPrice = 0;
        int dayWithMaxPrice = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) > maxPrice) {
                maxPrice = prices.get(i);
                dayWithMaxPrice = i;
            }
        }

        for (int i = 0; i < dayWithMaxPrice; i++) {
            if (prices.get(i) < minPrice) {
                minPrice = prices.get(i);
            }
        }

        return maxPrice - minPrice;
    }

    //Ex 2 ok
    //1.parcurgem lista de numere
    //2.in locul primului element punem rezultatul produsului celorlalte elemente si
    // tot asa pana parcurgem toate elementele;adaugam rezultatele produselor intr-o alta lista si o returnam

    public static List<Integer> getProductOfTheOthersNumbers(List<Integer> numbers) {
        List<Integer> productNumbers = new ArrayList<>();
        int product = 1;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (i != j) {
                    product = product * numbers.get(j);
                }
            }
            productNumbers.add(product);
            product = 1;
        }
        return productNumbers;
    }

    //Ex 3 ok
    public static boolean findIfArrayHaveDuplicate(List<Integer> numbersList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : numbersList) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
                return true;
            }
        }
        return false;
    }

    //Ex 4 ok
    public static Integer getNumberMissed(List<Integer> list) {
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) == 2) {
                return list.get(i) + 1;
            }
        }
        return 0;
    }

    public static Integer findMissedNumber(List<Integer> list, int n) {
        Map<Integer, Integer> map = new HashMap<>();
//        for (int number = 1; number <= n; number++) {
//            if(!map.containsKey(number)){
//                map.put(number,0);
//            }
//        }
        for (Integer number : list) {
            map.put(number, 1);
        }
        for (int number = 1; number <= n; number++) {
            if (map.containsKey(number)) {
                return number;
            }
        }
        return 0;
    }


    //Ex 5 ok
    public static List<Integer> getDuplicateElementsOneAfterAnother(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : list) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }
        //System.out.println(map);
        List<Integer> numbersListOneAfterAnother = new ArrayList<>();
        for (Integer number : map.keySet()) {
            for (int i = 1; i <= map.get(number); i++) {
                numbersListOneAfterAnother.add(number);
            }
        }
        return numbersListOneAfterAnother;
    }
   //Ex6
    public static boolean areCircularRotated(String s1, String s2) {
        for (int i = 0; i < s1.length() - 1; i++) {
            s1 = s1.substring(1) + s1.charAt(0);
            if (s1.equals(s2)) {
                return true;
            }
        }
        return false;
    }



}
