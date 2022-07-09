class Solution {
    public int maxResult(int[] nums, int k) {
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(0);
        for(int i=1;i<nums.length;i++){
            if(l.getFirst()<i-k) 
                l.removeFirst();
            nums[i]+=nums[l.getFirst()];
            while(!l.isEmpty()&&nums[l.getLast()]<=nums[i]) 
                l.removeLast();
            l.addLast(i);
        }
        return nums[nums.length-1];
    }
}