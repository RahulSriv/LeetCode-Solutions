class Solution {
    List<List<Integer>> res =new ArrayList<>();
    public void makeSubsets(List<Integer> ip, List<Integer> op){
        if(ip.size()==0){
            res.add(new ArrayList<Integer>(op));
            return ;
        }
        op.add(ip.get(0));
        makeSubsets(ip.subList(1,ip.size()),op);
        op.remove(op.size()-1);
        makeSubsets(ip.subList(1,ip.size()),op);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ip=new ArrayList<>();
        List<Integer> op=new ArrayList<>();
        for(int num:nums)
            ip.add(num);
        makeSubsets(ip,op);
        return res;
    }
}