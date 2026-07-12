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