class Solution {
    public int minimumAverageDifference(int[] nums) {
        int min=-1, minavg=Integer.MAX_VALUE, n=nums.length; 
        long totsum=0, presum=0;
        if(n==1)
            return 0;
        for(int a:nums)
            totsum+=a;
        for(int i=0;i<n;i++){
            presum+=nums[i];
            long leftavg=presum/(i+1);
            long rightavg=totsum-presum;
            if(i<n-1)
                rightavg/=(n-1-i);
            int avg=(int)Math.abs(leftavg-rightavg);
            System.out.print(avg+" ");
            if(avg<minavg){
                minavg=avg;
                min=i;
            }
        }
        return min;
    }
}