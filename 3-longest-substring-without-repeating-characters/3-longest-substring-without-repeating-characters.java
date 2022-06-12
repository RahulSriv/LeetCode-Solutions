class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<Character>();
        int i=0, j=0, max=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,j-i);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}