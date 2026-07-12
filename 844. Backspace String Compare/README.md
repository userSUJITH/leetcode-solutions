# 844. Backspace String Compare

### Difficulty: Easy

## Description
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 
Example 1:


Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".


Example 2:


Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".


Example 3:


Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".


 
Constraints:


	1 <= s.length, t.length <= 200
	s and t only contain lowercase letters and '#' characters.


 
Follow up: Can you solve it in O(n) time and O(1) space?

## Submission Details
- **Status**: Accepted
- **Runtime**: 1
- **Memory**: 42904000
- **Language**: java

## Code
```java
class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '#'){
                count++;
                continue;
            }
            if(count >0){
                count--;
            }
            else{
                sb1.insert(0,s.charAt(i));
            }
        }
        String sb2= fun(t);
        return sb1.toString().equals(sb2);
    }
    static String fun(String t){
        StringBuilder sb2 = new StringBuilder();
         int count = 0;
        for(int i=t.length()-1;i>=0;i--){
            if(t.charAt(i) == '#'){
                count++;
                continue;
            }
            if(count >0){
                count--;
            }
            else{
                sb2.insert(0,t.charAt(i));
            }

        }
        return sb2.toString();
    }
}
```
