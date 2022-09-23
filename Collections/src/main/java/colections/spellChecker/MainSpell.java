package colections.spellChecker;

import java.util.*;

public class MainSpell {
    public static void main(String[] args) {
        //Exercise Spell checker
        Set<String> dictionary = new HashSet<>();
        List<String> wordsFromText = new ArrayList<>();
        Scanner console = new Scanner(System.in);

        // citirea dicitionarului
        readDictionary(dictionary, console);

        //citirea textului
        readText(wordsFromText, console);

        //verificarea textului pentru cuvinte eronate
        System.out.println(findBadWords(dictionary, wordsFromText));

    }

    public static Set<String> findBadWords(Set<String> dictionary, List<String> wordsFromText) {
        Set<String> badWords = new HashSet<>();
        for (String word : wordsFromText) {
            if (!dictionary.contains(word)) {
                badWords.add(word);
            }
        }
        return badWords;
    }

    public static Set<String> readDictionary(Set<String> dictionary, Scanner console) {
        System.out.println("Introduceti nr de cuvinte din dictionar");
        int number = Integer.parseInt(console.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Introduceti urmatorul cuvant: ");
            String word = console.nextLine();
            dictionary.add(word);
        }
        return dictionary;
    }

    public static List<String> readText(List<String> wordsFromText, Scanner console) {
        System.out.println("Introduceti numarul de linii: ");
        int numberOfLines = Integer.parseInt(console.nextLine());
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Introduceti urmatoarea linie: ");
            String line = console.nextLine();
            String[] words = line.split(" ");
            for (int j = 0; j < words.length; j++) {
                wordsFromText.add(words[j]);
            }
        }
        return wordsFromText;
    }

}
