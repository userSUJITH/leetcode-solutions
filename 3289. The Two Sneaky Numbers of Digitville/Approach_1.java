class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                list.add(nums[i]);
            }else{
            set.add(nums[i]);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}