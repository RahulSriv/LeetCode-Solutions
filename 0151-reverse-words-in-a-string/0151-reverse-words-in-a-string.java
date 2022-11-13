class Solution {
    public String reverseWords(String s) {
        String[] wrds=s.split(" ");
        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<wrds.length;i++){
            if(!wrds[i].isEmpty()){
                sb.insert(0,wrds[i]);
                if(i!=wrds.length-1)
                    sb.insert(0," ");
            }
        }
        return sb.toString();
    }
}