class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int t=0,i=0,j=0,n=nums.length;
        int[] res=new int[n-k+1];
        Deque<Integer> qu=new ArrayDeque<Integer>();
        while(j<n){
            while(!qu.isEmpty() && qu.peekLast()<nums[j]){
                qu.removeLast();
            }
            qu.add(nums[j]);
            if(j-i+1==k){
                res[t++]=qu.peek();
                if(qu.peek()==nums[i]){
                    qu.remove(nums[i]);
                }
                i++;
            }
            j++;
        }
        return res;
    }
}