// Have the function ArrayChallenge(str) take the str parameter and determine how many anagrams exist in the string.
// An anagram is a new word that is produced from rearranging the characters in a different word, for example: cars and arcs are anagrams.
// Your program should determine how many anagrams exist in a given string and return the total number.
// For example: if str is "cars are very cool so are arcs and my os" then your program should return 2
// because "cars" and "arcs" form 1 anagram and "so" and "os" form a 2nd anagram.
// The word "are" occurs twice in the string but it isn't an anagram because it is the same word just repeated.
// The string will contain only spaces and lowercase letters, no punctuation, numbers, or uppercase letters.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = scanner.nextLine().toLowerCase();
        String[] words = text.split(" ");

        Set<String> specialWords = new HashSet<>(Arrays.asList(words));

        Set<String> specialWordsSort = specialWords.stream()
                .map(Anagrams::stringSort)
                .collect(Collectors.toSet());
        int numberOfAnagrams = specialWords.size() - specialWordsSort.size();

        System.out.print("\nNumber of anagrams: " + numberOfAnagrams);
    }

    public static String stringSort(String enterSentence) {
        char [] wordSort = enterSentence.toCharArray();
        Arrays.sort(wordSort);

        return new String(wordSort);
    }


}
