class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0, prod=1;
        while(n!=0){
            int r=n%10;
            n/=10;
            sum+=r;
            prod*=r;
        }
        return prod-sum;
    }
}