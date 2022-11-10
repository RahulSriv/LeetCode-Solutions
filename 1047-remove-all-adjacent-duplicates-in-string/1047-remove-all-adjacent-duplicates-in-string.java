class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                StringBuffer sb=new StringBuffer(s);
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                s=sb.toString();
                st.pop();
                i-=2;
            }
            else
                st.push(s.charAt(i));
        }
        return s;
    }
}