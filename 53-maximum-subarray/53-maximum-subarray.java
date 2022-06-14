class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnding=nums[0], res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i]+maxEnding)
                maxEnding=nums[i];
            else
                maxEnding+=nums[i];
            res=Math.max(res,maxEnding);
        }
        return res;
    }
}