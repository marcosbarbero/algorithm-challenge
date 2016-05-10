package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Marcos Barbero
 */
public class Anagrams {

    /**
     * Checks if an string contains an anagram of another.
     */
    static class Contains {
        static final String plain = "coding interview questions";
        static final String anagram = "weivretni";

        public static void main(String... args) {
            String[] words = plain.split(" ");
            for (String word : words) {
                if (word.length() != anagram.length()) {
                    continue;
                }

                solveSorting(word);
                solveMapping(word);
            }
        }

        /**
         * Solve the problem mapping the letter occurrences in both words into a ${@link java.util.HashMap<K,V>}.
         */
        private static void solveMapping(String word) {
            char[] word1 = word.toCharArray();
            char[] word2 = anagram.toCharArray();
            boolean isAnagram = true;

            Map<Character, Integer> lettersInWord1 = new HashMap<>();

            for (char c : word1) {
                int count = 1;
                if (lettersInWord1.containsKey(c)) {
                    count = lettersInWord1.get(c) + 1;
                }
                lettersInWord1.put(c, count);
            }

            for (char c : word2) {
                int count = -1;
                if (lettersInWord1.containsKey(c)) {
                    count = lettersInWord1.get(c) - 1;
                }
                lettersInWord1.put(c, count);
            }

            for (char c : lettersInWord1.keySet()) {
                if (lettersInWord1.get(c) != 0) {
                    isAnagram = false;
                }
            }

            if (isAnagram) {
                System.out.println("'" + anagram + "' is anagram of '" + word + "'");
            }
        }

        /**
         * Solve the problem sorting the words of same size, not the better approach in case of a phrase with whitespaces.
         */
        private static void solveSorting(final String word) {
            final char[] word1 = word.toCharArray();
            final char[] anagram1 = anagram.toCharArray();
            Arrays.sort(word1);
            Arrays.sort(anagram1);
            if (Arrays.equals(word1, anagram1)) {
                System.out.println("'" + anagram + "' is anagram of '" + word + "'");
            }
        }
    }

    String[] input = {"cat", "dog", "act", "door", "odor"};
}
