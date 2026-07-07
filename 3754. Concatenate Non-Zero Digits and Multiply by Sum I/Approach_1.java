class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0) return 0;
       String str = String.valueOf(n);
    //    char[] ch = str.toCharArray(str);
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
            if(ch!='0'){
                sb.append(ch);
            }
       }
       int num = Integer.parseInt(sb.toString());
       int tnum =num;
      int sum=0;
      while(num>0){
      long rem = num%10;
      sum += rem;
      num/=10;
      }
        return (long)tnum*sum;
    }
    
}