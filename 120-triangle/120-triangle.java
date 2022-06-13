class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] res=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                res[i][j]=triangle.get(i).get(j)+Math.min(res[i+1][j],res[i+1][j+1]);
            }
        }
        return res[0][0];
    }
}

// Works for only positive numbers probably
// List<Integer> t=triangle.get(0);
//         int res=t.get(0), j=0;
//         for(int i=1;i<triangle.size();i++){
//             t=triangle.get(i);
//             if(t.get(j)<t.get(j+1)){
//                 res+=t.get(j);
//             }
//             else{
//                 j++;
//                 res+=t.get(j);
//             }
//         }
//         return res;