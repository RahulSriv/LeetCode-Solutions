class Solution {
    public int arraySign(int[] nums) {
        int p=1;
        for(int x:nums){
            if(x==0)
                return 0;
            else if(x<0)
                p*=(-1);
        }
        return p;
    }
}