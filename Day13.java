
// Pattern Problems..............
import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // left rightAngle Pattern *
        // for(int i = 1 ; i<= n ; i++){
        // for(int j = 1 ; j<= n ; j++){
        // if(i >=j){
        // System.out.print("*");
        // }

        // }
        // System.out.println(" ");

        // }

        // Left RightAngle Pattern Numberic....

        // for(int i = 1 ; i<= n ; i++){
        // int val = i;
        // for(int j = 1 ; j<= n ; j++){

        // System.out.println(val);
        // val++;

        // }
        // }

        // Cross Pattern Stars...

        // for(int i = 1; i<=n ; i++){
        // for(int j = 1 ; j<= n ; j++){
        // if(i == j || i+j == n+1){
        // System.out.print("*");
        // }else{
        // System.out.println(" ");
        // }

        // }

        // }

        // Triangle Pattern

        // int spaces = n -1;
        // int stars = 1;
        // for(int i = 1; i<= n ; i++){
        // for(int count = 1; count <= spaces; count++){
        // System.out.print(" ");
        // }
        // for(int count = 1 ; count <= stars; count++){
        // System.out.print(" * ");
        // }
        // for(
        // int count = 1; count <= spaces ; count++
        // ){
        // System.out.println(" ");
        // }
        // spaces--;
        // stars++;
        // }

        // Upper Left Triangle

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (j >= i) {
        // System.out.print("*");
        // }

        // }
        // System.out.println(" ");
        // }





        
        // Diamond Pattern

        // int spaces = n / 2;
        // int stars = 1;

        // for (int i = 1; i <= n; i++) {
        //     for (int count = 1; count <= spaces; count++) {
        //         System.out.print(" ");
        //     }
        //     for (int count = 1; count <= stars; count++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
           

        //     if (i <= n / 2) {
        //         stars += 2;
        //         spaces--;
        //     }
        //     // lower half
        //     else {
        //         stars -= 2;
        //         spaces++;
        //     }
        // }

    }
}
