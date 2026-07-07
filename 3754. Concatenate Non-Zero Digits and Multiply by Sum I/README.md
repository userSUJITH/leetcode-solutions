# 3754. Concatenate Non-Zero Digits and Multiply by Sum I

### Difficulty: Easy

## Description
You are given an integer n.

Form a new integer x by concatenating all the non-zero digits of n in their original order. If there are no non-zero digits, x = 0.

Let sum be the sum of digits in x.

Return an integer representing the value of x * sum.

 
Example 1:


Input: n = 10203004

Output: 12340

Explanation:


	The non-zero digits are 1, 2, 3, and 4. Thus, x = 1234.
	The sum of digits is sum = 1 + 2 + 3 + 4 = 10.
	Therefore, the answer is x * sum = 1234 * 10 = 12340.



Example 2:


Input: n = 1000

Output: 1

Explanation:


	The non-zero digit is 1, so x = 1 and sum = 1.
	Therefore, the answer is x * sum = 1 * 1 = 1.



 
Constraints:


	0 <= n <= 109

## Submission Details
- **Status**: Accepted
- **Runtime**: 2
- **Memory**: 42852000
- **Language**: java

## Code
```java
class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0) return 0;
       String str = String.valueOf(n);
    //    char[] ch = str.toCharArray(str);
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
            if(ch!='0'){
                sb.append(ch);
            }
       }
       int num = Integer.parseInt(sb.toString());
       int tnum =num;
      int sum=0;
      while(num>0){
      long rem = num%10;
      sum += rem;
      num/=10;
      }
        return (long)tnum*sum;
    }
    
}
```
