class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] wrds = sentence.split(" ");
        if(wrds[0].charAt(0) != wrds[wrds.length-1].charAt(wrds[wrds.length-1].length()-1))
            return false;
        for(int i = 0; i < wrds.length-1; i++){
            if(wrds[i].charAt(wrds[i].length()-1) != wrds[i+1].charAt(0))
                return false;
        }
        return true;
    }
}