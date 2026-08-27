class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int n  = nums.length-1;
        Arrays.fill(dp, -1);
       return fun(dp,nums,n);   
    }
    public static int fun(int[] dp,int[] nums,int n){
        if(n==0){
            return nums[n];
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int max=0;
        int pick = nums[n]+fun(dp,nums,n-2);
        int not =fun(dp,nums,n-1) ;
          max = Math.max(pick,not);
          dp[n]=max;
        return dp[n];
    }
}