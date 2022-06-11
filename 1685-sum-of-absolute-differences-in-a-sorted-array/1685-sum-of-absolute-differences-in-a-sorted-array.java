class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int i,n=nums.length;
        int[] res=new int[n];
        for(i=1;i<n;i++)
            nums[i]+=nums[i-1];
        res[0]=-((n-1)*nums[0])+(nums[n-1]-nums[0]); 
        for(i=1;i<n;i++){
            res[i]=(i*(nums[i]-nums[i-1]))-nums[i-1]-((n-1-i)*(nums[i]-nums[i-1]))+(nums[n-1]-nums[i]);
        }
        return res;
    }
}