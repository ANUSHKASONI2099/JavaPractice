// Swap two numbers


import java.util.Scanner;

public class Day3 {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      
      int temp = a ;
      a = b;
      b = temp;

      System.out.println("After  swaping value of a = " + a + "and" + b);
    }
   
}


// Second method without using 3rd variable

// int a = a+ b;
// b = a- b;
// a = a- b;


