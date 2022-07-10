class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int f1=0, f2=0; 
        for(int i=2;i<=n;i++){
            int tmp=Math.min(f1+cost[i-2],f2+cost[i-1]);
            f1=f2;
            f2=tmp;
        }
        return f2;
    }
}