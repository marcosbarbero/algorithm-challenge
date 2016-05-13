package demo;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the duplicated array entry.
 */
public class DuplicatedArrayEntry {

    static final String[] array = {"abc", "dd", "cc", "abc", "123"};

    public static void main(String... args) {
        hashsetSolution();
    }

    static void hashsetSolution() {
        String duplicated = "The duplicated value is: ";
        Set<String> uniques = new HashSet<>();
        for (String value : array) {
            if (uniques.contains(value)) {
                duplicated += value;
                break;
            }
            uniques.add(value);
        }
        System.out.println(duplicated);
    }
}
