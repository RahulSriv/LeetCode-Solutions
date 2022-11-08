class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && Math.abs(st.peek()-s.charAt(i))==32){
                st.pop();
                StringBuffer sb=new StringBuffer(s);
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                s=sb.toString();
                i-=2;
            }
            else
                st.push(s.charAt(i));
        }
        return s;
    }
}