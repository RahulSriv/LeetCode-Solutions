class Solution {
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch);
        StringBuffer sb=new StringBuffer(word.substring(0,i+1));
        sb.reverse();
        return sb.toString()+word.substring(i+1,word.length());
    }
}