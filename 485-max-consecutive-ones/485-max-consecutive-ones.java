class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ct=0, max=0;
        for(int x:nums){
            if(x==1){
                ct++;
                max=Math.max(ct,max);
            }
            else{
                ct=0;
            }
        }
        return max;
    }
}