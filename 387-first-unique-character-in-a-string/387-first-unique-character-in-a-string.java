class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        int m =0;
        for(int i =0;i<s.length();i++)
        {
            int z = hm.getOrDefault(s.charAt(i),0);
            hm.put(s.charAt(i),z+1); 
        }
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}