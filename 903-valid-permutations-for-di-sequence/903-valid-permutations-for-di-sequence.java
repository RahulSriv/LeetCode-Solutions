class Solution {
    public int numPermsDISequence(String S) {
        int n = S.length(), M = (int)1e9 + 7;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1);
        for (int i = 1; i <= n; i++) {
            int[] temp = new int[n + 1];
            for (int j = 0; j <= i; j++) {
                temp[j] = j == 0 ? 0 : temp[j - 1];
                if (S.charAt(i - 1) == 'D') {
                    temp[j] += (dp[i - 1] - (j == 0 ? 0 : dp[j - 1])) % M;
                    if (temp[j] < 0) {
                        temp[j] += M;
                    }
                } else {
                    temp[j] += j == 0 ? 0 : dp[j - 1];
                }
                temp[j] %= M;
            }
            dp = temp;
        }
        return dp[n];
    }
}