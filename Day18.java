// Leetcode 1588 ....... Sum of all odd length Subarray

public class Day18 {
    public int sum(int[] arr) {
        int ans = 0;
        for (int left = 0; left < arr.length; left++) {
            int sum = 0;

            for (int right = left; right < arr.length; right++) {
                sum += arr[right];
            }
            if ((right - left + 1) % 2 == 1) {
                ans += sum;
            }

        }

        return ans;
    }
}
