package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two lists of names find common names between them.
 *
 * @author Marcos Barbero
 */
public class CommonNames {

    static List<String> first = new ArrayList<>();
    static List<String> second = new ArrayList<>();

    static {
        first.add("Steve");
        first.add("Tony");
        first.add("Thor");
        first.add("Peter");
        first.add("Hulk");

        second.add("Hulk");
        second.add("Carter");
        second.add("Pepper");
        second.add("Tony");
    }

    public static void main(String... args) {
        first.retainAll(second);
        first.forEach(System.out::println);
    }
}
