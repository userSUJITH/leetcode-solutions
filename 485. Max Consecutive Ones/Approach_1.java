class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if( nums[i]!=0){
                list.add(nums[i]);
            }else if(nums[i]==0 && nums.length>0){
                list.clear();
            }
            max=Math.max(max,list.size());
        }
        return max;
    }
}