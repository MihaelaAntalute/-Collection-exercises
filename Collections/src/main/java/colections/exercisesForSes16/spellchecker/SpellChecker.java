package colections.exercisesForSes16.spellchecker;

import java.util.*;

public class SpellChecker {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        List<String> wordsFromText = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.print("Number of words in dictionary: ");
        int number = Integer.parseInt(console.nextLine());

        for (int i = 0; i < number; i++) {
            System.out.print("Enter next word: ");
            String word = console.nextLine();
            dictionary.add(word);
        }

        System.out.println("Words in dictionary are: " + dictionary);
        System.out.print("Enter number of lines: ");
        int numberOfLines = Integer.parseInt(console.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            System.out.print("Enter next line: ");
            String line = console.nextLine();
            String[] words = line.split(" ");
            for (int j = 0; j < words.length; j++) {
                wordsFromText.add(words[j]);
            }
        }

        System.out.println("Words form text are: " + wordsFromText);
        System.out.println("Bad words are: " + findBadWords(dictionary, wordsFromText));
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
}
