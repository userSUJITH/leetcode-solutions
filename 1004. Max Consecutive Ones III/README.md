# 1004. Max Consecutive Ones III

### Difficulty: Medium

## Description
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 
Example 1:


Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:


Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


 
Constraints:


	1 <= nums.length <= 105
	nums[i] is either 0 or 1.
	0 <= k <= nums.length

## Submission Details
- **Status**: Accepted
- **Runtime**: 3
- **Memory**: 51796000
- **Language**: java

## Code
```java
class Solution {
    public int longestOnes(int[] nums, int k) {
        int max =0 ;
        int r=0,l=0;
        int zero = 0;
        while(r<nums.length){
            if(nums[r] == 0){
                zero++;
            }
            while(zero > k){
                
                if(nums[l]==0){
                zero--;
                }
                l++;
            }
            if(zero<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}
```
