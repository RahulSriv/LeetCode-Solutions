class Solution {
    public List<String> res=new ArrayList<String>();
    public List<String> getCombinations(String r, String s){
        if(s.length()==0){
            res.add(r);
        }
        else if(s.charAt(0)>='0' && s.charAt(0)<='9'){
            char z=s.charAt(0);
            getCombinations(r+z,s.substring(1));
        }
        else {
            char x=s.charAt(0);
            char y=Character.isLowerCase(x)?Character.toUpperCase(x):Character.toLowerCase(x);
            getCombinations(r+x,s.substring(1));
            getCombinations(r+y,s.substring(1));
        }
        return res;
    }
    public List<String> letterCasePermutation(String s) {
        return getCombinations("",s);
    }
}