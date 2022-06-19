class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res=new ArrayList<>();
        String s="";
        for(int i=0;i<searchWord.length();i++){
            char c=searchWord.charAt(i);
            s=s+String.valueOf(c);
            ArrayList<String> sl=new ArrayList<String>();
            Arrays.sort(products);
            for(int j=0;j<products.length;j++){
                String t=products[j];
                if(sl.size()<3 && t.startsWith(s))
                    sl.add(t);
            }
            res.add(new ArrayList<String>(sl));
            sl.clear();
        }
        return res;
    }
}