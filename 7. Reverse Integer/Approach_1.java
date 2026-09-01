class Solution {
    public int reverse(int x) {
        int res =0;
        if(x>=0){
          res=  rev(x);
        }else{
          res=rev(Math.abs(x));
          res = 0-res;
        
        }
        return res;
    }
    public static int rev(int x){
        long ans =0;
        while(x!=0){
          int rem = x%10;
          ans = ans*10+rem;
          x=x/10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)ans;
    }
}