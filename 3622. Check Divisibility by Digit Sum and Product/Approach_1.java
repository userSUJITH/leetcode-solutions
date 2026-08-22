class Solution {
    public boolean checkDivisibility(int n) {
        int num =n;
     int sum =0;
     int pro = 1;
     while(n>0){
        int rem = n%10;
        sum += rem;
        pro *=rem;
        n=n/10;
     }   
     int fi = sum+pro;
     if(num%fi == 0){
        return true;
     }
     return false;
    }
}