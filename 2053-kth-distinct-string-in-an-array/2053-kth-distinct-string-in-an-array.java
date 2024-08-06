class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map=new HashMap<String, Integer>();
        int ct=0;
        for(String s:arr){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        for(String s:arr){
            if(map.get(s)==1)
                ct++;
            if(ct==k)
                return s;
        }
        return "";
    }
}