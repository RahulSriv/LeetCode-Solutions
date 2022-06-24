class Solution {
    public boolean isPossible(int[] target) {
        if(target.length==1)
            return target[0]==1;
        Queue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        int sum=0;
        for(int x:target){
            sum+=x;
            pq.add(x);
        }
        while(pq.peek()!=1){
            int curr=pq.poll();
            if(sum-curr==1)
                return true;
            int y=curr%(sum-curr);
            sum=sum-curr+y;
            if(y==0 || y==curr)
                return false;
            else
                pq.add(y);
        }
        return true;
    }
}