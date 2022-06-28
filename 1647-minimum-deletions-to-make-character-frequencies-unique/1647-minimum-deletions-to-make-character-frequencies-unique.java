class Solution {
    public int minDeletions(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray())
            freq[c-'a']++;
        HashSet<Integer> hs=new HashSet<Integer>();
        int ct=0;
        for(int i=0;i<26;i++){
            while(hs.contains(freq[i]) && freq[i]>0){
                freq[i]--;
                ct++;
            }
            hs.add(freq[i]);
        }
        return ct;
    }
}