class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
     HashMap<String,String> map = new HashMap<>();
     String[] str = new String[knowledge.size()];
     StringBuilder sb = new StringBuilder();
    for (int i = 0; i < knowledge.size(); i++) {
        String key = knowledge.get(i).get(0);
        String value = knowledge.get(i).get(1);
        map.put(key, value);
    }
    // System.out.print(map);
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) == '('){
            int j=i+1;
            while(s.charAt(j) != ')'){
               j++;
            }
                if(map.containsKey(s.substring(i+1,j))){
                    sb.append(map.get(s.substring(i+1,j)));
                }else{
                    sb.append("?");
                }
            
             i=j;
        }else{
            sb.append(s.charAt(i));
        }
         
    }
     return sb.toString();
    }
}