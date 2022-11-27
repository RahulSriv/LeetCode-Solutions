class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res=new int[k];
        Map<Integer, Set<Integer>> m=new HashMap<>();
        for(int i=0;i<logs.length;i++){
            if(m.containsKey(logs[i][0])){
                Set<Integer> s=m.get(logs[i][0]);
                s.add(logs[i][1]);
                m.put(logs[i][0],s);
            }
            else{
                Set<Integer> s=new HashSet<>();
                s.add(logs[i][1]);
                m.put(logs[i][0],s);
            }
        }
        for(Map.Entry<Integer, Set<Integer>> e:m.entrySet()){
            res[e.getValue().size()-1]++;
        }        
        return res;
    }
}