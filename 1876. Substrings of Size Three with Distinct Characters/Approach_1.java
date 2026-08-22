class Solution {
    public int countGoodSubstrings(String s) {
        boolean val = false;
        int count =0;
       for(int i=0;i<s.length()-3+1;i++){
        val = fun(s.substring(i,i+3));
        if(val){
        count++;
       }
       }
       
       
       return count;
    }
     public boolean fun(String str){
         HashSet<Character> hs = new HashSet<>();
         char ch;
         for(int i=0;i<str.length();i++){
             ch = str.charAt(i);
            hs.add(ch);
         }
        if(hs.size() == 3){
            return true;
        }else{
            return false;
        }
        }
}