class Solution {
    public int pivotIndex(int[] nums) {
        int totsum=0;
        for(int i=0;i<nums.length;i++)
            totsum+=nums[i];
        int lsum=0, rsum=totsum;
        for(int i=0;i<nums.length;i++){
            rsum-=nums[i];
            if(lsum==rsum)
                return i;
            lsum+=nums[i];
        }
        return -1;
    }
}