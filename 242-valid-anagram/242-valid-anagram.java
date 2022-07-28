class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ct=new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
            ct[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++)
            ct[t.charAt(i)-'a']--;
        for(int i=0;i<26;i++)
            if(ct[i]!=0)
                return false;
        return true;
    }
}