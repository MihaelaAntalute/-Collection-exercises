package cursDuminica;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {

        int numbers = countDivisionsBy(2, 2, 8);
        System.out.println(numbers);
        System.out.println(isPalindrome("ana"));
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("aer");
        words.add("Ana");
        words.add("bfb");
        System.out.println(countPalindromesWords(words));


    }

    //Scrie o functie care numara cate numere divizibile cu n se afla in intervalul
// x,y si returneaza valoarea
//TODO
    // int numberToDivide
    // int minInterval = x;
    // int maxInterval = y;
    // int
    public static int countDivisionsBy(int numberToDivide, int minInterval, int maxInterval) {
        int numbersCount = 0;
        for (int i = minInterval; i <= maxInterval; i++) {
            if (i % numberToDivide == 0) {
                numbersCount++;
            }
        }
        return numbersCount;
    }


    //Scrie o functie care numara cate cuvinte palindrome se afla intr-o lista

    public static int countPalindromesWords(List<String> words) {
        int wordsCounted = 0;
        for (String word : words) {
            if (isPalindrome(word)){
                wordsCounted++;
            }
        }
        return wordsCounted;
    }

    public static boolean isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if(word.equals(reverse)){
            return true;
        }
        return false;
    }


}
