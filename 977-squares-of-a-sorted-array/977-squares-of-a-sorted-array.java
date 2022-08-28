class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int low=0, high=n-1;
        int[] res=new int[n];
        int i=n-1;
        while(low<=high){
            if(nums[low]*nums[low] > nums[high]*nums[high]){
                res[i]=nums[low]*nums[low];
                low++;
                i--;
            }
            else{
                res[i]=nums[high]*nums[high];
                high--;
                i--;
            }
        }
        return res;
    }
}