class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max =0;
        int sum=0;
        for(int i=0;i<=k-1;i++){
           sum += cardPoints[i];
        }
        max = sum;
        int r = cardPoints.length-1;
        int l = k-1;
        while(l>=0){
            sum -= cardPoints[l];
            sum += cardPoints[r];
            max = Math.max(max,sum);
            r--;
            l--;
        }
        return max;
    }
}