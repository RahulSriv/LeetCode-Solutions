class Solution {
    public int divide(int n, int i){
        while(n%i==0){
            n/=i;
        }
        return n;
    }
    public boolean isUgly(int n) {
        if(n<1)
            return false;
        for(int i:new int[]{2,3,5}){
            n=divide(n,i);
        }  
        return n==1;
    }
}