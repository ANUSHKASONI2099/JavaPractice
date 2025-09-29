// Print Nth Tribnocci


import java.util.Scanner;

public class Day11 {
    public static int trib(int n) {
        if (n == 0) return 0;
        if (n == 1  || n == 2) return 1;

        int a = 0, b =0 ,c = 1, trib = 0;
        for (int i = 2; i <= n; i++) {
            trib = a + b + c;
            a = b;
            b = c;
            c = trib;
        }
        return trib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = trib(n);
        System.out.println(n + "th tribnocci number = " + result);

        sc.close();
    }
}
