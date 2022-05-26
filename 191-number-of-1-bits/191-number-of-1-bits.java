public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int res=0;
        for(char x:s.toCharArray()){
            if(x=='1'){
                res++;
            }
        }
        return res;
    }
}