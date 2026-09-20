class Solution {
    public int reverseDegree(String s) {
        int rev =0;
        int curr =0;
        int product =1;
        int sum =0;
        for(int i=0;i<s.length();i++){
            rev = (int)'z'-s.charAt(i)+1;
            curr =i+1;
            product = rev*curr;
            sum+=product;
        }
        return sum;
    }
}