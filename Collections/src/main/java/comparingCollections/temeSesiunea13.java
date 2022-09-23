package comparingCollections;

import java.util.*;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class temeSesiunea13 {
    public static void main(String[] args) {
        System.out.println("Exercitiul 1");
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        System.out.println(numbersList);
        System.out.println(calculatePower(numbersList));

        System.out.println("Exercitiul 2");
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("are");
        words.add("mere");
        System.out.println(words);
        System.out.println(findLongastWord(words));

        System.out.println("Exercitiul 3");
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(-2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(4);
        numbers1.add(-5);
        System.out.println(numbers1);
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(-7);
        numbers2.add(2);
        System.out.println(numbers2);
        System.out.println(searchPositiveNumbers(numbers1, numbers2));

        System.out.println("Exercitiul 4 ");
        List<String> wordsList = new ArrayList<>();
        wordsList.add("ana");
        wordsList.add("nu");
        wordsList.add("are");
        wordsList.add("mere");
        System.out.println(wordsList);
        System.out.println(getReversedWords(wordsList));

        System.out.println("Exercitiul 5");
        Set<String> set1 = new HashSet<>();
        set1.add("ana");
        set1.add("are");
        set1.add("mere");
        System.out.println(set1);
        Set<String> set2 = new HashSet<>();
        set2.add("ana");
        set2.add("are");
        //set2.add("mere");
        System.out.println(set2);
        System.out.println(searchSuperset(set1, set2));

        System.out.println("Exercitiul 6");
        List<String> listWords = new ArrayList<>();
        listWords.add("ana");
        listWords.add("are");
        listWords.add("mere");
        listWords.add("are");
        System.out.println(listWords);
        System.out.println(getNumberOfAppearancesByWord(listWords));

    }
    //1.Scrie o metoda care:
    //primeste ca si parametru o lista de numere si
    // returneaza o alta lista de numere formata din numerele din lista primita ca parametru,
    // ridicate la patrat (puteti folosi Math.pow(2) pentru a ridica la patrat)
    //Exemplu:
    //Input: {2,3,4,5}
    //Output: {4,9,16,25} OK

    public static List<Double> calculatePower(List<Integer> numbersList) {
        List<Double> numbersPower = new ArrayList<>();
        for (Integer number : numbersList) {
            double square = Math.pow(number, 2);
            numbersPower.add(square);
        }
        return numbersPower;
    }

    //2.Scrie o metoda care:
    //Gaseste cuvantul cel mai lung dintr-o lista de cuvinte (primita ca parametru), si il returneaza
    //Exemplu:
    //Input: {“ana”, “are”, “mere”}
    //Output: “mere”   OK
    public static String findLongastWord(List<String> words) {
        String maxWord = "";
        for (int i = 0; i < words.size(); i++) {
            if (maxWord.length() < words.get(i).length()) {
                maxWord = words.get(i);
            }
        }
        return maxWord;
    }


    //3.Scrie o metoda care:
    //Primeste ca parametru 2 liste de numere si returneaza un set format din numerele pozitive din
    // ambele liste primite ca parametru
    //Exemplu:
    //Input: {1, -2, 3, 4, 4, -5}, {1, -7, 2}
    //Output: {1, 3, 4, 2} OK
    public static Set<Integer> searchPositiveNumbers(List<Integer> numbers1, List<Integer> numbers2) {
        Set<Integer> positiveNumbers = new HashSet<>();
        for (int i = 0; i < numbers1.size(); i++) {
            for (int j = 0; j < numbers2.size(); j++) {
                if (numbers1.get(i) > 0 && numbers2.get(j) > 0) {
                    positiveNumbers.add(numbers1.get(i));
                    positiveNumbers.add(numbers2.get(j));
                }
            }
        }
        return positiveNumbers;
    }

    //4.Scrie o metoda care:
    //Primeste ca si parametru o lista de cuvinte si returneaza lista de cuvinte inversata,
    // cu mentiunea ca lista inversata nu va include cuvintele care au lungimea mai mica decat 3
    //Exemplu:
    //Input: {“ana”, “nu”, “are”, “mere”}
    //Output: {“mere”, “are”, “ana”}
    public static List<String> getReversedWords(List<String> wordList) {
        List<String> reversedWords = new ArrayList<>();
        for (int i = wordList.size() - 1; i >= 0; i--) {
            if (wordList.get(i).length() >= 3) {
                reversedWords.add(wordList.get(i));
            }

        }
//        for (String word : wordList) {
//            if (word.length() >= 3) {
//                reversedWords.add(word);
//            }
//        }
        return reversedWords;
    }
    //5.Scrie o metoda care:
    //Primeste ca parametru doua set-uri si returneaza true
    // daca primul set primit ca parametru este superset al celui de-al doilea set
    //Un set “set1” este superset al altui set “set2”, daca “set1” contine toate elementele din “set2”,
    // dar seturile nu sunt egale   - containsAll()
    //Exemple:
    //Input1: {“ana”, “are”, “mere”}, {“ana”, “are”}
    //Output1: true
    //Input2: {“ana”, “are”, “mere”}, {“ana”, “are”, “mere”}
    //Output2: false OK

    public static Boolean searchSuperset(Set<String> set1, Set<String> set2) {
        if (set1.containsAll(set2) && (!set1.equals(set2))) {
            return true;
        }
        return false;
    }

    //6.Scrie o metoda care:
    //Primeste ca parametru o lista de cuvinte si returneaza de cate ori apare fiecare cuvant in lista
    //Exemplu:
    //Input: {“ana”, “are”, “mere”, “are”}
    //Output: {ana=1, are=2, mere=1}  OK
    public static Map<String, Integer> getNumberOfAppearancesByWord(List<String> listWords) {
        Map<String, Integer> showHowTimes = new HashMap<>();
        for (String word : listWords) {
            if (!showHowTimes.containsKey(word)) {
                showHowTimes.put(word, 1);
            } else {
                showHowTimes.put(word, showHowTimes.get(word) + 1);
            }
        }
        return showHowTimes;
    }

}