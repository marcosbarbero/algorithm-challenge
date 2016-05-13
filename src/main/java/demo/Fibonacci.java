package demo;

import java.util.Scanner;

/**
 * Write code that will return the nth digit of the Fibonacci sequence
 *
 * @author Marcos Barbero
 */
public class Fibonacci {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        final int fib = fib(sc.nextInt());
        System.out.println(fib);
    }


    /* function that returns nth Fibonacci number */
    static int fib(int n) {
        int[][] f = {{1, 1}, {1, 0}};
        if (n == 0)
            return 0;
        power(f, n - 1);
        return f[0][0];
    }

    /* Optimized version of power() in method 4 */
    static void power(int[][] f, int n) {
        if (n == 0 || n == 1)
            return;
        int[][] M = {{1, 1}, {1, 0}};

        power(f, n / 2);
        multiply(f, f);

        if (n % 2 != 0)
            multiply(f, M);
    }

    static void multiply(int[][] f, int[][] m) {
        int x = f[0][0] * m[0][0] + f[0][1] * m[1][0];
        int y = f[0][0] * m[0][1] + f[0][1] * m[1][1];
        int z = f[1][0] * m[0][0] + f[1][1] * m[1][0];
        int w = f[1][0] * m[0][1] + f[1][1] * m[1][1];

        f[0][0] = x;
        f[0][1] = y;
        f[1][0] = z;
        f[1][1] = w;
    }


    static int fib1(int n) {
        if (n <= 1)
            return n;
        return fib1(n - 1) + fib1(n - 2);
    }

    private static int fib2(int n) {
        int[] fib = new int[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
      /* Add the previous 2 numbers in the series and store it */
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    static int fib3(int n) {
        int a = 0, b = 1, c, i;
        if (n == 0)
            return a;
        for (i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
