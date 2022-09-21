class Solution {
    public int pivotIndex(int[] nums) {
        int totsum=0;
        for(int i=0;i<nums.length;i++)
            totsum+=nums[i];
        int presum=0;
        for(int i=0;i<nums.length;i++){
            if(presum==totsum-presum-nums[i])
                return i;
            presum+=nums[i];
        }
        return -1;
    }
}