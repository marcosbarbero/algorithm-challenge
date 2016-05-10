package demo;

/**
 * Algorithm to convert a number entry to a custom base.
 * <p>
 * E.g:
 * Base10: 0 | 1 | 2 | 3 | 4 | 5 | 6
 * Base7:  0 | a | t | l | s | i | n
 */
public class CustomBaseConverter {
    static final char[] ALPHABET = "0atlsin".toCharArray();
    static final Long BASE = 7L;

    static String convert(final Long input) {
        Long index = input % BASE;
        String result = String.valueOf(ALPHABET[index.intValue()]);
        Long aux = input / BASE;
        while (aux > 0) {
            index = aux % BASE;
            aux = aux / BASE;
            result = String.valueOf(ALPHABET[index.intValue()]) + result;
        }
        return result;
    }

//    static String toBase10(final String input) {
//        final int length = input.length();
//        String result = input;
//    }

    public static void main(String... args) {
    }

}






