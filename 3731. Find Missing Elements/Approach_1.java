class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> num = new HashSet();
        ArrayList<Integer> list = new ArrayList<>();
        int min =Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
   
        for(int i=min;i<max;i++){
            if(!num.contains(i)){
                list.add(i);
            }
        }
       return list;
    }
}