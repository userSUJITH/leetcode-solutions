# 7. Reverse Integer

### Difficulty: Medium

## Description
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 
Example 1:


Input: x = 123
Output: 321


Example 2:


Input: x = -123
Output: -321


Example 3:


Input: x = 120
Output: 21


 
Constraints:


	-231 <= x <= 231 - 1

## Submission Details
- **Status**: Accepted
- **Runtime**: 1
- **Memory**: 42820000
- **Language**: java

## Code
```java
class Solution {
    public int reverse(int x) {
        int res =0;
        if(x>=0){
          res=  rev(x);
        }else{
          res=rev(Math.abs(x));
          res = 0-res;
        
        }
        return res;
    }
    public static int rev(int x){
        long ans =0;
        while(x!=0){
          int rem = x%10;
          ans = ans*10+rem;
          x=x/10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)ans;
    }
}
```
