class Solution {
    public int maxArea(int[] arr) {
        int start=0;
        int end =arr.length-1;
        int max = 0;
        while(start<end){
          
            int width = end-start;
            int height = Math.min(arr[start],arr[end]);
            int area = width * height;
            max = Math.max(area,max);
            if(arr[start]<arr[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max;
    }
}