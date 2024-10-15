class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=Integer.MIN_VALUE, ct=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                ct++;
            else{
                res=Math.max(res,ct);
                ct=0;
            }
        }
        res=Math.max(res,ct);
        return res;
    }
}