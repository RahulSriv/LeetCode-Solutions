class Solution {
    public int search(int[] nums, int target) {
        int low=0, high=nums.length-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            if(nums[mid]==target)
                return mid;
            else if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else if(nums[high]>=nums[mid]){
                if(target<=nums[high] && target>nums[mid])
                    low=mid+1;
                else
                    high=mid-1;
            }
            mid=low+(high-low)/2;
        }
        return -1;
    }
}