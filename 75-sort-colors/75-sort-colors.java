class Solution {
    public void sortColors(int[] nums) {
        int t, low=0, mid=0, high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                t=nums[low];
                nums[low++]=nums[mid];
                nums[mid++]=t;
            }
            else if(nums[mid]==2){
                t=nums[high];
                nums[high--]=nums[mid];
                nums[mid]=t;
            }
            else if(nums[mid]==1){
                mid++;
            }
        }
    }
}