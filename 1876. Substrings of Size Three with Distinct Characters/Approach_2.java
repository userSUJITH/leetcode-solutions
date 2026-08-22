class Solution {
    public int countGoodSubstrings(String s) {
     int l =0;
     int count =0;
     HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
       map.put(c,map.getOrDefault(c,0)+1);
        if(i-l == 3){
            char sl = s.charAt(l);
            map.put(sl,map.get(sl)-1);
            if(map.get(sl) == 0){
                map.remove(sl);
            }
            l++;
        }
       if(map.size() == 3){
         count++;
       }
    }   
    return count;
    }
}