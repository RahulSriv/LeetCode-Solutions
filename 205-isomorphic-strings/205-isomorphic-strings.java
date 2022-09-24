class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                if(m.get(s.charAt(i))==t.charAt(i))
                    continue;
                else
                    return false;
            }
            else if(!m.containsKey(s.charAt(i)) && set.contains(t.charAt(i)))
                return false;
            else{
                m.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    }
}