class Solution {
    public int smallestIndex(int[] nums) {
        int idx =-1;
        for(int i=0;i<nums.length;i++){
        
            if(nums[i]>=10){
                 int flag = find(nums[i]);
                if(flag == i){
                    idx = flag;
                    break;
                }
            }else{
                if(nums[i] == i){
                    idx = i;
                    break;
                }
            }
        }
        return idx;
    }
    public static int find(int n){
        int num = 0;
        while(n>0){
            int rem = n%10;
            num+=rem;
            n/=10;
        }
        return num;
    }
}