class Solution {
    public int removePalindromeSub(String s) {
        if(new StringBuffer(s).reverse().toString().equals(s))
            return 1;
        return 2;
    }
}