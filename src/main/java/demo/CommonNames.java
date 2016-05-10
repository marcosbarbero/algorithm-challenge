package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two lists of names find common names between them.
 *
 * @author Marcos Barbero
 */
public class CommonNames {

    public static void main(String... args) {
        retain();
        set();
        lambda();
    }

    private static List<String> first() {
        List<String> first = new ArrayList<>();
        first.add("Steve");
        first.add("Tony");
        first.add("Thor");
        first.add("Peter");
        first.add("Hulk");
        return first;
    }

    private static List<String> second() {
        List<String> second = new ArrayList<>();
        second.add("Hulk");
        second.add("Carter");
        second.add("Pepper");
        second.add("Tony");
        return second;
    }

    private static void retain() {
        System.out.println("--------------\nCollections retain Version\n--------------");
        final List<String> first = first();
        first.retainAll(second());
        first.forEach(System.out::println);
    }

    private static void set() {
        System.out.println("--------------\nSet Version\n--------------");
        Set<String> first = new HashSet<>(first());
        Set<String> contains = new HashSet<>();
        for (String name : second()) {
            if (first.contains(name)) {
                contains.add(name);
            }
        }

        contains.forEach(System.out::println);
    }

    private static void lambda() {
        System.out.println("--------------\nLambda Version\n--------------");
        Set<String> first = new HashSet<>(first());
        first.stream().filter(name -> second().contains(name)).forEach(System.out::println);
    }
}
