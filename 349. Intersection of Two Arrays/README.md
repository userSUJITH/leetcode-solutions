# 349. Intersection of Two Arrays

### Difficulty: Easy

## Description
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 
Example 1:


Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]


Example 2:


Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


 
Constraints:


	1 <= nums1.length, nums2.length <= 1000
	0 <= nums1[i], nums2[i] <= 1000

## Submission Details
- **Status**: Accepted
- **Runtime**: 2
- **Memory**: 44892000
- **Language**: java

## Code
```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> list = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
        Iterator<Integer> it = list.iterator();
        int[] arr =new int[list.size()];
        int i=0;
        while(it.hasNext()){
            arr[i++]=it.next();
        }
        return arr;
    }
}
```
