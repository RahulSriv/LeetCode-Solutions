class Solution {
    public int countPairs(int[] nums, int k) {
        int ct=0;
        Map<Integer, List<Integer>> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> al;
            if(!m.containsKey(nums[i])){
                al=new ArrayList<Integer>();
            }
            else{
                al=m.get(nums[i]);
                for(Integer j:al)
                    if(i*j%k==0)
                        ct++;
            }
            al.add(i);
            m.put(nums[i],al);
        }
        return ct;
    }
}