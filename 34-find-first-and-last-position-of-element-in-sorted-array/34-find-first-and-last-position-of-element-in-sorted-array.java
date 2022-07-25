class Solution {
    public int[] searchRange(int[] nums, int target) {
        int x=-1, y=-1, low=0, high=nums.length-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            if(nums[mid]==target){
                x=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            mid=low+(high-low)/2;
        }
        low=0;
        high=nums.length-1;
        mid=low+(high-low)/2;
        while(low<=high){
            if(nums[mid]==target){
                y=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            mid=low+(high-low)/2;
        }
        int[] res=new int[2];
        res[0]=x;
        res[1]=y;
        return res;
    }
}