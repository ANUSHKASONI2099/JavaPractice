// Finding Largets Altitude........... 1732 Leetcode

public class Day21 {
   public int altitude(int[] gain){
    int ans = 0 ;
    int altitude = 0 ;
    for(int val : gain){
        altitude += val;
        ans = Math.max(ans , altitude);
    }
    return ans;
   } 
}
