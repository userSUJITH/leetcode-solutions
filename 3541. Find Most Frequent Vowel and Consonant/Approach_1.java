class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int c =0;
        int v =0;
        
        for(int i=0;i<s.length();i++){
            map.put((s.charAt(i)),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char ch = Character.toLowerCase(entry.getKey());
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v= Math.max(v,entry.getValue());
            }else{
           c= Math.max(c,entry.getValue());
            }
        }
        return c+v;
    }
}