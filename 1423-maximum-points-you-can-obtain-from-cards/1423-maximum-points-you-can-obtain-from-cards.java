class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i, sum=0;
        for(i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        i--;
        int max=sum, j=cardPoints.length-1;
        while(j>cardPoints.length-1-k){
            sum-=cardPoints[i--];
            sum+=cardPoints[j--];
            max=Math.max(max,sum);
        }
        return max;
    }
}