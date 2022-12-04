// class Solution {
//     public int minimumAverageDifference(int[] nums) {
//         int min=0, minavg=Integer.MAX_VALUE, n=nums.length, totsum=0, presum=0;
//         if(n==1)
//             return 0;
//         for(int a:nums)
//             totsum+=a;
//         for(int i=0;i<n-1;i++){
//             presum+=nums[i];
//             int avg=Math.abs((presum/(i+1)) - ((totsum-presum)/(n-1-i)));
//             System.out.print(avg+" ");
//             if(avg<minavg){
//                 minavg=avg;
//                 min=i;
//             }
//         }
//         int avg=totsum/n;
//         if(avg<minavg){
//             minavg=avg;
//             min=n-1;
//         }
//         return min;
//     }
// }


class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int minAvgDiff = Integer.MAX_VALUE;
        long currPrefixSum = 0;
        
        // Get total sum of array.
        long totalSum = 0;
        for (int index = 0; index < n; ++index) {
            totalSum += nums[index];
        }
        
        for (int index = 0; index < n; ++index) {
            currPrefixSum += nums[index];
            
            // Calculate average of left part of array, index 0 to i.
            long leftPartAverage = currPrefixSum;
            leftPartAverage /= (index + 1);
            
            // Calculate average of right part of array, index i+1 to n-1.
            long rightPartAverage = totalSum - currPrefixSum;
            // If right part have 0 elements, then we don't divide by 0.
            if (index != n - 1) {
                rightPartAverage /= (n - index - 1);
            }
            
            int currDifference = (int) Math.abs(leftPartAverage - rightPartAverage);
            // If current difference of averages is smaller,
            // then current index can be our answer.
            if (currDifference < minAvgDiff) {
                minAvgDiff = currDifference;
                ans = index;
            }
        }
        
        return ans;
    }
}