class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int[] res=new int[queries.length];
        int y=0;
        List<Integer> al=new ArrayList<Integer>();
        List<Integer> al2=new ArrayList<Integer>();
        while(n>0){
            int x=(int)n%2;
            al.add(x);
            n/=2;
        }
        for(int i=0;i<al.size();i++){
            if(al.get(i)==1){
                int r=(int)Math.pow(2,i);
                al2.add(r);
            }
        }
        int d=1000000007;
        for(int[] query:queries){
            long a=1;
            for(int i=query[0];i<=query[1];i++){
                a=(long)((a*al2.get(i))%d);
            }
            res[y]=(int)a%d;
            y++;
        }
        return res;
    }
}