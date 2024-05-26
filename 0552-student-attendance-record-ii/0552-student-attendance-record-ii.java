class Solution {
    public int checkRecord(int n) {
        int MOD = 1000000007;
        int[][] dpCurrState = new int[2][3];
        int[][] dpNextState = new int[2][3];
        dpCurrState[0][0] = 1;
        for (int len = 0; len < n; ++len) {
            for (int totalAbsences = 0; totalAbsences <= 1; ++totalAbsences) {
                for (int consecutiveLates = 0; consecutiveLates <= 2; ++consecutiveLates) {
                    dpNextState[totalAbsences][0] = (
                        dpNextState[totalAbsences][0] + 
                        dpCurrState[totalAbsences][consecutiveLates]
                    ) % MOD;
                    if (totalAbsences < 1) {
                        dpNextState[totalAbsences + 1][0] = (
                            dpNextState[totalAbsences + 1][0] + 
                            dpCurrState[totalAbsences][consecutiveLates]
                        ) % MOD;
                    }
                    if (consecutiveLates < 2) {
                        dpNextState[totalAbsences][consecutiveLates + 1] = (
                            dpNextState[totalAbsences][consecutiveLates + 1] + 
                            dpCurrState[totalAbsences][consecutiveLates]
                        ) % MOD;
                    }
                }
            }
            System.arraycopy(dpNextState, 0, dpCurrState, 0, dpCurrState.length);
            dpNextState = new int[2][3];
        }
        int count = 0;
        for (int totalAbsences = 0; totalAbsences <= 1; ++totalAbsences) {
            for (int consecutiveLates = 0; consecutiveLates <= 2; ++consecutiveLates) {
                count = (count + dpCurrState[totalAbsences][consecutiveLates]) % MOD;
            }
        }
        return count;
    }
}