class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[100];
      return clim(n,dp);
    }
    public static int clim(int n,int[] dp){
        if(n<=2)
        return n;
        if(dp[n]!=0){
        return dp[n];
        }
        dp[n]=clim(n-1,dp)+clim(n-2,dp);

        return dp[n];
    }
}