// Running Sum of Array

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= n; i++) {
       arr[i] = sc.nextInt();
       int runningSum = 0;
       runningSum += arr[i];

       System.out.println(runningSum);


        }
    }
}
