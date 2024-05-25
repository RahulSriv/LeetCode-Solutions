class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Map<String, List<String>> memoization = new HashMap<>();
        return dfs(s, wordSet, memoization);
    }
    private List<String> dfs(
        String remainingStr,
        Set<String> wordSet,
        Map<String, List<String>> memoization
    ) {
        if (memoization.containsKey(remainingStr)) {
            return memoization.get(remainingStr);
        }
        if (remainingStr.isEmpty()) return Collections.singletonList("");
        List<String> results = new ArrayList<>();
        for (int i = 1; i <= remainingStr.length(); ++i) {
            String currentWord = remainingStr.substring(0, i);
            if (wordSet.contains(currentWord)) {
                for (String nextWord : dfs(
                    remainingStr.substring(i),
                    wordSet,
                    memoization
                )) {
                    results.add(
                        currentWord + (nextWord.isEmpty() ? "" : " ") + nextWord
                    );
                }
            }
        }
        memoization.put(remainingStr, results);
        return results;
    }
}