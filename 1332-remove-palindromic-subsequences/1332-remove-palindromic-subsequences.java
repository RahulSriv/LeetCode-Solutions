class Solution {
    public int removePalindromeSub(String s) {
        StringBuffer sb=new StringBuffer(s);
        if(sb.reverse().toString().equals(s))
            return 1;
        return 2;
    }
}