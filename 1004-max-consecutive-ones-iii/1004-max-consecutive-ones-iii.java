class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0, j=0, ct0=0, res=0, max=0;
        while(j<nums.length){
            if(nums[j]==1){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(nums[j]==0 && ct0<k){
                ct0++;
                max=Math.max(max,j-i+1);
                j++;
            }
            else{
                if(nums[i]==0)
                    ct0--;
                i++;
            }
        }
        return max;
    }
}