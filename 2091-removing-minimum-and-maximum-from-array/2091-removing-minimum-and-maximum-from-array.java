class Solution {
    public int minimumDeletions(int[] nums) {
        int max=0, min=0, n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[max])
                max=i;
            if(nums[i]<nums[min])
                min=i;
        }
        int ct=n;
        System.out.print(min+" "+max);
        if(max<min){
            ct=Math.min(min+1,n-max);
            ct=Math.min(ct,max+1+n-min);
        }
        else if(max>min){
            ct=Math.min(max+1,n-min);
            ct=Math.min(ct,min+1+n-max);
        }
        return ct;
    }
}