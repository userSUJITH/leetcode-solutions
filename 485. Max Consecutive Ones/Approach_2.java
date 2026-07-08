class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur =0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                cur++;
            }else{
                cur=0;
            }
            count=Math.max(count,cur);
        }
        return count;
    }
}