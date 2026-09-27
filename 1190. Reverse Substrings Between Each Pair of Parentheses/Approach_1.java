class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.toString().contains("(")){
          int i =-1;
          int j = -1;
        for(int k=0;k<sb.length();k++){
            if(sb.charAt(k) == '('){
                i=k;
            }else if(sb.charAt(k) == ')'){
                j=k;
                break;
            }
        }
           rev(i+1,j-1,sb);
            sb.deleteCharAt(j);
            sb.deleteCharAt(i);
           
        } 
        
        return sb.toString();
    }
    public static void rev(int left,int right,StringBuilder sb){
     while (left < right) {
         char temp = sb.charAt(left);
           sb.setCharAt(left, sb.charAt(right));
           sb.setCharAt(right, temp);
               left++;
             right--;
              }
    }
}