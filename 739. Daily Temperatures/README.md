# 739. Daily Temperatures

### Difficulty: Medium

## Description
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 
Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:
Input: temperatures = [30,60,90]
Output: [1,1,0]

 
Constraints:


	1 <= temperatures.length <= 105
	30 <= temperatures[i] <= 100

## Submission Details
- **Status**: Accepted
- **Runtime**: 80
- **Memory**: 106432000
- **Language**: java

## Code
```java
class Solution {
    public int[] dailyTemperatures(int[] te) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[te.length];
        for(int i=te.length-1;i>=0;i--){
           while(!st.isEmpty() && te[st.peek()]<=te[i]){
            st.pop();
           }
           if(!st.isEmpty()){
            arr[i] = st.peek()-i;
           }
         st.push(i);
        }
      return arr;
    }
}
```
