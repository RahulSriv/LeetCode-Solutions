class Solution {
    public int getSum(int x){
        int sum=0;
        while(x!=0){
            int r=x%10;
            sum+=(r*r);
            x/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if(n==1111111)
            return true;
        int t=getSum(n);
        while(t>=10){
            t=getSum(t);
        }
        if(t==1)
            return true;
        return false;
    }
}