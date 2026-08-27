class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length==1){
            return nums2[0];
        }
          if(nums2.length == 0 && nums1.length==1){
            return nums1[0];
        }
        int i =0;
        int j=0;
        int k=0;
        int[] arr = new int[nums1.length + nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(j<nums2.length){
           arr[k]=nums2[j];
           j++;
           k++;
        }
        while(i<nums1.length){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        double ans=0;
        if(arr.length%2 != 0){
            ans = arr[arr.length/2];
            
        }else{
            int mid = arr.length/2;
            System.out.println(arr[mid]);
            ans = (arr[mid]+arr[mid-1])/(double)2;
        }
        return ans; 
    }
}