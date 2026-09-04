class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int min = Integer.MAX_VALUE;
       int[] mt = new int[nums.length];
       for(int i=mt.length-1;i>=0;i--){
        min = Math.min(min,nums[i]);
        mt[i]=min;
       } 
       

       int max = Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        max = Math.max(nums[i],max);
        if(max - mt[i] <=k){
            // System.out.println(max+" "+min);
            return i;
        }
     
       }
       return -1;
    }
}