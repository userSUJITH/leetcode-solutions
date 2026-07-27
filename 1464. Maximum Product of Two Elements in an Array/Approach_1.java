class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int smax =0;
        for(int i=0;i<nums.length;i++){
            if(max<=nums[i]){
                smax=max;
                max=nums[i];
            }else if(nums[i]>smax && nums[i]<max){
                smax=nums[i];
            }
        }
       System.out.println(max);
       System.out.println(smax);
       return Math.abs((max-1)*(smax-1));
    }
}