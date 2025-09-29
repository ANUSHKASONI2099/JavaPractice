// Print Nth Fibonacci numbers

import java.util.Scanner;

public class Day8 {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = fib(n);
        System.out.println(n + "th Fibonacci number = " + result);

        sc.close();
    }
}


