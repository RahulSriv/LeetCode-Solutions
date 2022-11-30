class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        for(int a:arr)
            m.put(a,m.getOrDefault(a,0)+1);
        for(Map.Entry<Integer, Integer> e:m.entrySet()){
            if(s.contains(e.getValue()))
                return false;
            s.add(e.getValue());
        }
        return true;
    }
}