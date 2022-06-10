class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0, i=0, j=0, l=s.length();
        Set<Character> set=new HashSet<Character>();
        while(i<l && j<l){
            if(set.contains(s.charAt(j))==false){
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