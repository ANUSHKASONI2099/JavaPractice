//First and last occurence   problem........

public class Day14 {

    public int[] search(int[] arr, int target) {
        int firstOcc = -1;
        int lastOcc = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                lastOcc = i;

            }
            if (firstOcc == -1)

            {
                firstOcc = i;
            }

        }
        int[] ans = { firstOcc, lastOcc };
        return ans;
    }

}
