// class Solution {
//     public List<List<Integer>> res=new ArrayList<>();
//     public List<List<Integer>> allSubsets(List<Integer> op,List<Integer> ip){
//         if(ip.size()==0){
//             if(!res.contains(new ArrayList<Integer>(op)))
//                 res.add(new ArrayList<Integer>(op));
//             return res;
//         }
//         op.add(ip.get(0));
//         allSubsets(op,ip.subList(1,ip.size()));
//         op.remove(op.size()-1);
//         allSubsets(op,ip.subList(1,ip.size()));
//         return res;
//     }
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         List<Integer> ip=new ArrayList<Integer>();
//         List<Integer> op=new ArrayList<Integer>();
//         Arrays.sort(nums);
//         for(int num:nums) 
//             ip.add(num);
//         return allSubsets(op,ip);
//     }
// }

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<1<<nums.length;i++){
            List<Integer> al=new ArrayList<Integer>();
            for(int j=0;j<nums.length;j++){
                if((i&1<<j)!=0)
                    al.add(nums[j]);
            }
            if(res.contains(new ArrayList<Integer>(al))==false)
                res.add(new ArrayList<Integer>(al));
            al.clear();
        }
        return res;
    }
}