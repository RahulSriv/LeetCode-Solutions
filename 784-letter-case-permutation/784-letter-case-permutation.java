class Solution {
    public List<String> res=new ArrayList<String>();
    public List<String> getCombinations(String r, String s, int ind){
        if(r.length()==s.length()){
            res.add(r);
            return null;
        }
        if(s.charAt(ind)>='0' && s.charAt(ind)<='9'){
            char z=s.charAt(ind);
            getCombinations(r+z,s,ind+1);
        }
        else {
            char x=s.charAt(ind);
            char y=Character.isLowerCase(x)?Character.toUpperCase(x):Character.toLowerCase(x);
            getCombinations(r+x,s,ind+1);
            getCombinations(r+y,s,ind+1);
        }
        return res;
    }
    public List<String> letterCasePermutation(String s) {
        return getCombinations("",s,0);
    }
}