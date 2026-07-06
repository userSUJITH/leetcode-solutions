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