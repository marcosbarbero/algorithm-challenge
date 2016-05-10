package demo;

/**
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz
 *
 * @author Marcos Barbero
 */
public class FizzBuzz {

    private static final int TOTAL = 100;

    public static void main(String... args) {
        String fizzBuzz;
        for (int i = 1; i <= TOTAL; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                fizzBuzz = "FizBuzz";
            } else if (i % 3 == 0) {
                fizzBuzz = "Fiz";
            } else if (i % 5 == 0) {
                fizzBuzz = "Buzz";
            } else {
                fizzBuzz = Integer.toString(i);
            }
            System.out.println(fizzBuzz);
        }
    }
}
