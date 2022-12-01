class Solution {
    public boolean halvesAreAlike(String s) {
        String t=s.substring(s.length()/2);
        s=s.substring(0,s.length()/2);
        s=s.toUpperCase();
        t=t.toUpperCase();
        int c1=0, c2=0;
        Set<Character> set=new HashSet<>(Arrays.asList(new Character[] {'A','E','I','O','U'}));
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i)))
                c1++;
            if(set.contains(t.charAt(i)))
                c2++;
        }
        return c1==c2;
    }
}