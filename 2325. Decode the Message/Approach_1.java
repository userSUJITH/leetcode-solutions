class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        int v = 97;
              for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !map.containsKey(ch)) {
                map.put(ch, (char) v);
                v++;
            }
        }
        // System.out.print(map);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i) == ' '){
                sb.append(' ');
            }else{
            sb.append(map.get(message.charAt(i)));
            }
        }
        return sb.toString();
    }
}