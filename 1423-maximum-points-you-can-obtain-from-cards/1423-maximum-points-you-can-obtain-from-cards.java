class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i=0, j=cardPoints.length-1, sum=0, max=0;
        while(i<k)
            sum+=cardPoints[i++];
        i--;
        max=Math.max(sum,max);
        while(i>=0){
            sum=sum-cardPoints[i--]+cardPoints[j--];
            max=Math.max(sum,max);
        }
        return max;
    }
}