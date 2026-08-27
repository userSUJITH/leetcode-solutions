# 4. Median of Two Sorted Arrays

### Difficulty: Hard

## Description
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 
Example 1:


Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


Example 2:


Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 
Constraints:


	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106

## Submission Details
- **Status**: Accepted
- **Runtime**: 6
- **Memory**: 49128000
- **Language**: java

## Code
```java
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
```
