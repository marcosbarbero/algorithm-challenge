package demo;

/**
 * @author Marcos Barbero
 */
public class Palindrome {

    public static void main(String... args) {
        reverse("ovo");
        reverse("palindrome");

        reverseWithBuilder("madam");
        reverseWithBuilder("hulk");
    }

    private static void reverse(String word) {
        StringBuilder reverse = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }
        if (word.equals(reverse.toString())) {
            System.out.printf("%s: is a palindrome.\n", word);
        } else {
            System.out.printf("%s: is not a palindrome\n", word);
        }
    }

    private static void reverseWithBuilder(String word) {
        final StringBuilder reverse = new StringBuilder(word).reverse();
        if (word.equals(reverse.toString())) {
            System.out.printf("%s: is a palindrome.\n", word);
        } else {
            System.out.printf("%s: is not a palindrome\n", word);
        }
    }
}
