# 485. Max Consecutive Ones

### Difficulty: Easy

## Description
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 
Example 1:


Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.


Example 2:


Input: nums = [1,0,1,1,0,1]
Output: 2


 
Constraints:


	1 <= nums.length <= 105
	nums[i] is either 0 or 1.

## Submission Details
- **Status**: Accepted
- **Runtime**: 9
- **Memory**: 51600000
- **Language**: java

## Code
```java
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
```
