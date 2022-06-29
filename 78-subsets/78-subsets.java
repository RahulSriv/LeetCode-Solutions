class Solution {
    
    public List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> allSubsets(List<Integer> op, List<Integer> ip){
        if(ip.isEmpty()){
            res.add(new ArrayList<Integer>(op));
            return res;
        }
        op.add(ip.get(0));
        allSubsets(op,ip.subList(1,ip.size()));
        op.remove(op.size()-1);
        allSubsets(op,ip.subList(1,ip.size()));
        return res;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ip=new ArrayList<Integer>();
        List<Integer> op=new ArrayList<Integer>();
        for(int x:nums)
            ip.add(x);
        
        return allSubsets(op,ip);
        
    }
}