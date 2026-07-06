# 5. Longest Palindromic Substring

### Difficulty: Medium

## Description
Given a string s, return the longest palindromic substring in s.

 
Example 1:


Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.


Example 2:


Input: s = "cbbd"
Output: "bb"


 
Constraints:


	1 <= s.length <= 1000
	s consist of only digits and English letters.

## Submission Details
- **Status**: Accepted
- **Runtime**: 19
- **Memory**: 47052000
- **Language**: java

## Code
```java
class Solution {
    public String longestPalindrome(String str) {
        // String str = s.toLowerCase();
        
        String ans = "";
        for(int i=0;i<str.length();i++){
            String p1 = expand(str,i,i);
            String p2 = expand(str,i,i+1);
            if(p1.length() > ans.length())ans = p1;
             if(p2.length() > ans.length())ans = p2;
        }
        return ans;
    }
    public static String expand(String str,int start ,int end){
       while(start >= 0 && end<str.length() && str.charAt(start)==str.charAt(end)){
        end++;
        start--;
       }
       return str.substring(start+1,end);
    }
}
```
