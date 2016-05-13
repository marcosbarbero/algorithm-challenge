package demo;

import java.util.Arrays;

/**
 * Design an algorithm to find K biggest numbers in the array.
 *
 * @author Marcos Barbero
 */
public class FindBiggestElement {

    static final Integer[] array = {1, 30, 54, 82, 7, 3, 12, 109};

    public static void main(String... args) {
        kLargest(array, 3);
    }

    public static void kLargest(Integer[] array, int k) {
        int minIndex;                            //Find Min
        for (int i = k; i < array.length; i++) {
            minIndex = 0;
            for (int j = 0; j < k; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    array[minIndex] = array[j];
                }
            }
            if (array[minIndex] < array[i]) {         //Swap item if min < array[i]
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        for (int q = 0; q < k; q++) {                            //Print output
            System.out.print(array[q] + " ");
        }

        Arrays.sort(array);

        String result = "";
        for (int i = array.length - k; i < array.length; i++) {
            result += array[i] + " ";
        }

        System.out.println("\n" + result);
    }
}
