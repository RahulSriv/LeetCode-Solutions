class Solution {
    public boolean checkPossibility(int[] nums) {
        int ct=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                if(ct>0)
                    return false;
                if(i>1 && i<nums.length-1 && nums[i-2]>nums[i] && nums[i-1]>nums[i+1])
                    return false;
                ct++;
            }
        }
        return true;
    }
}