class Solution {
    public int minFlipsMonoIncr(String s) {
        int res = 0, num = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') {
                res = Math.min(num, res + 1);
            } else {
                num++;
            }
        }
        return res;
    }
}