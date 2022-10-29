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
        Set<Integer> s=new HashSet<>();
        int t=getSum(n);
        s.add(n);
        while(t!=1 && !s.contains(t)){
            s.add(t);
            t=getSum(t);
        }
        if(t==1)
            return true;
        return false;
    }
}