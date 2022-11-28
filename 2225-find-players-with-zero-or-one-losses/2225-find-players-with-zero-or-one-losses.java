class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> ans0=new ArrayList<>();
        List<Integer> ans1=new ArrayList<>();
        Map<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<matches.length;i++)
            m.put(matches[i][1],m.getOrDefault(matches[i][1],0)+1);
        Set<Integer> seen=new HashSet<Integer>();
        for(int i=0;i<matches.length;i++){
            if(!seen.contains(matches[i][0]) && !m.containsKey(matches[i][0])){
                seen.add(matches[i][0]);
                ans0.add(matches[i][0]);
            }
            if(!seen.contains(matches[i][1]) && m.get(matches[i][1])==1){
                ans1.add(matches[i][1]);
                seen.add(matches[i][1]);
            }
        }
        Collections.sort(ans0);
        Collections.sort(ans1);
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(ans0);
        ans.add(ans1);
        return ans;
    }
}