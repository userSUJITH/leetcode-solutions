class Solution {
    public int maxProduct(int n) {
      int max=0;
      int second =0;
      while(n>0){
        int rem = n%10;
        if(rem>=max){
            second=max;
            max=rem;
        }else if(rem>second && rem<max){
            second = rem;
        }
        n/=10;
      }
       return max*second;
    }
}