class Solution {
    public String makeFancyString(String s) {
        StringBuffer sb = new StringBuffer(s);
        int i=2;
        while(i<sb.length()){
            if(sb.charAt(i)==sb.charAt(i-1) && sb.charAt(i)==sb.charAt(i-2))
                sb.deleteCharAt(i);
            else
                i++;
        }
        return sb.toString();
    }
}