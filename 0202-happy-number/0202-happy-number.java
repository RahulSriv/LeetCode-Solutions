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
    public boolean isHappy(int t) {
        Set<Integer> s=new HashSet<>();
        while(t!=1 && !s.contains(t)){
            s.add(t);
            t=getSum(t);
        }
        return t==1;
    }
}