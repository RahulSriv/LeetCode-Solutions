class Solution {
    public long minimumSteps(String s) {
        int ct=0;
        long res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                ct++;
            else
                res+=(long)ct;
        }
        return res;
    }
}