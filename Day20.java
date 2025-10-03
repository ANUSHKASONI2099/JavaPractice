// Suffix Sum..........

public class Day20 {
    public int[] suffixSum(int[] nums){
        int n = nums.length;
        int[] suffix = new int[n];

        suffix[n-1] = nums[n-1];

        for(int i = n-2; i>= 0 ;  i--){
            suffix[i] = nums[i] + suffix[i+1];
        }
        return suffix;
        
    }
}
