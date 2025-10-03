// Product of Array Excepty Self........

public class Day22 {
    public int[] getPreffix(int[] nums) {
        int n = nums.length;
        int[] preffix = new int[n];
        for (int i = 0; i < n; i++) {
            preffix[i] = nums[i] * ((i > 0) ? preffix[i - 1] : 1);
        }
        return preffix;
    }

    public int[] getSuffix(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = nums[i] * ((i < n - 1) ? suffix[i + 1] : 1);

        }
        return suffix;
    }

    public int[] productArr(int[] nums) {
        int[] suffix = getSuffix(nums);
        int[] preffix = getPreffix(nums);
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {

            int left = (i > 0) ? preffix[i - 1] : 1;
            int right = (i < n - 1) ? suffix[i + 1] : 1;

            ans[i] = left * right;

        }
        return ans;
    }
}
