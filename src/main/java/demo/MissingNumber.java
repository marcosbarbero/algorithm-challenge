package demo;

/**
 * Given an ordered list of numbers, find the missing number.
 *
 * @author Marcos Barbero
 */
public class MissingNumber {

    public static void main(String[] args) {

        int a[] = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23};
        findMissingNumbers(a);

        int b[] = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23};
        findMissingNumbers(b);

    }

    private static void findMissingNumbers(int values[], int position, int count) {
        boolean foundMissingNumber = false;
        if (position == values.length - 1)
            return;

        for (; position < values[values.length - 1]; position++) {

            if ((values[position] - count) != position) {
                System.out.println("Missing Number: " + (position + count));
                foundMissingNumber = true;
                count++;
                break;
            }
        }

        if (foundMissingNumber) {
            findMissingNumbers(values, position, count);
        }
    }

    public static void findMissingNumbers(int values[]) {
        findMissingNumbers(values, 0, 0);
    }
}
