class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low=0, high;
        for(high=0;high<nums.length;high++){
            if(nums[high]%2==0){
                int tmp=nums[high];
                nums[high]=nums[low];
                nums[low++]=tmp;
            }
        }
        return nums;
    }
}