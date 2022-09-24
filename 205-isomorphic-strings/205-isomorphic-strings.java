class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m=new HashMap<>();
        Set<Character> set=new HashSet<>();
        if(s.length()!=t.length())
            return false;
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
        // m.clear();
        // for(int i=0;i<t.length();i++){
        //     if(m.containsKey(t.charAt(i))){
        //         if(m.get(t.charAt(i))==s.charAt(i))
        //             continue;
        //         else
        //             return false;
        //     }
        //     else{
        //         m.put(t.charAt(i),s.charAt(i));
        //     }
        // }
        return true;
    }
}