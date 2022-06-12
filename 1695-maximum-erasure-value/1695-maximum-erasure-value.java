class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0, j=0, sum=0, max=0;
        Set<Integer> s=new HashSet<Integer>();
        while(j<nums.length){
            if(!s.contains(nums[j])){
                s.add(nums[j]);
                sum+=nums[j];
                j++;
                max=Math.max(sum,max);
            }
            else{
                s.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
        }
        return max;
    }
}