// Print FizzBuzz

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<= n ; i++){
            if( n % 3 == 0 && n % 5 == 0){
                System.out.println("FizzBuzz");
            }else if ( n % 3 == 0){
                System.out.println("Fizz");
            }else if( n % 5 == 0){
                System.out.println("Buzz");

            }
        }
    }
}
