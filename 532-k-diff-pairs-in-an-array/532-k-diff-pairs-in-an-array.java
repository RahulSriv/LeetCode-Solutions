class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> hs=new HashSet<Integer>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(Arrays.binarySearch(nums,i+1,nums.length,k+nums[i])>0)
                hs.add(nums[i]);
        }
        return hs.size();
    }
}