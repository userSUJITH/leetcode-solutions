class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        while(n>0){
            int rem = n%10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            n/=10;
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            // System.out.println(entry.getValue());
            sum += entry.getKey()*entry.getValue();
        }
        return sum;
    }
}