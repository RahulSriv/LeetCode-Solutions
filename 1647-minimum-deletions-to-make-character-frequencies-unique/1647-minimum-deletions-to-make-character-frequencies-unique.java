class Solution {
    public int minDeletions(String s) {
        int[] freq=new int[26];
        for(char x:s.toCharArray())
            freq[x-'a']++;
        int res=0;
        Set<Integer> freqSet=new HashSet<Integer>();
        for(int i=0;i<26;i++){       
            while(freqSet.contains(freq[i]) && freq[i]>0){
                freq[i]--;
                res++;
            }
            freqSet.add(freq[i]);
        }
        return res;
    }
}