class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] count=new int[100001];
        Arrays.fill(count,-1);
        for(int[] m:matches){
            if(count[m[0]]==-1)
                count[m[0]]++;
            if(count[m[1]]==-1)
                count[m[1]]=1;
            else
                count[m[1]]++;
        }
        List<List<Integer>> ans=Arrays.asList(new ArrayList<Integer>(), new ArrayList<Integer>());
        for(int i=0;i<count.length;i++){
            if(count[i]==0)
                ans.get(0).add(i);
            else if(count[i]==1)
                ans.get(1).add(i);
        }
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}