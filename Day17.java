// Maxium product of 2 elements problem 

import java.util.Arrays;
import java.util.Scanner;

public class Day17 {
    public static int maxProduct(int[] nums){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        Arrays.sort(nums);
        int product1 = nums[n-2] * nums[n-1];
        int product2 = nums[0] * nums[1];

        return Math.max(product1, product2);

    }
}
