class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int x:nums)
            sum+=x;
        int lsum=0;
        for(int i=0;i<nums.length;i++){
            if(lsum==sum-lsum-nums[i])
                return i;
            lsum+=nums[i];
        }
        return -1;
    }
}