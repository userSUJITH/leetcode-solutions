class Solution {
    public int maxDepth(String s) {
     int count =0;
     int open =0;
     int close =0;
     for(int i=0;i<s.length();i++){
        count=Math.max(open,count);
        char ch = s.charAt(i);
        if(ch == '('){
            open++;
        }else if(ch == ')'){
            open--;
        }
     } 
     return count;  
    }
}