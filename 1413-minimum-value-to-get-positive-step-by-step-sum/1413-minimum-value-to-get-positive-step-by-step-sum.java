class Solution {
    public int minStartValue(int[] nums) {
        // if min<1 1-min prefix sum else 1
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
            if(nums[i]<min)
                min=nums[i];
        }
        if(min<1)
            return 1-min;
        else
            return 1;
    }
}