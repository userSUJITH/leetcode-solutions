class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        // if(nums.length ==1 && nums[0]%k == 0){
        //     return 0;
        // }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k == 0){
                set.add(nums[i]);
            }
        }
        int i =1;
        while(set.contains(i*k)){
            i++;
        }
        return i*k;
    }
}