class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0, res=0;
        HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
        m.put(sum,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(m.containsKey(sum-k))
                res+=m.get(sum-k);
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return res;
    }
}