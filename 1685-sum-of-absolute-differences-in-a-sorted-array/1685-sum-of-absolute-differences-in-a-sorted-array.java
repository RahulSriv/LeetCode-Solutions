class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int i,n=nums.length;
        int[] res=new int[n];
        int[] presum=new int[n];
        presum[0]=nums[0];
        for(i=1;i<n;i++){
            presum[i]=nums[i];
            presum[i]+=presum[i-1];
        }
        int sum=nums[n-1];
        res[0]=-((n-1)*nums[0])+(presum[n-1]-presum[0]); 
        for(i=1;i<n;i++){
            res[i]=i*nums[i]-presum[i-1]-((n-1-i)*nums[i])+(presum[n-1]-presum[i]);
        }
        return res;
    }
}